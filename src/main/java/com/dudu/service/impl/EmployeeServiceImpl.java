package com.dudu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dudu.entity.Employee;
import com.dudu.mapper.EmployeeMapper;
import com.dudu.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
