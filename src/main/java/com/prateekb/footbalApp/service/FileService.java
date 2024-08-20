package com.prateekb.footbalApp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.File;

/*
Use InputStream for reading data from file present inside the JAR file
since classpath is not available on JAR file
 */

@Service
public class FileService {
    @Autowired
    private ResourceLoader loader;
    @Autowired
    private ObjectMapper objectMapper;

    public <T> T getModelResponse(String fileName, Class<T> classType) {
        T modelResponse = null;
        try{
            Resource resource = loader.getResource("classpath:samples/" + fileName);
            File file = resource.getFile();
            modelResponse = objectMapper.readValue(file, classType);
        } catch (Exception e) {
            System.out.println("Exception occured while parsing file" + e.getMessage());
        }
        return modelResponse;
    }
}
