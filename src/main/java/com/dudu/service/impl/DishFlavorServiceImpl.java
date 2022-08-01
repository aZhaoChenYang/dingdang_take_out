package com.dudu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dudu.entity.DishFlavor;
import com.dudu.mapper.DishFlavorMapper;
import com.dudu.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends  ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
