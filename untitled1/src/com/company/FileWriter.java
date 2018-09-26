package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Writeable implementation that writes data to file
 */
public class FileWriter implements Writeable {

    private String path;
    private String text;

    public FileWriter(String path, String text) {
        this.path = path;
        this.text = text;
    }

    @Override
    public void write() {
        try {
            Files.write(Paths.get(this.path), this.text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
