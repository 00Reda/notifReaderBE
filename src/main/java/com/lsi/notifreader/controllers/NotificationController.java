package com.lsi.notifreader.controllers;


import com.lsi.notifreader.entities.Notification;
import com.lsi.notifreader.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
public class NotificationController {
    @Autowired
    private NotificationRepository notificationRepository;


    @RequestMapping(value = "notification",method = RequestMethod.GET)
    public List<Notification> list(){
        return notificationRepository.findAll();
    }


}
