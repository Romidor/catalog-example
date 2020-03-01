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
public class LikeBean implements Serializable {

    private Long userId;
    private List<Long> offerings;

    public LikeBean() {
        offerings = new ArrayList<>();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUser(UserEntity user) {
        this.userId = Optional.ofNullable(user).map(UserEntity::getId).orElse(null);
    }

    public List<Long> getOfferings() {
        return offerings;
    }

    public void setOfferings(List<Long> offerings) {
        this.offerings = offerings;
    }

    public void addOffering(Long id) {
        offerings.add(id);
    }
}
