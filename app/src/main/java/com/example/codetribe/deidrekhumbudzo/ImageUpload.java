package com.example.codetribe.deidrekhumbudzo;

/**
 * Created by codetribe on 8/1/2017.
 */


public class ImageUpload {

    public String name;
    public String url;
    public String description;
    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public ImageUpload(String name, String url, String description) {
        this.name = name;
        this.url = url;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public ImageUpload(){}
}
