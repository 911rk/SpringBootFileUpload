package com.utility.fileUpload.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class FileStorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "uploaded_file";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
