/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tatcataiso
 */
public class FileSave {

    private static final String CURRENT = System.getProperty("user.dir");
    private static final String SEPERATOR = File.separator;
    private static final String PATH_CSV_FILE_INPUT = CURRENT + SEPERATOR + "Danh_Sach_Ve_Ngay_IN.csv";
    private static final String PATH_CSV_FILE_OUTPUT = CURRENT + SEPERATOR + "Danh_Sach_Ve_Ngay_OUT.csv";
    private static final String FILE_HEADER = "ID,Age,VIP,TimeslotID,StartTime,EndTime,Price\n";
    private static final String PATH_JSON_FILE = CURRENT + SEPERATOR + "";

    public static void saveFile(ArrayList<DailyTicket> arrayList) throws IOException {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV_FILE_OUTPUT));
            bw.append(FILE_HEADER);
            for (int i = 0; i < arrayList.size(); i++) {
                for (DailyTicket ts : arrayList) {
                    bw.append(ts.writeCSV());
                }
            }
            bw.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadFile(ArrayList<DailyTicket> arrayList) throws IOException {

        BufferedReader bf = new BufferedReader(new FileReader(PATH_CSV_FILE_OUTPUT));
        String line;
        bf.readLine();
        try {
            while ((line = bf.readLine()) != null) {
                String[] str = line.split(",");
                DailyTicket ticket = new DailyTicket(str[0], Integer.parseInt(str[1]), str[2], str[3], LocalDateTime.parse(str[4]), LocalDateTime.parse(str[5]), Double.parseDouble(str[6]));
                arrayList.add(ticket);
            }
            bf.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
}