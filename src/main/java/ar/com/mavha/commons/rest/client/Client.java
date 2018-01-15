package ar.com.mavha.commons.rest.client;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Cesar Canale
 */
public class Client {

    /**
     * Funcional interface de resultados asincronicos
     *
     * @param <T> Type inference
     */
    public interface AsyncResponse<T> {

        /**
         * Método a implementar para obtener el resultado
         *
         * @param t T
         */
        public void getAsyncResponse(T t);
    }

    /**
     * {@value #DEFAULT_TIMEOUT} Tiempo de espera predeterminado (60000
     * MILLISECONDS)
     */
    public static final long DEFAULT_TIMEOUT = 60000;
    /**
     * {@value #INFINITE_TIMEOUT} Tiempo de espera infinito.
     */
    public static final long INFINITE_TIMEOUT = 0;
    // The timeout until a connection with the server is established (in milliseconds). Default is 10000. Set to zero to disable the timeout.
    private static final long CONNECTION_TIMEOUT = 10000;
    // The timeout to receive data (in milliseconds). Default is 60000. Set to zero to disable the timeout.
    private static final long SOCKET_TIMEOUT = 60000;
    // Defines the overall connection limit for a connection pool. Default is 200.
    private static final int MAX_TOTAL = 200;
    // Defines a connection limit per one HTTP route (this can be considered a per target host limit). Default is 20.
    private static final int MAX_PER_ROUTE = 20;

    static {
        Unirest.setObjectMapper(getObjectMapper());
        Unirest.setConcurrency(MAX_TOTAL, MAX_PER_ROUTE);
        Unirest.setTimeouts(CONNECTION_TIMEOUT, SOCKET_TIMEOUT);
    }

    public Client() {
    }

    public static void main(String[] args) {
        System.out.println("Antes de mandar");
        Client.postFileAsync("http://url ....", "/../filePath.../loquesea.loquesea", HashMap.class, 60000L, (t) -> {
        	System.out.println("Ya se llego y esta todo ok");
        });
        System.out.println("Ya se mando");
    }
    
    
    /**
     * Método HTTP GET sincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param responseClass Clase a serializar el resultado.
     * @return Instancia de la clase responseClass o null si existe excepción en
     * la invocacion.
     */
    public static <T> T get(String url, Class<T> responseClass) {
        return get(url, null, null, responseClass);
    }

    /**
     * Método HTTP GET sincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param parameters Query parameters.
     * @param responseClass Clase a serializar el resultado.
     * @return Instancia de la clase responseClass o null si existe excepción en
     * la invocacion.
     */
    public static <T> T get(String url, Map<String, Object> parameters, Class<T> responseClass) {
        return get(url, null, parameters, responseClass);
    }

    /**
     * Método HTTP GET sincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param headers Headers HTTP.
     * @param parameters Query parameters.
     * @param responseClass Clase a serializar el resultado.
     * @return Instancia de la clase responseClass o null si existe excepción en
     * la invocacion.
     */
    public static <T> T get(String url, Map<String, String> headers, Map<String, Object> parameters, Class<T> responseClass) {
        try {
            if (headers != null && parameters != null) {
                return Unirest.get(url).headers(headers).queryString(parameters).asObject(responseClass).getBody();
            } else if (headers != null) {
                return Unirest.get(url).headers(headers).asObject(responseClass).getBody();
            } else if (parameters != null) {
                return Unirest.get(url).queryString(parameters).asObject(responseClass).getBody();
            } else {
                return Unirest.get(url).asObject(responseClass).getBody();
            }
        } catch (UnirestException exception) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, exception);
        }
        return null;
    }

    /**
     * Método HTTP GET asincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param responseClass Clase a serializar el resultado.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void getAsync(String url, Class<T> responseClass, AsyncResponse<T> asyncResponse) {
        getAsync(url, null, null, responseClass, Client.DEFAULT_TIMEOUT, asyncResponse);
    }

    /**
     * Método HTTP GET asincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param parameters Query parameters.
     * @param responseClass Clase a serializar el resultado.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void getAsync(String url, Map<String, Object> parameters, Class<T> responseClass, AsyncResponse<T> asyncResponse) {
        getAsync(url, null, parameters, responseClass, Client.DEFAULT_TIMEOUT, asyncResponse);
    }

    /**
     * Método HTTP GET asincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param headers Headers HTTP.
     * @param parameters Query parameters.
     * @param responseClass Clase a serializar el resultado.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void getAsync(String url, Map<String, String> headers, Map<String, Object> parameters, Class<T> responseClass, AsyncResponse<T> asyncResponse) {
        getAsync(url, headers, parameters, responseClass, Client.DEFAULT_TIMEOUT, asyncResponse);
    }

    /**
     * Método HTTP GET asincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param responseClass Clase a serializar el resultado.
     * @param timeout Timeout in milliseconds: Constantes predefinidas
     * Client.INFINITE_TIMEOUT y Client.DEFAULT_TIMEOUT.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void getAsync(String url, Class<T> responseClass, Long timeout, AsyncResponse<T> asyncResponse) {
        getAsync(url, null, null, responseClass, timeout, asyncResponse);
    }

    /**
     * Método HTTP GET asincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param parameters Query parameters.
     * @param responseClass Clase a serializar el resultado.
     * @param timeout Timeout in milliseconds: Constantes predefinidas
     * Client.INFINITE_TIMEOUT y Client.DEFAULT_TIMEOUT.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void getAsync(String url, Map<String, Object> parameters, Class<T> responseClass, Long timeout, AsyncResponse<T> asyncResponse) {
        getAsync(url, null, parameters, responseClass, timeout, asyncResponse);
    }

    /**
     * Método HTTP GET asincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param headers Headers HTTP.
     * @param parameters Query parameters.
     * @param responseClass Clase a serializar el resultado.
     * @param timeout Timeout in milliseconds: Constantes predefinidas
     * Client.INFINITE_TIMEOUT y Client.DEFAULT_TIMEOUT.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void getAsync(String url, Map<String, String> headers, Map<String, Object> parameters, Class<T> responseClass, Long timeout, AsyncResponse<T> asyncResponse) {
        if (timeout != null && timeout != Client.DEFAULT_TIMEOUT) {
            // Estrategia asincrónico future -> completableFuture
            Future<HttpResponse<T>> future = null;
            if (headers != null && parameters != null) {
                future = Unirest.get(url).headers(headers).queryString(parameters).asObjectAsync(responseClass);
            } else if (headers != null) {
                future = Unirest.get(url).headers(headers).asObjectAsync(responseClass);
            } else if (parameters != null) {
                future = Unirest.get(url).queryString(parameters).asObjectAsync(responseClass);
            } else {
                future = Unirest.get(url).asObjectAsync(responseClass);
            }
            CompletableFuture<HttpResponse<T>> makeCompletableFuture = makeCompletableFuture(future, timeout);
            makeCompletableFuture.thenAcceptAsync((u) -> {
                asyncResponse.getAsyncResponse(u.getBody());
            });
        } else {
            // Estrategia asincrónico future -> Callback
            if (headers != null && parameters != null) {
                Unirest.get(url).headers(headers).queryString(parameters).asObjectAsync(responseClass, makeCallback(asyncResponse));
            } else if (headers != null) {
                Unirest.get(url).headers(headers).asObjectAsync(responseClass, makeCallback(asyncResponse));
            } else if (parameters != null) {
                Unirest.get(url).queryString(parameters).asObjectAsync(responseClass, makeCallback(asyncResponse));
            } else {
                Unirest.get(url).asObjectAsync(responseClass, makeCallback(asyncResponse));
            }
        }
    }

    /**
     * Método HTTP POST sincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param body Objeto a serializar y enviar.
     * @param responseClass Clase a serializar el resultado.
     * @return Instancia de la clase responseClass o null si existe excepción en
     * la invocacion.
     */
    public static <T> T post(String url, Object body, Class<T> responseClass) {
        return post(url, null, body, responseClass);
    }

    /**
     * Método HTTP POST sincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param headers Headers HTTP.
     * @param body Objeto a serializar y enviar.
     * @param responseClass Clase a serializar el resultado.
     * @return Instancia de la clase responseClass o null si existe excepción en
     * la invocacion.
     */
    public static <T> T post(String url, Map<String, String> headers, Object body, Class<T> responseClass) {
        try {
            if (headers != null) {
                return Unirest.post(url).headers(headers).body(body).asObject(responseClass).getBody();
            } else {
                return Unirest.post(url).body(body).asObject(responseClass).getBody();
            }
        } catch (UnirestException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * Método HTTP POST asincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param body Objeto a serializar y enviar.
     * @param responseClass Clase a serializar el resultado.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void postAsync(String url, Object body, Class<T> responseClass, AsyncResponse<T> asyncResponse) {
        postAsync(url, null, body, responseClass, Client.INFINITE_TIMEOUT, asyncResponse);
    }

    /**
     * Método HTTP POST asincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param headers Headers HTTP.
     * @param body Objeto a serializar y enviar.
     * @param responseClass Clase a serializar el resultado.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void postAsync(String url, Map<String, String> headers, Object body, Class<T> responseClass, AsyncResponse<T> asyncResponse) {
        postAsync(url, headers, body, responseClass, Client.INFINITE_TIMEOUT, asyncResponse);
    }

    /**
     * Método HTTP POST asincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param body Objeto a serializar y enviar.
     * @param responseClass Clase a serializar el resultado.
     * @param timeout Timeout in milliseconds: Constantes predefinidas
     * Client.INFINITE_TIMEOUT y Client.DEFAULT_TIMEOUT.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void postAsync(String url, Object body, Class<T> responseClass, Long timeout, AsyncResponse<T> asyncResponse) {
        postAsync(url, null, body, responseClass, timeout, asyncResponse);
    }

    /**
     * Método HTTP POST asincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param headers Headers HTTP.
     * @param body Objeto a serializar y enviar.
     * @param responseClass Clase a serializar el resultado.
     * @param timeout Timeout in milliseconds: Constantes predefinidas
     * Client.INFINITE_TIMEOUT y Client.DEFAULT_TIMEOUT.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void postAsync(String url, Map<String, String> headers, Object body, Class<T> responseClass, Long timeout, AsyncResponse<T> asyncResponse) {

        if (timeout != null && timeout != Client.DEFAULT_TIMEOUT) {
            // Estrategia asincrónico future -> completableFuture
            Future<HttpResponse<T>> future = null;
            if (headers != null) {
                future = Unirest.post(url).headers(headers).body(body).asObjectAsync(responseClass);
            } else {
                future = Unirest.post(url).body(body).asObjectAsync(responseClass);
            }
            CompletableFuture<HttpResponse<T>> makeCompletableFuture = makeCompletableFuture(future, timeout);
            makeCompletableFuture.thenAcceptAsync((u) -> {
                asyncResponse.getAsyncResponse(u.getBody());
            });
        } else {
            // Estrategia asincrónico future -> Callback
            if (headers != null) {
                Unirest.post(url).headers(headers).body(body).asObjectAsync(responseClass, makeCallback(asyncResponse));
            } else {
                Unirest.post(url).body(body).asObjectAsync(responseClass, makeCallback(asyncResponse));
            }
        }
    }

    /**
     * Método HTTP DELETE sincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param responseClass Clase a serializar el resultado.
     * @return Instancia de la clase responseClass o null si existe excepción en
     * la invocacion.
     */
    public static <T> T delete(String url, Class<T> responseClass) {
        return delete(url, null, responseClass);
    }

    /**
     * Método HTTP DELETE sincrónico.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param headers Headers HTTP.
     * @param responseClass Clase a serializar el resultado.
     * @return Instancia de la clase responseClass o null si existe excepción en
     * la invocacion.
     */
    public static <T> T delete(String url, Map<String, String> headers, Class<T> responseClass) {
        try {
            if (headers != null) {
                return Unirest.delete(url).headers(headers).asObject(responseClass).getBody();
            } else {
                return Unirest.get(url).asObject(responseClass).getBody();
            }
        } catch (UnirestException exception) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, exception);
        }
        return null;
    }

    /**
     * Método HTTP POST asincrónico, Source path post file.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param filePath Path del archivo
     * @param responseClass Clase a serializar el resultado.
     * @param timeout Timeout in milliseconds: Constantes predefinidas
     * Client.INFINITE_TIMEOUT y Client.DEFAULT_TIMEOUT.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void postFileAsync(String url, String filePath, Class<T> responseClass, Long timeout, AsyncResponse<T> asyncResponse) {
        postFileAsync(url, null, filePath, responseClass, timeout, asyncResponse);
    }

    /**
     * Método HTTP POST asincrónico, Source path post file.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param headers Headers HTTP.
     * @param filePath Path del archivo
     * @param responseClass Clase a serializar el resultado.
     * @param timeout Timeout in milliseconds: Constantes predefinidas
     * Client.INFINITE_TIMEOUT y Client.DEFAULT_TIMEOUT.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void postFileAsync(String url, Map<String, String> headers, String filePath, Class<T> responseClass, Long timeout, AsyncResponse<T> asyncResponse) {
        if (timeout != null && timeout != Client.DEFAULT_TIMEOUT) {
            // Estrategia asincrónico future -> completableFuture
            Future<HttpResponse<T>> future = null;
            if (headers != null) {
                future = Unirest.post(url).headers(headers).field("file", new File(filePath)).asObjectAsync(responseClass);
            } else {
                future = Unirest.post(url).field("file", new File(filePath)).asObjectAsync(responseClass);
            }
            CompletableFuture<HttpResponse<T>> makeCompletableFuture = makeCompletableFuture(future, timeout);
            makeCompletableFuture.thenAcceptAsync((u) -> {
                asyncResponse.getAsyncResponse(u.getBody());
            });
        } else {
            // Estrategia asincrónico future -> Callback
            if (headers != null) {
                Unirest.post(url).headers(headers).field("file", new File(filePath)).asObjectAsync(responseClass, makeCallback(asyncResponse));
            } else {
                Unirest.post(url).field("file", new File(filePath)).asObjectAsync(responseClass, makeCallback(asyncResponse));
            }
        }
    }

    /**
     * Método HTTP POST asincrónico, Source inputStream post Byte Stream.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param stream InputStream Source
     * @param fileName Nombre del archivo
     * @param responseClass Clase a serializar el resultado.
     * @param timeout Timeout in milliseconds: Constantes predefinidas
     * Client.INFINITE_TIMEOUT y Client.DEFAULT_TIMEOUT.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void postBytesAsync(String url, final InputStream stream, String fileName, Class<T> responseClass, Long timeout, AsyncResponse<T> asyncResponse) {
        postBytesAsync(url, null, stream, fileName, responseClass, timeout, asyncResponse);
    }

    /**
     * Método HTTP POST asincrónico, Source inputStream post Byte Stream.
     *
     * @param <T> Type inference.
     * @param url URL del host remoto.
     * @param headers Headers HTTP.
     * @param stream InputStream Source
     * @param fileName Nombre del archivo
     * @param responseClass Clase a serializar el resultado.
     * @param timeout Timeout in milliseconds: Constantes predefinidas
     * Client.INFINITE_TIMEOUT y Client.DEFAULT_TIMEOUT.
     * @param asyncResponse Funcional interface de resultados asincronicos,
     * ejemplo lambda ((r) -> { ... usar resultado })
     */
    public static <T> void postBytesAsync(String url, Map<String, String> headers, final InputStream stream, String fileName, Class<T> responseClass, Long timeout, AsyncResponse<T> asyncResponse) {
        try {
            final byte[] bytes = new byte[stream.available()];
            stream.read(bytes);
            stream.close();
            if (timeout != null && timeout != Client.DEFAULT_TIMEOUT) {
                // Estrategia asincrónico future -> completableFuture
                Future<HttpResponse<T>> future = null;
                if (headers != null) {
                    future = Unirest.post(url).headers(headers).field("file", bytes, fileName).asObjectAsync(responseClass);
                } else {
                    future = Unirest.post(url).field("file", bytes, fileName).asObjectAsync(responseClass);
                }
                CompletableFuture<HttpResponse<T>> makeCompletableFuture = makeCompletableFuture(future, timeout);
                makeCompletableFuture.thenAcceptAsync((u) -> {
                    asyncResponse.getAsyncResponse(u.getBody());
                });
            } else {
                // Estrategia asincrónico future -> Callback
                if (headers != null) {
                    Unirest.post(url).headers(headers).field("file", bytes, fileName).asObjectAsync(responseClass, makeCallback(asyncResponse));
                } else {
                    Unirest.post(url).field("file", bytes, fileName).asObjectAsync(responseClass, makeCallback(asyncResponse));
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Convertidor de json a objeto y viceversa vice versa
     *
     * @return com.mashape.unirest.http.ObjectMapper
     */
    private static com.mashape.unirest.http.ObjectMapper getObjectMapper() {
        return new com.mashape.unirest.http.ObjectMapper() {
            private final com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper = new com.fasterxml.jackson.databind.ObjectMapper();

            @Override
            public <T> T readValue(String value, Class<T> valueType) {
                try {
                    return jacksonObjectMapper.readValue(value, valueType);
                } catch (IOException exception) {
                    throw new RuntimeException(exception);
                }
            }

            @Override
            public String writeValue(Object value) {
                try {
                    return jacksonObjectMapper.writeValueAsString(value);
                } catch (JsonProcessingException exception) {
                    throw new RuntimeException(exception);
                }
            }
        };
    }

    /**
     * Future to CompletableFuture Un thread se bloqueará timeout para esperar
     * el resultado del futuro
     *
     * @param <T> Type inference
     * @param future Future<T>
     * @param timeout timeout in milliseconds
     * @return CompletableFuture<T>
     */
    private static <T> CompletableFuture<T> makeCompletableFuture(Future<T> future, long timeout) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return future.get(timeout, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException exception) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, exception);
            }
            return null;
        });
    }

    /**
     * AsyncResponse to Callback
     *
     * @param <T> Type inference
     * @param asyncResponse AsyncResponse
     * @return Callback<T>
     */
    private static <T> Callback<T> makeCallback(AsyncResponse asyncResponse) {
        return new Callback<T>() {
            @Override
            public void completed(HttpResponse<T> response) {
                asyncResponse.getAsyncResponse(response.getBody());
            }

            @Override
            public void failed(UnirestException exception) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, exception);
                asyncResponse.getAsyncResponse(null);
            }

            @Override
            public void cancelled() {
                Logger.getLogger(Client.class.getName()).log(Level.INFO, "Response has been canceled");
                asyncResponse.getAsyncResponse(null);
            }
        };
    }

}
