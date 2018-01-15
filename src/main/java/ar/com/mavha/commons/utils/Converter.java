package ar.com.mavha.commons.utils;

import org.modelmapper.ModelMapper;

/**
 *
 * @author Paulo Cesar Canale
 */
public class Converter {

    /**
     * 
     * @param <COR>
     * @param classOfObjectResult
     * @param objectToMap
     * @return 
     */
    public static <COR> COR map(Class<COR> classOfObjectResult, Object objectToMap) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(objectToMap, classOfObjectResult);
        // agregro un comentario -----
        
    }

}
