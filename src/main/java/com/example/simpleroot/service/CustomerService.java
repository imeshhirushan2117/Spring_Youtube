package com.example.simpleroot.service;

import com.example.simpleroot.dto.CustomerDTO;
import com.example.simpleroot.entity.Customer;
import com.example.simpleroot.repo.CustomerRepo;
import com.example.simpleroot.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    public CustomerDTO saveCustomer(CustomerDTO customerDTO){
        customerRepo.save(modelMapper.map(customerDTO,Customer.class));
        return customerDTO;
    }
}
