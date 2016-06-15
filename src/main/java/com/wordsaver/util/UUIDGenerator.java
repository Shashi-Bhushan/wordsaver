package com.wordsaver.util;

import java.util.UUID;

/**
 * @author Shashi Bhushan
 *         Created on 15/6/16.
 *         For Project : WordSaver
 */
public class UUIDGenerator {
    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
