/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;

import java.time.LocalDate;
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

            System.out.println("Nhap V neu la ve VIP, N la ve thuong:");
            String isTicketVip;
            isTicketVip = input.next();

            /*System.out.println("Nhap vao ma be boi:");
            String timeSlotID;
            timeSlotID = input.next();
            System.out.println("Nhap vao ngay thang:");
            String date;
            date = input.next();
            LocalDate startTime = LocalDate.parse(date);
            System.out.println("Nhap vao gia:");
            double dailyPrice;
            dailyPrice = input.nextDouble();*/
            // creatTicketID();
            DailyTicket ticket = new DailyTicket(isTicketVip, age, isTicketVip);
            LocalDate date = ticket.checkStartTime();
            String timeSlotID = ticket.checkTimeSlotID();
            double dailyPrice = ticket.caculatorDailyPrice();
            ticket.setTicketID(ticketQuatity);
            ticket.setAge(age);
            ticket.setIsTicketVip(isTicketVip);
            dailyTickets.add(new DailyTicket(timeSlotID, date, dailyPrice, ticketQuatity, age, isTicketVip));

        } catch (InputMismatchException ei) {
            System.out.println("Ban da nhap sai gia tri, vui long nhap lai");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<DailyTicket> dailyTickets = new ArrayList<>();
        inputDailyTicketInfo(input, dailyTickets);
        dailyTickets.stream().forEach(
                ticket -> System.out.println(ticket.toString())
        );

    }
}
