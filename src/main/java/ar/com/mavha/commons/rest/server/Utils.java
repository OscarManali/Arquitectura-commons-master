package ar.com.mavha.commons.rest.server;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

/**
 *
 * 
 */
public class Utils {

    /**
     * Extraer parámetros del query
     * @param uriInfo
     * @return Map<String, String>
     */
    public static Map<String, String> extractQueryParameters(UriInfo uriInfo) {
        Map<String, String> result = new HashMap<>();
        MultivaluedMap<String, String> queryParameters = uriInfo.getQueryParameters();
        queryParameters.entrySet().forEach((entry) -> {
            result.put(entry.getKey(), entry.getValue().get(0));
        });
        return result;
    }
}
