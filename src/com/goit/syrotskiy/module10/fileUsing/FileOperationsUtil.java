package com.goit.syrotskiy.module10.fileUsing;

import java.io.*;

public class FileOperationsUtil {

    public static void uploadToFile(String text, String fileName) throws IOException {
        try(DataOutputStream writer = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            writer.writeUTF(text);
            System.out.println("Your message was saved to the file!");
        } catch (FileNotFoundException ex) {
            System.out.println("[ERROR]: such file" + " <" + fileName + "> " +  "doesn't exist!");
        }
    }

    public static String readFile(String fileName) throws IOException {
        StringBuilder buffer = new StringBuilder();
        try(DataInputStream reader = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            while(true) {
                buffer.append(reader.readUTF());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("[ERROR]: such file" + " <" + fileName + "> " +  "doesn't exist!");
            throw ex;
        } catch (EOFException ex) {
            System.out.println("Reached end of file!");
        }
        return buffer.toString();
    }
}
