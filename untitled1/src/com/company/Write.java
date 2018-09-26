package com.company;
import java.io.*;
public class Write {

    Write(String name, String text) {
        try {
            FileWriter writer = new FileWriter(name);
            writer.write(text);
            writer.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
