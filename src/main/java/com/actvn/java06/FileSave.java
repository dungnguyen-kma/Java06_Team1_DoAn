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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tatcataiso
 */
public class FileSave {

    private static final String CURRENT = System.getProperty("user.dir");
    private static final String SEPERATOR = File.separator;
    //private static final String PATH_CSV_FILE_INPUT = CURRENT + SEPERATOR + "diemthi_input.csv";
    private static final String PATH_CSV_FILE_OUTPUT = CURRENT + SEPERATOR + "Danh Sach Ve Ngay";

    /*public static <E> void saveFile(ArrayList<E> arrayList) {
        
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(PATH_CSV_FILE_OUTPUT));
            for (int i = 0; i < arrayList.size(); i++) {
                for (E ts : arrayList.get(i))) {
                    bw.append(ts.toString());
                }
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);

        //ArrayList<DailyTicket> tickets = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new FileReader(PATH_CSV_FILE_OUTPUT));
        String line;
        bf.readLine();
        //đọc file
        /*try {
            while ((line = bf.readLine()) != null) {
                String[] str = line.split(",");
                ThiSinh ts = new ThiSinh(Integer.parseInt(str[0]), str[1], str[2], str[3], Double.parseDouble(str[4]));
                list.add(ts);
            }
            bf.close();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }*/

        //ghi file
    }
}
