package com.example.springwebflux.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderTuple {
    private long orderId;
    private long memberId;
    private long itemId;
    private String memberName;
    private String itemName;
    private int amount;

    @QueryProjection
    public OrderTuple(long orderId, long memberId, long itemId, String memberName, String itemName, int amount) {
        this.orderId = orderId;
        this.memberId = memberId;
        this.itemId = itemId;
        this.memberName = memberName;
        this.itemName = itemName;
        this.amount = amount;
    }
}
