package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader implements Readable {

    private String path;

    public FileReader(String path) {
        this.path = path;
    }

    @Override
    public String read() {
        String text = null;
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(this.path));
            text = new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
