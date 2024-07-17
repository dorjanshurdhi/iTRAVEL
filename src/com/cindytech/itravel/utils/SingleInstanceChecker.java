package com.cindytech.itravel.utils;

import java.io.*;
import java.nio.channels.*;
import java.nio.file.*;

public class SingleInstanceChecker {
    
    private static final String LOCK_FILE_NAME = "resource/iautoservice.lock";
    private static FileLock lock;

    public static boolean isRunning() {
        try {
            Path lockFilePath = Paths.get(System.getProperty("user.dir"), LOCK_FILE_NAME);
            FileChannel channel = FileChannel.open(lockFilePath, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            lock = channel.tryLock();
            return (lock == null) ? true : false;
        } catch (IOException e) {
            return true;
        }
    }

    public static void releaseLock() {
        try {
            if (lock != null) {
                lock.release();
            }
        } catch (IOException e) {
            // handle exception
        }
    }
}
