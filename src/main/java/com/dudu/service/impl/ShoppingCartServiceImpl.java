package com.dudu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dudu.entity.ShoppingCart;
import com.dudu.mapper.ShoppingCartMapper;
import com.dudu.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
