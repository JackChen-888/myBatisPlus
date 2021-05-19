package com.example.mybatisplus;

import com.example.mybatisplus.entity.Shop;
import com.example.mybatisplus.mapper.EmployeeMapper;
import com.example.mybatisplus.mapper.ShopMapper;
import com.example.mybatisplus.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.example.mybatisplus.mapper")
class MyBatisPlusApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ShopMapper shopMapper;

    @Test
    void contextLoads() {
//        List<Employee> employees = employeeMapper.selectList(null);
//        employees.forEach(System.out :: println);

//        List<Employee> list = employeeService.list();
//        list.forEach(System.out::println);

//        List<Employee> list = employeeService.listAllByLastName("tom");
//        list.forEach(System.out :: println);

//        Employee employee = new Employee();
//        employee.setLastName("sss");
//        employee.setEmail("sss@lc.com");
//        employee.setAge(21);
//        employeeService.save(employee);

//        employeeService.removeById(1);

//        Page<Employee> page = new Page<>(1,2);
//        employeeService.page(page, null);
//        List<Employee> employeeList = page.getRecords();
//        employeeList.forEach(System.out::println);
//        System.out.println("获取总条数:" + page.getTotal());
//        System.out.println("获取当前页码:" + page.getCurrent());
//        System.out.println("获取总页码:" + page.getPages());
//        System.out.println("获取每页显示的数据条数:" + page.getSize());
//        System.out.println("是否有上一页:" + page.hasPrevious());
//        System.out.println("是否有下一页:" + page.hasNext());

        // A、B管理员读取数据
        Shop A = shopMapper.selectById(1L);
        Shop B = shopMapper.selectById(1L);
        // B管理员先修改
        B.setPrice(9000);
        int result = shopMapper.updateById(B);
        if (result == 1) {
            System.out.println("B管理员修改成功!");
        } else {
            System.out.println("B管理员修改失败!");
        }
        // A管理员后修改
        A.setPrice(8500);
        int result2 = shopMapper.updateById(A);
        if (result2 == 1) {
            System.out.println("A管理员修改成功!");
        } else {
            System.out.println("A管理员修改失败!");
        }
        // 最后查询
        System.out.println(shopMapper.selectById(1L));
    }

}
