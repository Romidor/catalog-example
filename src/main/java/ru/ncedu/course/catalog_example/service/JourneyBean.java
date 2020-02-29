package ru.ncedu.course.catalog_example.service;

import ru.ncedu.course.catalog_example.filter.AccessLogFilter;

import javax.ejb.Stateful;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
import javax.enterprise.context.SessionScoped;

@Stateful
@SessionScoped
public class JourneyBean implements Serializable {

    private List<String> history;

    public void addRecord(String record) {
        history.add(record);
    }

    public List<String> getHistory() {
        return history;
    }

    public void clearHistory() {
        history.clear();
    }

}
