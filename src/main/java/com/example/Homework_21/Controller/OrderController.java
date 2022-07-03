package com.example.Homework_21.Controller;


import com.example.Homework_21.Interface.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/store/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("add")
    public List<Integer> add(@RequestParam(value = "Id") List<Integer> idList) {
        return orderService.add(idList);
    }
    @GetMapping("get")
    public List<Integer> get() {
        return orderService.get();
    }
}
