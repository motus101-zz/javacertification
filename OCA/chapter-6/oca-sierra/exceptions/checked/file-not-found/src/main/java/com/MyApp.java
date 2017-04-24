package com;

import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;
//import java.lang.IOException;

public class MyApp {
    public static void main(String[] args) {
        try {
            byte[] b = new byte[1000];
            RandomAccessFile ra = new RandomAccessFile("./temp/tmptest.txt", "r");
            ra.readFully(b, 0, 1000);

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
//    public static char[] arr = new char[100];
//    public static String s = "Hi there all !";
//    public static void main(String[] args) {
//        try {
//            Path path = FileSystems.getDefault().getPath("./temp", "tmptest.txt");
//            BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"));
//            writer.write(s, 0, s.length());
//            writer.close();
//        } catch (UnsupportedOperationException uo) {
//            uo.printStackTrace();
//        } catch (SecurityException se) {
//            se.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}