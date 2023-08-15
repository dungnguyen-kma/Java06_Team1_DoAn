/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;

import java.time.LocalDateTime;

/**
 *
 * @author PC- FPTSHOP
 */
public class TimeSlotManage extends DailyTicket {

    public TimeSlotManage() {
    }

    public TimeSlotManage(String timeSlotID, String ticketID, LocalDateTime registereDate) {
        super(timeSlotID, ticketID, registereDate);
    }
    public LocalDateTime startTime;
    public LocalDateTime endTime;
    public double dailyPrice;

    public TimeSlotManage(LocalDateTime startTime, LocalDateTime endTime, double dailyPrice, String ticketID, LocalDateTime registereDate) {
        super(ticketID, registereDate);
        this.startTime = startTime;
        this.endTime = endTime;
        this.dailyPrice = dailyPrice;
    }

    public TimeSlotManage(LocalDateTime startTime, LocalDateTime endTime, double dailyPrice, String timeSlotID, String ticketID, LocalDateTime registereDate) {
        super(timeSlotID, ticketID, registereDate);
        this.startTime = startTime;
        this.endTime = endTime;
        this.dailyPrice = dailyPrice;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

}
