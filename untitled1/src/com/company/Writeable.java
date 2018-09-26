package com.company;

/**
 * Represents abstract readable instance.
 * If you want to add new Writers, just implement it
 */
public interface Writeable {
    /**
     * Writes data to source
     */
    void write();
}
