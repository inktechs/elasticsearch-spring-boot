package com.mesadhan.elasticsearch.business;

import com.mesadhan.elasticsearch.data.OrderLog;
import com.mesadhan.elasticsearch.repository.OrderLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("person")
public class OrderLogController {

    @Autowired
    OrderLogRepository orderRepository;

    @GetMapping
    public List<OrderLog> all() {
        Iterator<OrderLog> iterator = orderRepository.findAll().iterator();
        List<OrderLog> orders = new ArrayList<>();
        while (iterator.hasNext()) {
            orders.add(iterator.next());
        }
        return orders;
    }

    @PostMapping
    public boolean add(@RequestBody OrderLog student) {
        try {
            orderRepository.save(student);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    @GetMapping("/{id}")
    public Optional<OrderLog> findById(@PathVariable String id) {
        return orderRepository.findById(id);
    }


}
