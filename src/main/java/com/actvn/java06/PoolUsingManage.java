/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;

import java.time.LocalDateTime;

/**
 *
 * @author DELL
 */
public class PoolUsingManage {
    public String ticketID;
    public String timeSlotID;
    public LocalDateTime startTime;
    public void showProcess(){
        DailyTicket dailyticket = new DailyTicket();
        timeSlotID = dailyticket.getTimeSlotID();
        TimeSlotManage timeslotmanage = new TimeSlotManage();
        ticketID = timeslotmanage.getTicketID();
        startTime = timeslotmanage.getStartTime();
        System.out.println("Ma Ve:"+ticketID);
        System.out.println("Khung Gio:"+timeSlotID);
        System.out.println("Gio Bat Dau:"+startTime);
    }
}
