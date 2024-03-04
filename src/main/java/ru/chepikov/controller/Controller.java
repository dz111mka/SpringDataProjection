package ru.chepikov.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.chepikov.model.Employee;
import ru.chepikov.projection.EmployeeProjection;
import ru.chepikov.repository.EmployeeRepository;
import ru.chepikov.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class Controller {

    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeProjection> getEmployee() {
        return employeeService.getAllEmployee();
    }
}
