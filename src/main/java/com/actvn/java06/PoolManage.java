/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Tatcataiso
 */
public class PoolManage {

    public static void inputCustomerInfo(Scanner input, ArrayList<MonthlyTicket> monthlyTickets) {
        try {
            System.out.println("Nhap vao tuoi cua khach hang:");
            int age;
            age = input.nextInt();
            input.nextLine();
            String isTicketVip = "";
            while (!isTicketVip.equalsIgnoreCase("N") && !isTicketVip.equalsIgnoreCase("V")) {
                System.out.println("Nhap V neu la ve VIP, N la ve thuong:");
                isTicketVip = input.nextLine();
            }

            System.out.println("Nhap vao ten khach hang:");
            String customerName;
            customerName = input.nextLine();

            System.out.println("Nhap vao dia chi cua khach hang:");
            String customerAddress;
            customerAddress = input.nextLine();

            MonthlyTicket ticket = new MonthlyTicket(customerName, customerAddress, age, isTicketVip);

            LocalDate time = LocalDate.now();
            LocalDate registere = ticket.checkRegistereDate(time);
            ticket.setRegistereDate(registere);
            LocalDate expied = ticket.checkExpiedDate(time);
            ticket.setExpiedDate(expied);
            double monthlyPrice = ticket.caculatorMonthlyPrice();
            ticket.setMonthlyPrice(monthlyPrice);
            String url = ticket.checkCustomerAvata();
            ticket.setCustomerAvatar(url);

            monthlyTickets.add(ticket);
        } catch (InputMismatchException ei) {
            System.out.println("Ban da nhap sai gia tri, vui long nhap lai");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<DailyTicket> dailyTickets = new ArrayList<>();
    public static ArrayList<MonthlyTicket> monthlyTickets = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

    }
}
