/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.stopdoing;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Eugen
 */
public class TaskUtil {

    public static String getTimeDifferenceInMinutes(Task task) {
        LocalDateTime dateTime1 = task.startTime;
        LocalDateTime dateTime2 = task.endTime;
        long diffInMinutes = Duration.between(dateTime1, dateTime2).toMinutes();
        
        return "Difference in Minutes: " + diffInMinutes;
    }
}
