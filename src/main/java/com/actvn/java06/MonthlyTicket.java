package com.actvn.java06;

//import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class MonthlyTicket extends Ticket {

    public static void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String customerName;
    private String customerAddress;
    private int customerPhone;
    private LocalDate registereDate;
    private LocalDate expiedDate;
    private double monthlyPrice;
    private String customerAvatar;

    public MonthlyTicket() {
    }

    public MonthlyTicket(String ticketID, int age, String isTicketVip, String customerName, String customerAddress, int customerPhone, LocalDate registereDate, LocalDate expiedDate, double monthlyPrice, String customerAvatar) {
        super(ticketID, age, isTicketVip);
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.registereDate = registereDate;
        this.expiedDate = expiedDate;
        this.monthlyPrice = monthlyPrice;
        this.customerAvatar = customerAvatar;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
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
        return "MonthlyTicket{" + "customerName=" + customerName + ", customerAddress=" + customerAddress + ", registereDate=" + registereDate + ", expiedDate=" + expiedDate + ", monthlyPrice=" + Math.round(monthlyPrice) + ", customerAvatar=" + customerAvatar + ", ticketID= " + super.getTicketID() + ", age= " + super.getAge() + ", VIP or Nomal= " + checkIsTicketVip() + '}';
    }

    @Override
    public String creatTicketID(int index) {
        super.setTicketID(String.format("THANG-" + "%03d", index));
        return super.getTicketID();
    }

    public String checkIsTicketVip() {
        if (super.getIsTicketVip().equalsIgnoreCase("Normal")) {
            return "NORMAL";
        } else {
            return "VIP";
        }
    }

    public LocalDate checkRegistereDate(LocalDate time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String str = time.format(formatter);
        LocalDate result = LocalDate.parse(str, formatter);
        return result;
    }

    public LocalDate checkExpiedDate(LocalDate time, int extend) {
        if (extend == 6) {
            this.setExpiedDate(time.plusMonths(6));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String str = getExpiedDate().format(formatter);
            LocalDate result = LocalDate.parse(str, formatter);
            return result;
        } else if (extend == 3) {
            this.setExpiedDate(time.plusMonths(3));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String str = getExpiedDate().format(formatter);
            LocalDate result = LocalDate.parse(str, formatter);
            return result;
        } else {
            this.setExpiedDate(time.plusMonths(1));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String str = getExpiedDate().format(formatter);
            LocalDate result = LocalDate.parse(str, formatter);
            return result;
        }
    }

    public double caculatorMonthlyPrice(String data, int age) {
        setMonthlyPrice(300000);
        if (data.equalsIgnoreCase("V")) {
            this.monthlyPrice += 150000;
        }
        if (age >= 3 && age <= 12) {
            this.monthlyPrice -= 50000;
        }
        return getMonthlyPrice();
    }

    public String writeCSV() {
        String str = String.format("%s,%d,%s,%s,%s,%d,%s,%s,%.0f,%s\n", super.getTicketID(), super.getAge(), super.getIsTicketVip(), getCustomerName(), getCustomerAddress(), getCustomerPhone(), getRegistereDate().toString(), getExpiedDate().toString(), getMonthlyPrice(), getCustomerAvatar());
        return str;
    }
}
