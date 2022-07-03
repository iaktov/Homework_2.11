package com.example.Homework_21.Model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;


@Component
@SessionScope
public class Item {
    private final List<Integer> items;

    public Item() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> idList) {

        if (idList.isEmpty()) {
            throw new RuntimeException("Введите данные");
        } else {
            items.addAll(idList);
            return idList;
            }

    }

    public List<Integer> getItems() {
        return items;
    }
}
