package com.example.springwebflux.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class OrderListResponseDto {
    private long memberId;
    private String memberName;
    private List<OrderInfo> list;

    @Builder
    @Data
    public static class OrderInfo {
        private long orderId;
        private String itemName;
        private int amount;
    }
}
