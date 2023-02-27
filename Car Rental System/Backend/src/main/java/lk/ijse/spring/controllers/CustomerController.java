package lk.ijse.spring.controllers;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.PostLoad;

public class CustomerController {

@PostMapping
    public String saveCustomer(CustomerDTO dto){
    System.out.println(dto.toString());
    return "Customer Added";


    }

}
