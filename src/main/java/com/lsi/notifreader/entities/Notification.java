package com.lsi.notifreader.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String subject;
    @Column(length = 1500)
    private String content;
    private String date;
    private boolean seen = false;


}
