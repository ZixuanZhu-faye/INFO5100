/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author zhuzixuan
 */
class OrderItem {
    
    VitalSigns vs;

    public OrderItem(VitalSigns vs) {
        this.vs = vs;
    }

    public VitalSigns getVs() {
        return vs;
    }

    public void setVs(VitalSigns vs) {
        this.vs = vs;
    }
    
    
}
