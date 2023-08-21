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

    public static void inputDailyTicketInfo(Scanner input, ArrayList<DailyTicket> dailyTickets) {
        try {
            System.out.println("Nhap vao ID:");
            String ticketQuatity;
            ticketQuatity = input.next();

            System.out.println("Nhap vao tuoi cua khach hang:");
            int age;
            age = input.nextInt();

            String isTicketVip = "";
            while (!isTicketVip.equalsIgnoreCase("N") && !isTicketVip.equalsIgnoreCase("V")) {
                System.out.println("Nhap V neu la ve VIP, N la ve thuong:");
                isTicketVip = input.next();
            }

            DailyTicket ticket = new DailyTicket(ticketQuatity, age, isTicketVip);
            LocalDateTime start = ticket.checkStartTime();
            ticket.setStartTime(start);
            LocalDateTime end = ticket.checkEndTime();
            ticket.setEndTime(end);
            String timeSlotID = ticket.checkTimeSlotID();
            ticket.setTimeSlotID(timeSlotID);
            double dailyPrice = ticket.caculatorDailyPrice();
            ticket.setDailyPrice(dailyPrice);

            dailyTickets.add(ticket);
        } catch (InputMismatchException ei) {
            System.out.println("Ban da nhap sai gia tri, vui long nhap lai");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void inputCustomerInfo(Scanner input, ArrayList<MonthlyTicket> monthlyTickets) {
        try {
            System.out.println("Nhap vao ID:");
            String ticketQuatity;
            ticketQuatity = input.next();

            System.out.println("Nhap vao tuoi cua khach hang:");
            int age;
            age = input.nextInt();

            String isTicketVip = "";
            while (!isTicketVip.equalsIgnoreCase("N") && !isTicketVip.equalsIgnoreCase("V")) {
                System.out.println("Nhap V neu la ve VIP, N la ve thuong:");
                isTicketVip = input.next();
            }

            System.out.println("Nhap vao ten khach hang:");
            String customerName;
            customerName = input.next();

            System.out.println("Nhap vao dia chi cua khach hang:");
            String customerAddress;
            customerAddress = input.next();

            MonthlyTicket ticket = new MonthlyTicket(customerName, customerAddress, ticketQuatity, age, isTicketVip);
            LocalDate registere = ticket.checkRegistereDate();
            ticket.setRegistereDate(registere);
            LocalDate expied = ticket.checkExpiedDate();
            ticket.setExpiedDate(expied);
            String url = ticket.checkCustomerAvata();
            ticket.setCustomerAvatar(url);

            monthlyTickets.add(ticket);
        } catch (InputMismatchException ei) {
            System.out.println("Ban da nhap sai gia tri, vui long nhap lai");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int mode;
        System.out.println("Nhap 1 de nhap ve ngay, 2 de nhap ve thang:");
        mode = input.nextInt();
        switch (mode) {
            case 1: {
                ArrayList<DailyTicket> dailyTickets = new ArrayList<>();
                System.out.println("Nhap so luong ve:");
                int n;
                n = input.nextInt();
                for (int i = 1; i <= n; i++) {
                    inputDailyTicketInfo(input, dailyTickets);
                    int index = dailyTickets.size();
                    if (index == 0) {
                        dailyTickets.get(0).creatTicketID(index + 1);
                    } else {
                        dailyTickets.get(index - 1).creatTicketID(index);
                    }
                }
                dailyTickets.stream().forEach(
                        ticket -> System.out.println(ticket.toString())
                );
                break;
            }
            case 2: {
                ArrayList<MonthlyTicket> monthlyTickets = new ArrayList<>();
                System.out.println("Nhap so luong ve:");
                int n;
                n = input.nextInt();
                for (int i = 1; i <= n; i++) {
                    inputCustomerInfo(input, monthlyTickets);
                    int index = monthlyTickets.size();
                    if (index == 0) {
                        monthlyTickets.get(0).creatTicketID(index + 1);
                    } else {
                        monthlyTickets.get(index - 1).creatTicketID(index);
                    }
                }
                monthlyTickets.stream().forEach(
                        ticket -> System.out.println(ticket.toString())
                );
                break;
            }
        }
    }
}
