package com.actvn.java06;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

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

    public DailyTicket(String ticketID, int age, String isTicketVip) {
        super(ticketID, age, isTicketVip);
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
    public String toString() {
        return "DailyTicket{" + "timeSlotID=" + timeSlotID + ", startTime=" + startTime + ", dailyPrice=" + dailyPrice + '}';
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
    public String creatTicketID() {
        //chưa làm xong
        LocalTime startDay = LocalTime.MIDNIGHT;
        super.setTicketID("DAY-001");
        String subString = getTicketID().substring(4, 7);
        int number = Integer.parseInt(subString);
        System.out.println(number);
        number += 1;
        super.setTicketID(String.format("DAY-" + "%03d", number));
        int quatity = startDay.getHour();
        if (quatity == 23) {
            super.setTicketID("DAY-001");
        }
        /*int quatity = 3;
        int[] array = new int[quatity];
        for(int )*/
        return null;
    }

    public String checkTimeSlotID() {
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

    /*public  String checkIsTicketVip() {
        if (super.getIsTicketVip().equals("N")) {
            return "NORMAL";
        } else if (super.getIsTicketVip().equals("Y")) {
            return "VIP";
        } else {
            return null;
        }
    }*/
    public LocalDate checkStartTime() {
        this.setStartTime(LocalDate.now());
        return this.getStartTime();
    }

    public double caculatorDailyPrice() {
        setDailyPrice(40000);
        if (getIsTicketVip().equals("Y")) {
            this.dailyPrice += 20000;
        }
        if (getAge() >= 3 && getAge() <= 12) {
            this.dailyPrice -= 15000;
        }
        return getDailyPrice();
    }
}
