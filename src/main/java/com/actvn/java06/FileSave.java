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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Tatcataiso
 */
public class FileSave {
    
    private static final String CURRENT = System.getProperty("user.dir");
    private static final String SEPERATOR = File.separator;
    private static final String PATH_CSV_MONTHLY_OUTPUT = CURRENT + SEPERATOR + "Danh_Sach_Ve_Thang_OUT.csv";
    private static final String PATH_CSV_FILE_OUTPUT = CURRENT + SEPERATOR + "Danh_Sach_Ve_Ngay_OUT.csv";
    private static final String FILE_HEADER = "ID,Age,VIP,TimeslotID,StartTime,EndTime,Price\n";
    private static final String MONTHLY_HEADER = "ID,Name,Address,Phone,Age,VIP,RegisterDate,ExpiredDate,Price";
    private static final String NEW_LINE_SPETATOR = "\n";
    private static final String COMMA_DELIMITER = ",";
    
    public static String dateFormaterApp(LocalDate date) {
        DateTimeFormatter formatString = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String result = date.format(formatString);
        return result;
    }
    
    public static void saveFile(ArrayList<DailyTicket> arrayList) throws IOException {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV_FILE_OUTPUT, true));
            for (DailyTicket ts : arrayList) {
                bw.append(ts.writeCSV());
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

    public static void saveMonthlyCSV(ArrayList<MonthlyTicket> arrayList) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(PATH_CSV_MONTHLY_OUTPUT, true);
            fw.append(NEW_LINE_SPETATOR);
            for (MonthlyTicket item : arrayList) {
                fw.append(item.getTicketID());
                fw.append(COMMA_DELIMITER);
                fw.append(item.getCustomerName());
                fw.append(COMMA_DELIMITER);
                fw.append(item.getCustomerAddress());
                fw.append(COMMA_DELIMITER);
                fw.append(String.valueOf(item.getCustomerPhone()));
                fw.append(COMMA_DELIMITER);
                fw.append(String.valueOf(item.getAge()));
                fw.append(COMMA_DELIMITER);
                fw.append(item.getIsTicketVip());
                fw.append(COMMA_DELIMITER);
                fw.append(dateFormaterApp(item.getRegistereDate()));
                fw.append(COMMA_DELIMITER);
                fw.append(dateFormaterApp(item.getExpiedDate()));
                fw.append(COMMA_DELIMITER);
                fw.append(String.valueOf(item.getMonthlyPrice()));
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
