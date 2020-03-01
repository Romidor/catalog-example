package ru.ncedu.course.catalog_example.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class LikeService {

    @Inject
    private LikeBean likeBean;

    public List<Long> getLikes() {
        return likeBean.getOfferings();
    }

    public void addOffering(Long id) {
        likeBean.addOffering(id);
    }

    public void close() {
        likeBean.setUser(null);
        likeBean.setOfferings(null);
    }
}
