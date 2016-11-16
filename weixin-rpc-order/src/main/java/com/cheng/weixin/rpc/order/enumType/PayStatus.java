package com.cheng.weixin.rpc.order.enumType;

/**
 * Desc: 到付 未付款 已付款
 * Author: cheng
 * Date: 2016/6/6
 */
public enum PayStatus {
    FREIGHT_COLLECT("到付"),
    NONPAYMENT("未付款"),
    PAID("已付款");

    private String name;

    PayStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}