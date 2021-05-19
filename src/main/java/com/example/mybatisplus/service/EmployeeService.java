package com.example.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplus.entity.Employee;

import java.util.List;

/**
 * @author Chen
 */
public interface EmployeeService extends IService<Employee> {
    List<Employee> listAllByLastName(String lastName);
}
