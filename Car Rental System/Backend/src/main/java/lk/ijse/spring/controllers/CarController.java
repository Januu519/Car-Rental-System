package lk.ijse.spring.controllers;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.service.CarService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/car")
@CrossOrigin
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping
    public ResponseUtil saveCar(CarDTO dto){
        System.out.println(dto.toString());
        service.addCar(dto);
        return new ResponseUtil("200",dto.getRegistrationNumber()+ " Added.!",null);
    }

    @GetMapping
    public ResponseUtil getAllCars(){
        ArrayList<CarDTO> allCars = service.getAllCars();
        return new ResponseUtil("200"," Success.!",allCars);
    }

    @GetMapping(params = "registrationNumber")
    public ResponseUtil getCarUsingRegisterNumber(String registrationNumber) {
        CarDTO dto = service.searchCarByRegistrationNumber(registrationNumber);
        return new ResponseUtil("200", "added", dto);
    }
    @PutMapping
    public ResponseUtil updateCar(@RequestBody CarDTO dto){
        service.updateCar(dto);
        return new ResponseUtil("200",dto.getRegistrationNumber()+": Updated.!",null);
    }

    @DeleteMapping(params = "registrationNumber")
    public ResponseUtil deleteCar(String registrationNumber){
        System.out.println(registrationNumber);
        service.deleteCar(registrationNumber);
        return new ResponseUtil("200",registrationNumber+" : Deleted.!",null);
    }
}
