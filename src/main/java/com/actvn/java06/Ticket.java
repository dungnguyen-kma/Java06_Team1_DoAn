/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;

/**
 *
 * @author PC- FPTSHOP
 */
public abstract class Ticket {

    private String ticketID;
    private int age;
    private String isTicketVip;

    public Ticket() {
    }

    public Ticket(String ticketID, int age, String isTicketVip) {
        this.ticketID = ticketID;
        this.age = age;
        this.isTicketVip = isTicketVip;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIsTicketVip() {
        return isTicketVip;
    }

    public void setIsTicketVip(String isTicketVip) {
        this.isTicketVip = isTicketVip;
    }

    public abstract String creatTicketID();
}
