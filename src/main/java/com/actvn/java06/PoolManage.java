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

    public PoolManage() {
    }

    public static ArrayList<DailyTicket> getDailyTickets() {
        return dailyTickets;
    }

    public static void setDailyTickets(ArrayList<DailyTicket> dailyTickets) {
        PoolManage.dailyTickets = dailyTickets;
    }

    public static ArrayList<MonthlyTicket> getMonthlyTickets() {
        return monthlyTickets;
    }

    public static void setMonthlyTickets(ArrayList<MonthlyTicket> monthlyTickets) {
        PoolManage.monthlyTickets = monthlyTickets;
    }

    
}
