package ru.chepikov.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import ru.chepikov.model.Employee;

@Projection(name = "employeeProjection", types = {Employee.class})
public interface EmployeeProjection {
    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullName();
    @Value("#{target.position}")
    String getPosition();
    @Value("#{target.department.name}")
    String getDepartmentName();
}

