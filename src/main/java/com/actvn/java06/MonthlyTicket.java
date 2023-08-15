/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;

import java.net.URL;
import java.time.LocalDateTime;

/**
 *
 * @author PC- FPTSHOP
 */
public class MonthlyTicket extends Ticket {

    public MonthlyTicket() {
    }
    

    public MonthlyTicket(String ticketID, LocalDateTime registereDate) {
        super(ticketID, registereDate);
    }

    public String customerName;
    public String customerAddress;
    public LocalDateTime expiedDate;
    public double monthlyPrice;
    public URL customerAvatar;

    public MonthlyTicket(String customerName, String customerAddress, LocalDateTime expiedDate, double monthlyPrice, URL customerAvatar, String ticketID, LocalDateTime registereDate) {
        super(ticketID, registereDate);
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.expiedDate = expiedDate;
        this.monthlyPrice = monthlyPrice;
        this.customerAvatar = customerAvatar;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public LocalDateTime getExpiedDate() {
        return expiedDate;
    }

    public void setExpiedDate(LocalDateTime expiedDate) {
        this.expiedDate = expiedDate;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public URL getCustomerAvatar() {
        return customerAvatar;
    }

    public void setCustomerAvatar(URL customerAvatar) {
        this.customerAvatar = customerAvatar;
    }
    
}
