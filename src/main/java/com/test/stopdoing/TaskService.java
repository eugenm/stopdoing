/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.stopdoing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eugen
 */
class TaskService {

    public void start(Task task) {
        LocalDateTime now = LocalDateTime.now();
        task.setStartTime(now);
    }

    public void stop(Task task) {
        LocalDateTime now = LocalDateTime.now();
        task.setEndTime(now);
    }
}
