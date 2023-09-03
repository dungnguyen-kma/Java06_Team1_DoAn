/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;

import java.util.Comparator;

/**
 *
 * @author Tatcataiso
 */
public class DayComparatorInDaily implements Comparator<DailyTicket> {

    @Override
    public int compare(DailyTicket o1, DailyTicket o2) {
        return o1.getStartTime().compareTo(o2.getStartTime());
    }
}
