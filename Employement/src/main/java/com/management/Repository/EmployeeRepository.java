package com.management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.Entity.Employee;




@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
