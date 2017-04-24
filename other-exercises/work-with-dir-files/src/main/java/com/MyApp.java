package com;

import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.*;

public class MyApp {
    public static void main(String[] args) {
        try {
            String s = "For test!";
            Path path = FileSystems.getDefault().getPath("./tmp", "temp.txt");
            BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"));
            writer.write(s, 0, s.length());
            writer.close();
        } catch (java.nio.file.NoSuchFileException e) {
             e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}