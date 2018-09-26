package com.company;

/**
 * Represents abstract readable instance.
 * If you want to add new Readers, just implement it
 */
public interface Readable {
    /**
     * Reads string from source
     * @return read string
     */
    String read();
}
