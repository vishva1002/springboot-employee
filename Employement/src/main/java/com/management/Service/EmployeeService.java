package com.management.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.Entity.Employee;
import com.management.Repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository repository;

public List<Employee>getAllEmployee(){
	return repository.findAll();
}
public Employee getEmployeeId(long id) {
	return repository.findById(id).orElse(null);
}
public Employee saveEmployee(Employee employee) {
	return repository.save(employee);
}
public void deleteEmployee(Long id) {
	repository.deleteById(id);
}
public Optional<Employee>getemployee(Long id) {
	return repository.findById(id);
}
}
