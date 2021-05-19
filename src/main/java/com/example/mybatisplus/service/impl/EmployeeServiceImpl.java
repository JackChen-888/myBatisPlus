package com.example.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.entity.Employee;
import com.example.mybatisplus.mapper.EmployeeMapper;
import com.example.mybatisplus.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Chen
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Override
    public List<Employee> listAllByLastName(String lastName) {
        return baseMapper.selectAllByLastName(lastName);
    }
}