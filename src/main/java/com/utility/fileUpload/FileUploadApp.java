package com.utility.fileUpload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.utility.fileUpload.storage.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(FileStorageProperties.class)
public class FileUploadApp {

    public static void main(String[] args) {
        SpringApplication.run(FileUploadApp.class, args);
    }
}
