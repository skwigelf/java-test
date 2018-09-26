package com.company;

public class Main {

    public static void main(String[] args) {
	    Parse par = new Parse("main.txt");
	    par.tire();
	    par.upCase();
	    par.deleteSpaces();
	    Write wrtr = new Write("newba.txt", par.getText());
    }
}
