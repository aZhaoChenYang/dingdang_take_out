package com.dudu.dto;

import com.dudu.entity.OrderDetail;
import com.dudu.entity.Orders;
import lombok.Data;

import java.util.List;

@Data
public class OrdersDto extends Orders {
    private  List<OrderDetail> orderDetails;
}
