package com.example.designpatterns.behavioral.observer.notifiers;

import com.example.designpatterns.behavioral.observer.base.Observer;
import com.example.designpatterns.behavioral.observer.base.Subject;
import com.example.designpatterns.behavioral.observer.base.VideoData;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailNotifier extends Observer {
    public EmailNotifier(Subject subject){
        this.subject = subject;
        this.subject.attachObserver(this);
    }
    @Override
    public void notify(Subject subject, Object arg) {
        if (subject instanceof VideoData videoData){
            log.info("Notify all subscribers via EMAIL: Name {}, Description {}, File name {}",
                    videoData.getTitle(), videoData.getDescription(), videoData.getFileName());
        }
    }
}
