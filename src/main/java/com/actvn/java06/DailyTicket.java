/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.Java06_Team1_DoAn;

import java.time.LocalDateTime;

/**
 *
 * @author PC- FPTSHOP
 */
public class DailyTicket extends Ticket {

    public String timeSlotID;

    public DailyTicket(String ticketID, LocalDateTime registereDate) {
        super(ticketID, registereDate);
    }

    public DailyTicket(String timeSlotID, String ticketID, LocalDateTime registereDate) {
        super(ticketID, registereDate);
        this.timeSlotID = timeSlotID;
    }

    public String getTimeSlotID() {
        return timeSlotID;
    }

    public void setTimeSlotID(String timeSlotID) {
        this.timeSlotID = timeSlotID;
    }

}
