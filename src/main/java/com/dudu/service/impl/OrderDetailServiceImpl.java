package com.dudu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dudu.entity.OrderDetail;
import com.dudu.mapper.OrderDetailMapper;
import com.dudu.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
