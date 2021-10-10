/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author zhuzixuan
 */
class Order {
    
    ArrayList<OrderItem> orderItemList;

    public Order() {
        
        this.orderItemList=new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public void addNewOrderItem(VitalSigns vs){
        OrderItem orderItem=new OrderItem(vs);
        orderItemList.add(orderItem);
    }
       
    
}
