package com.actvn.java06;

//import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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

    public MonthlyTicket(String customerName, String customerAddress, int age, String isTicketVip) {
        super(age, isTicketVip);
        this.customerName = customerName;
        this.customerAddress = customerAddress;
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
    public String creatTicketID(int index) {
        LocalDate start = LocalDate.now();
        LocalDate normal = LocalDate.now().plusMonths(1);
        LocalDate vip = LocalDate.now().plusMonths(2);

        super.setTicketID(String.format("THANG-" + "%03d", index));

        if (this.checkIsTicketVip().equalsIgnoreCase("V")) {
            Period period = Period.between(start, vip);
            if (period.getDays() == 0) {
                index = 1;
                return "Het han";
            }
        } else {
            Period period = Period.between(start, normal);
            if (period.getDays() == 0) {
                index = 1;
                return "Het han";
            }
        }
        return super.getTicketID();
    }

    public String checkIsTicketVip() {
        if (super.getIsTicketVip().equalsIgnoreCase("N")) {
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

    public LocalDate checkExpiedDate(LocalDate time) {
        if (this.getIsTicketVip().equalsIgnoreCase("V")) {
            this.setExpiedDate(time.plusMonths(2));
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

    public double caculatorMonthlyPrice() {
        setMonthlyPrice(300000);
        if (this.getIsTicketVip().equalsIgnoreCase("V")) {
            this.monthlyPrice += 150000;
        }
        if (super.getAge() >= 3 && super.getAge() <= 12) {
            this.monthlyPrice -= 50000;
        }
        return getMonthlyPrice();
    }

    public String checkCustomerAvata() {
        //đọc file và trả về URL
        return "path";
    }
}
