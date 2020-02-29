package ru.ncedu.course.catalog_example.service;

import javax.inject.Inject;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CustomHandler /*extends Handler*/ {

    /*@Inject
    private JourneyBean journeyBean;

    @Override
    public void publish(LogRecord record) {
        journeyBean.addRecord(record);
    }

    @Override
    public void flush() {
        journeyBean.clearHistory();
    }

    @Override
    public void close() throws SecurityException {
        flush();
    }*/
}
