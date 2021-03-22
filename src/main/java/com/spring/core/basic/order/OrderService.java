package com.spring.core.basic.order;

//주문 서비스 인터페이스
//주문을 생성하는 기능이 있어야 함
public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
