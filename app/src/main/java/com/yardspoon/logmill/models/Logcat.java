package com.yardspoon.logmill.models;


import java.util.ArrayList;
import java.util.List;

public class Logcat {
    public List<String> getLogs() {
        int capacity = 1000;

        List<String> logs = new ArrayList<>(capacity);

        for (int i = 0; i < capacity; i++) {
            logs.add(i + " - Hello. I am a log. Welcome.");
        }

        return logs;
    }
}
