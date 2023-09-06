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
    private static final String MONTHLY_HEADER = "ID,Age,VIP,Name,Address,Phone,RegisterDate,ExpiredDate,Price,Avata\n";
    private static final String NEW_LINE_SPETATOR = "\n";
    private static final String COMMA_DELIMITER = ",";

    public static String dateFormaterApp(LocalDate date) {
        DateTimeFormatter formatString = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String result = date.format(formatString);
        return result;
    }

    public static void saveArrayDailyTickets(ArrayList<DailyTicket> arrayList) throws IOException {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV_FILE_OUTPUT));
            bw.write(FILE_HEADER);
            for (DailyTicket ticket : arrayList) {
                bw.append(ticket.writeCSV());
            }
            bw.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveDailyTicket(DailyTicket ticket) throws IOException {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV_FILE_OUTPUT, true));
            bw.append(ticket.writeCSV());
            bw.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadArrayDailyTickets(ArrayList<DailyTicket> arrayList) throws IOException {
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

    public static int ReadIndexOfDailyTicket(int index) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(PATH_CSV_FILE_OUTPUT));
        String line;
        bf.readLine();
        int sign = 0;
        try {
            while ((line = bf.readLine()) != null) {
                String[] str = line.split(",");
                String str2 = str[0].substring(6, 9);
                index = Integer.parseInt(str2);
                sign = 1;
            }
            bf.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
        if (sign == 0) {
            return index = 0;
        }
        return index;
    }

    public static void saveArrayMonthlyTickets(ArrayList<MonthlyTicket> arrayList) throws IOException {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV_MONTHLY_OUTPUT));
            bw.write(MONTHLY_HEADER);
            for (MonthlyTicket ticket : arrayList) {
                bw.append(ticket.writeCSV());
            }
            bw.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveMonthlyTicket(MonthlyTicket ticket) throws IOException {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV_MONTHLY_OUTPUT, true));
            bw.append(ticket.writeCSV());
            bw.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadArrayMonthlyTickets(ArrayList<MonthlyTicket> arrayList) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(PATH_CSV_MONTHLY_OUTPUT));
        String line;
        bf.readLine();
        try {
            while ((line = bf.readLine()) != null) {
                String[] str = line.split(",");
                MonthlyTicket ticket = new MonthlyTicket(str[0], Integer.parseInt(str[1]), str[2], str[3], str[4], Integer.parseInt(str[5]), LocalDate.parse(str[6]), LocalDate.parse(str[7]), Double.parseDouble(str[8]), str[9]);
                arrayList.add(ticket);
            }
            bf.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public static int ReadIndexOfMonthlyTicket(int index) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(PATH_CSV_MONTHLY_OUTPUT));
        String line;
        bf.readLine();
        int sign = 0;
        try {
            while ((line = bf.readLine()) != null) {
                String[] str = line.split(",");
                String str2 = str[0].substring(6, 9);
                index = Integer.parseInt(str2);
                sign = 1;
            }
            bf.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
        if (sign == 0) {
            return index = 0;
        }
        return index;
    }

    public static void saveMonthlyCSV(ArrayList<MonthlyTicket> arrayList) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(PATH_CSV_MONTHLY_OUTPUT);
            fw.append(MONTHLY_HEADER);
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
