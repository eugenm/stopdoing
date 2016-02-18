/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.stopdoing;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Eugen
 */
public class Task {

    String name = "";
    LocalDateTime startTime = null;
    LocalDateTime endTime = null;

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
