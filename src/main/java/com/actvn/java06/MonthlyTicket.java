/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;
import java.net.URL;
import java.time.LocalDate;

/**
 *
 * @author PC- FPTSHOP
 */
public class MonthlyTicket extends Ticket {

    private String customerName;
    private String customerAddress;
    private LocalDate registereDate;
    private LocalDate expiedDate;
    private double monthlyPrice;
    private URL customerAvatar;

    public MonthlyTicket() {
    }

    public MonthlyTicket(String customerName, String customerAddress, LocalDate registereDate, LocalDate expiedDate, double monthlyPrice, URL customerAvatar) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.registereDate = registereDate;
        this.expiedDate = expiedDate;
        this.monthlyPrice = monthlyPrice;
        this.customerAvatar = customerAvatar;
    }

    public MonthlyTicket(String customerName, String customerAddress, LocalDate registereDate, LocalDate expiedDate, double monthlyPrice, URL customerAvatar, String ticketID, int age, String isTicketVip) {
        super(ticketID, age, isTicketVip);
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.registereDate = registereDate;
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

    public LocalDate getRegistereDate() {
        return registereDate;
    }

    public void setRegistereDate(LocalDate registereDate) {
        this.registereDate = registereDate;
    }

    public LocalDate getExpiedDate() {
        return expiedDate;
    }

    public void setExpiedDate(LocalDate expiedDate) {
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

    @Override
    public String creatTicketID() {
        return null;
    }
    /*public String checkIsTicketVip() {
        if (super.getIsTicketVip().equals("N")) {
            return "NORMAL";
        } else if (super.getIsTicketVip().equals("Y")) {
            return "VIP";
        } else {
            return null;
        }
    }*/
}
