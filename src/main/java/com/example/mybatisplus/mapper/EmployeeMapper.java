package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Chen
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    List<Employee> selectAllByLastName(@Param("lastName") String lastName);
}
