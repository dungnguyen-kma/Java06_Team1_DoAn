package com.actvn.java06;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class DailyTicket extends Ticket {

    private String timeSlotID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private double dailyPrice;

    public DailyTicket() {
    }

    public DailyTicket(String ticketID, int age, String isTicketVip, String timeSlotID, LocalDateTime startTime, LocalDateTime endTime, double dailyPrice) {
        super(ticketID, age, isTicketVip);
        this.timeSlotID = timeSlotID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.dailyPrice = dailyPrice;
    }


    public String getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(String timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "DailyTicket{" + "timeSlotID= " + timeSlotID + ", startTime= " + startTime + ", endTime= " + endTime + ", dailyPrice= " + Math.round(dailyPrice) + ", ticketID= " + super.getTicketID() + ", age= " + super.getAge() + ", VIP or Nomal= " + checkIsTicketVip() + '}';
    }

    @Override
    public String creatTicketID(int index) {
        super.setTicketID(String.format("DAY - " + "%03d", index));
        return super.getTicketID();
    }

    public String checkTimeSlotID() {
        LocalTime now = LocalTime.now();
        int partOfTheDay = now.getHour();
        if (partOfTheDay >= 7 && partOfTheDay <= 11) {
            return "SANG";
        } else if (partOfTheDay >= 13 && partOfTheDay <= 17) {
            return "CHIEU";
        } else {
            return "TOI";
        }
    }

    public String checkIsTicketVip() {
        if (super.getIsTicketVip().equalsIgnoreCase("N")) {
            return "NORMAL";
        } else {
            return "VIP";
        }
    }

    public String checkStartTime(LocalDateTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        String str = time.format(formatter);
        return str;
    }

    public String checkEndTime(LocalDateTime time) {
        if (checkTimeSlotID().equals("SANG")) {
            this.setEndTime(time.withHour(10).withMinute(00).withSecond(00));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
            String str = this.getEndTime().format(formatter);
            return str;
        } else if (checkTimeSlotID().equals("CHIEU")) {
            this.setEndTime(time.withHour(17).withMinute(30).withSecond(00));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
            String str = this.getEndTime().format(formatter);
            return str;
        } else {
            this.setEndTime(time.withHour(22).withMinute(00).withSecond(00));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
            String str = this.getEndTime().format(formatter);
            return str;
        }
    }

    public double caculatorDailyPrice() {
        setDailyPrice(40000);
        if (getIsTicketVip().equalsIgnoreCase("VIP")) {
            this.dailyPrice += 20000;
        }
        if (super.getAge() >= 3 && super.getAge() <= 12) {
            this.dailyPrice -= 15000;
        }
        return getDailyPrice();
    }

    public String writeCSV() {
        String str = String.format("%s,%d,%s,%s,%s,%s,%.0f\n", super.getTicketID(), super.getAge(), super.getIsTicketVip(), getTimeSlotID(), getStartTime().toString(), getEndTime().toString(), getDailyPrice());
        return str;
    }
}
