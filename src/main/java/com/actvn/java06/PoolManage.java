/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Tatcataiso
 */
public class PoolManage {

    public static ArrayList<DailyTicket> dailyTickets = new ArrayList<>();
    public static ArrayList<MonthlyTicket> monthlyTickets = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        FileSave.ReadArrayMonthlyTickets(monthlyTickets);
        monthlyTickets.stream().forEach(
                ticket -> System.out.println(ticket.toString())
        );

    }
}
