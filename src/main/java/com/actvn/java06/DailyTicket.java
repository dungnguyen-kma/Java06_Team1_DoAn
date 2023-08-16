/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author PC- FPTSHOP
 */
public class DailyTicket extends Ticket {

    private String timeSlotID;
    private LocalDate startTime;
    private double dailyPrice;

    public DailyTicket() {
    }

    public DailyTicket(String timeSlotID, LocalDate startTime, double dailyPrice) {
        this.timeSlotID = timeSlotID;
        this.startTime = startTime;
        this.dailyPrice = dailyPrice;
    }

    public DailyTicket(String timeSlotID, LocalDate startTime, double dailyPrice, String ticketID, int age, String isTicketVip) {
        super(ticketID, age, isTicketVip);
        this.timeSlotID = timeSlotID;
        this.startTime = startTime;
        this.dailyPrice = dailyPrice;
    }

    public String getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(String timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    @Override
    public String creatTicketID() {
        LocalTime startDay = LocalTime.MIDNIGHT;
        super.setTicketID("DAY-001");
        int quatity = startDay.getHour();
        if (quatity == 23) {
            super.setTicketID("DAY-001");
        }
        return null;
    }

    /*public String checkTimeSlotID() {
        LocalTime now = LocalTime.now();
        int partOfTheDay = now.getHour();
        if (partOfTheDay >= 7 && partOfTheDay <= 11) {
            return "SANG";
        } else if (partOfTheDay >= 13 && partOfTheDay <= 17) {
            return "CHIEU";
        } else if (partOfTheDay >= 18 && partOfTheDay <= 21) {
            return "TOI";
        } else {
            return null;
        }
    }

    public String checkIsTicketVip() {
        if (super.getIsTicketVip().equals("N")) {
            return "NORMAL";
        } else if (super.getIsTicketVip().equals("Y")) {
            return "VIP";
        } else {
            return null;
        }
    }

    public LocalDate checkStartTime() {
        LocalDate date = LocalDate.now();
        startTime = date;
        return startTime;
    }

    public double caculatorDailyPrice() {
        dailyPrice = 40000;
        if (getIsTicketVip().equals("Y")) {
            dailyPrice += 20000;
        }
        if (getAge() >= 3 && getAge() <= 12) {
            dailyPrice -= 15000;
        }
        return dailyPrice;
    }*/

}
