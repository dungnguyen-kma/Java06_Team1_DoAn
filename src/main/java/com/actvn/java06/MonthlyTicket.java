package com.actvn.java06;

//import java.net.URL;
import java.time.LocalDate;
import java.util.Objects;

public class MonthlyTicket extends Ticket {

    private String customerName;
    private String customerAddress;
    private LocalDate registereDate;
    private LocalDate expiedDate;
    private double monthlyPrice;
    private String customerAvatar;

    public MonthlyTicket() {
    }

    public MonthlyTicket(String customerName, String customerAddress, LocalDate registereDate, LocalDate expiedDate, double monthlyPrice, String customerAvatar) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.registereDate = registereDate;
        this.expiedDate = expiedDate;
        this.monthlyPrice = monthlyPrice;
        this.customerAvatar = customerAvatar;
    }

    public MonthlyTicket(String customerName, String customerAddress, LocalDate registereDate, LocalDate expiedDate, double monthlyPrice, String customerAvatar, String ticketID, int age, String isTicketVip) {
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

    public String getCustomerAvatar() {
        return customerAvatar;
    }

    public void setCustomerAvatar(String customerAvatar) {
        this.customerAvatar = customerAvatar;
    }

    @Override
    public String toString() {
        return "MonthlyTicket{" + "customerName=" + customerName + ", customerAddress=" + customerAddress + ", registereDate=" + registereDate + ", expiedDate=" + expiedDate + ", monthlyPrice=" + monthlyPrice + ", customerAvatar=" + customerAvatar + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.customerName);
        hash = 19 * hash + Objects.hashCode(this.customerAddress);
        hash = 19 * hash + Objects.hashCode(this.registereDate);
        hash = 19 * hash + Objects.hashCode(this.expiedDate);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.monthlyPrice) ^ (Double.doubleToLongBits(this.monthlyPrice) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.customerAvatar);
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
        final MonthlyTicket other = (MonthlyTicket) obj;
        if (Double.doubleToLongBits(this.monthlyPrice) != Double.doubleToLongBits(other.monthlyPrice)) {
            return false;
        }
        if (!Objects.equals(this.customerName, other.customerName)) {
            return false;
        }
        if (!Objects.equals(this.customerAddress, other.customerAddress)) {
            return false;
        }
        if (!Objects.equals(this.customerAvatar, other.customerAvatar)) {
            return false;
        }
        if (!Objects.equals(this.registereDate, other.registereDate)) {
            return false;
        }
        return Objects.equals(this.expiedDate, other.expiedDate);
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
    public double caculatorMonthlyPrice() {
        setMonthlyPrice(300000);
        return getMonthlyPrice();
    }

}
