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

    public DailyTicket(String ticketID, int age, String isTicketVip) {
        super(ticketID, age, isTicketVip);
    }

    public DailyTicket(String timeSlotID, LocalDateTime startTime, LocalDateTime endTime, double dailyPrice, String ticketID, int age, String isTicketVip) {
        super(ticketID, age, isTicketVip);
        this.timeSlotID = timeSlotID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.dailyPrice = dailyPrice;
    }

    public DailyTicket(String timeSlotID, LocalDateTime startTime, LocalDateTime endTime, double dailyPrice) {
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
        return "DailyTicket{" + "timeSlotID= " + timeSlotID + ", startTime= " + startTime + ", dailyPrice= " + dailyPrice + ", ticketID= " + super.getTicketID() + ", age= " + super.getAge() + ", VIP or Nomal= " + checkIsTicketVip() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.timeSlotID);
        hash = 83 * hash + Objects.hashCode(this.startTime);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.dailyPrice) ^ (Double.doubleToLongBits(this.dailyPrice) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DailyTicket other = (DailyTicket) obj;
        if (Double.doubleToLongBits(this.dailyPrice) != Double.doubleToLongBits(other.dailyPrice)) {
            return false;
        }
        if (!Objects.equals(this.timeSlotID, other.timeSlotID)) {
            return false;
        }
        return Objects.equals(this.startTime, other.startTime);
    }

    @Override
    public String creatTicketID(int index) {
        LocalTime startDay = LocalTime.MIDNIGHT;
        int quatity = startDay.getHour();
        if (quatity == 23) {
            index = 1;
        }
        index += 1;
        super.setTicketID(String.format("DAY-" + "%03d", index));
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

    public LocalDateTime checkStartTime() {
        this.setStartTime(LocalDateTime.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        String str = this.getStartTime().format(formatter);
        LocalDateTime date = LocalDateTime.parse(str);
        return date;
    }

    public LocalDateTime checkEndTime() {
        if (checkTimeSlotID().equals("SANG")) {
            this.setEndTime(LocalDateTime.now().withHour(10).withMinute(00).withMinute(00));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
            String str = this.getStartTime().format(formatter);
            LocalDateTime date = LocalDateTime.parse(str);
            return date;
        } else if (checkTimeSlotID().equals("CHIEU")) {
            this.setEndTime(LocalDateTime.now().withHour(17).withMinute(30).withMinute(00));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
            String str = this.getStartTime().format(formatter);
            LocalDateTime date = LocalDateTime.parse(str);
            return date;
        } else {
            this.setEndTime(LocalDateTime.now().withHour(22).withMinute(00).withMinute(00));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
            String str = this.getStartTime().format(formatter);
            LocalDateTime date = LocalDateTime.parse(str);
            return date;
        }
    }

    public double caculatorDailyPrice() {
        setDailyPrice(40000);
        if (getIsTicketVip().equalsIgnoreCase("V")) {
            this.dailyPrice += 20000;
        }
        if (super.getAge() >= 3 && super.getAge() <= 12) {
            this.dailyPrice -= 15000;
        }
        return getDailyPrice();
    }

}
