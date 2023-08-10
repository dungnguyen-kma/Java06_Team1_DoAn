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
public class Ticket {

    public String ticketID;
    public LocalDateTime registereDate;

    public Ticket() {
    }

    public Ticket(String ticketID, LocalDateTime registereDate) {
        this.ticketID = ticketID;
        this.registereDate = registereDate;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public LocalDateTime getRegistereDate() {
        return registereDate;
    }

    public void setRegistereDate(LocalDateTime registereDate) {
        this.registereDate = registereDate;
    }

    public String ramdomTicketID() {

        return "";
    }

}
