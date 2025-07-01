package com.example.designpatterns.behavioral.observer.base;

import lombok.Data;

@Data
public class VideoData extends Subject{
    private String title;
    private String description;
    private String fileName;
    public void setTitle(String title) {
        this.title = title;
        this.videoDataChanged();
    }
    public void setDescription(String description) {
        this.description = description;
        this.videoDataChanged();
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
        this.videoDataChanged();
    }

    private void videoDataChanged(){
        this.notifyObservers(this, null);
    }
}
