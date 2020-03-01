package ru.ncedu.course.catalog_example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CustomHandler extends Handler {

    private List<String> urls;

    public CustomHandler() {
        urls = new ArrayList<>();
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public void publish(LogRecord record) {
        urls.add(record.getMessage());
    }

    @Override
    public void flush() {
        urls.clear();
    }

    @Override
    public void close() throws SecurityException {
        flush();
    }
}
