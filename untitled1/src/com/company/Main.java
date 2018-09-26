package com.company;

public class Main {

    public static void main(String[] args) {
	    Readable reader = new FileReader("main.txt");
	    String text = reader.read();
	    Parsable parser = new UppercaseParser(text);
	    String result = parser.parse();
	    Writeable writeable = new FileWriter("new.txt", result);
	    writeable.write();
    }
}
