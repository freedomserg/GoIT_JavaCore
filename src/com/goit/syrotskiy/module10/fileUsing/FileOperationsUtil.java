package com.goit.syrotskiy.module10.fileUsing;

import java.io.*;

public class FileOperationsUtil {

    public static void uploadToFile(String text, String fileName) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(text);
            System.out.println("Your message was saved to the file!");
        } catch (FileNotFoundException ex) {
            System.out.println("[ERROR]: such file" + " <" + fileName + "> " +  "doesn't exist!");
        }
    }

    public static String readFile(String fileName) throws IOException {
        StringBuilder buffer = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String input = reader.readLine();
            while(input != null && !input.equals("")) {
                buffer.append(input);
                input = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("[ERROR]: such file" + " <" + fileName + "> " +  "doesn't exist!");
            throw ex;
        }
        return buffer.toString();
    }
}
