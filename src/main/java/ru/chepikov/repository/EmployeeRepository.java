package ru.chepikov.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Repository;
import ru.chepikov.model.Employee;
import ru.chepikov.projection.EmployeeProjection;

import java.util.List;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<EmployeeProjection> findAllProjectedBy();
}
