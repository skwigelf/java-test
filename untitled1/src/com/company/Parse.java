package com.company;

import java.io.*;
public class Parse {

    private String text;

    Parse(String text) {
        try(BufferedReader br = new BufferedReader(new FileReader(text)))
        {
            this.text = "";
            String s;
            while((s=br.readLine())!=null){
                this.text = this.text + s;
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }

    public String getText() {
        return text;
    }

    public String tire(){
        String newStr = this.text.replace(" ", "-");
        System.out.println(newStr);
        return newStr;
    }

    public String upCase(){
        String newStr = this.text.toUpperCase();
        System.out.println(newStr);
        return newStr;
    }

    public String deleteSpaces(){
        String newStr = this.text.replace(" ", "");
        System.out.println(newStr);
        return newStr;
    }

}