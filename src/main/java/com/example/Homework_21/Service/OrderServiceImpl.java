package com.example.Homework_21.Service;


import com.example.Homework_21.Interface.OrderService;
import com.example.Homework_21.Model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final Item item;

    public OrderServiceImpl(Item item) {
        this.item = item;
    }

    @Override
    public List<Integer> add(List<Integer> idList) {
        return item.addItems(idList);
    }

    @Override
    public List<Integer> get() {

        return item.getItems();
    }
}
