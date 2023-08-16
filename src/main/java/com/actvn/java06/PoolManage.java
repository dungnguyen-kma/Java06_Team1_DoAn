/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tatcataiso
 */
public class PoolManage {

    public static void inputDailyTicketInfo(Scanner input, ArrayList<DailyTicket> dailyTickets) {
        System.out.println("Nhap vao ID:");
        String ticketQuatity;
        ticketQuatity = input.next();
        System.out.println("Nhap vao tuoi cua khach hang:");
        int age;
        age = input.nextInt();
        System.out.println("Nhap V neu la ve VIP, N la ve thuong:");
        String isTicketVip;
        isTicketVip = input.next();
        System.out.println("Nhap vao ma be boi:");
        String timeSlotID;
        timeSlotID = input.next();
        System.out.println("Nhap vao ngay thang:");
        String date;
        date = input.next();
        LocalDate startTime = LocalDate.parse(date);
        System.out.println("Nhap vao gia:");
        double dailyPrice;
        dailyPrice = input.nextDouble();

        dailyTickets.add(new DailyTicket(timeSlotID, startTime, dailyPrice, ticketQuatity, age, isTicketVip));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<DailyTicket> dailyTickets = new ArrayList<>();
        inputDailyTicketInfo(input, dailyTickets);
    }
}
