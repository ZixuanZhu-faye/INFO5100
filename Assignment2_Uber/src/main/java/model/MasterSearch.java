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
public class MasterSearch {
    
    ArrayList<Order> vitalList;

    public MasterSearch() {
        
        vitalList=new ArrayList<Order>();
    }

    public ArrayList<Order> getVitalList() {
        return vitalList;
    }

    public void setVitalList(ArrayList<Order> vitalList) {
        this.vitalList = vitalList;
    }

    
    
    
    
}
