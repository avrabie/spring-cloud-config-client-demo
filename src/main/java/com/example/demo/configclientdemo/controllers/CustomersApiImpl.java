package com.example.demo.configclientdemo.controllers;

import com.example.demo.configclientdemo.myopenapi.api.CustomersApi;
import com.example.demo.configclientdemo.myopenapi.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomersApiImpl implements CustomersApi {


    @GetMapping("")
    @Override
    public ResponseEntity<Customer> customersGet() {
        Customer body = new Customer();
        body.setId(10);
        body.setName("RuntimeName");
        return ResponseEntity.ok(body);
    }

    @Override
    public ResponseEntity<Customer> customersPut(Customer customer) {
        return CustomersApi.super.customersPut(customer);
    }
}
