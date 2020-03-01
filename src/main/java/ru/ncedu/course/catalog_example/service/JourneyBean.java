package ru.ncedu.course.catalog_example.service;

import ru.ncedu.course.catalog_example.model.entity.UserEntity;

import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Stateful
@SessionScoped
public class JourneyBean implements Serializable {

    private List<String> history;

    private Long userId;

    public JourneyBean() {
        history = new ArrayList<>();
    }

    public void addRecord(String record) {
        history.add(record);
    }

    public List<String> getHistory() {
        return history;
    }

    public void clearHistory() {
        history.clear();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(UserEntity user) {
        this.userId = Optional.ofNullable(user).map(UserEntity::getId).orElse(null);
    }

}
