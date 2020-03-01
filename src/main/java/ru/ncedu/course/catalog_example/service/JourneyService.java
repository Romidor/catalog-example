package ru.ncedu.course.catalog_example.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class JourneyService {

    @Inject
    private JourneyBean journeyBean;

    public void addRecord(String record) {
        journeyBean.addRecord(record);
    }

    public List<String> getHistory() {
        return journeyBean.getHistory();
    }

    public void clearHistory() {
        journeyBean.clearHistory();
    }

    public void close() {
        journeyBean.setUserId(null);
        journeyBean.setHistory(null);
    }

}
