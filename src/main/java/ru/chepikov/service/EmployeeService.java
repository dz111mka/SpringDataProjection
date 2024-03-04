package ru.chepikov.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Service;
import ru.chepikov.model.Employee;
import ru.chepikov.projection.EmployeeProjection;
import ru.chepikov.repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class EmployeeService {

    EmployeeRepository employeeRepository;


    public List<EmployeeProjection> getAllEmployee() {
        return employeeRepository.findAllProjectedBy();
    }


}
