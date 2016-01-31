package com.goit.syrotskiy.module10.fileUsing;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class FileOperationsUtilTest {

    @Test(timeout = 100)
    public void testUploadToFile() throws Exception {
        String fileSeparator = System.getProperty("file.separator");
        String userDir = System.getProperty("user.dir");
        String fileName = userDir + fileSeparator + "test" + fileSeparator + "com" + fileSeparator + "goit" + fileSeparator
                + "syrotskiy" + fileSeparator + "module10" + fileSeparator + "fileUsing" + fileSeparator + "FileForUploadTest.txt";
        String expected = "Java is the best!";

        FileOperationsUtil.uploadToFile(expected, fileName);

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
        String actual = buffer.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test(timeout = 100)
    public void testReadFile() throws Exception {
        String fileSeparator = System.getProperty("file.separator");
        String userDir = System.getProperty("user.dir");
        String fileName = userDir + fileSeparator + "test" + fileSeparator + "com" + fileSeparator + "goit" + fileSeparator
                + "syrotskiy" + fileSeparator + "module10" + fileSeparator + "fileUsing" + fileSeparator + "FileForReadTest.txt";
        String expected = "Java is the best!";
        String actual = FileOperationsUtil.readFile(fileName);

        Assert.assertEquals(expected, actual);
    }
}