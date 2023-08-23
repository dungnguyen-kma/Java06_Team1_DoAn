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
            //nhập số xong nhập chuỗi thì thêm input.nextLine
            System.out.println("Nhap vao tuoi cua khach hang:");
            int age;
            age = input.nextInt();
            input.nextLine();
            String isTicketVip = "";
            while (!isTicketVip.equalsIgnoreCase("N") && !isTicketVip.equalsIgnoreCase("V")) {
                System.out.println("Nhap V neu la ve VIP, N la ve thuong:");
                isTicketVip = input.nextLine();
            }

            DailyTicket ticket = new DailyTicket(age, isTicketVip);

            LocalDateTime time = LocalDateTime.now();
            LocalDateTime start = ticket.checkStartTime(time);
            ticket.setStartTime(start);
            LocalDateTime end = ticket.checkEndTime(time);
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
                    int size = dailyTickets.size();
                    dailyTickets.get(size - 1).creatTicketID(size);
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
