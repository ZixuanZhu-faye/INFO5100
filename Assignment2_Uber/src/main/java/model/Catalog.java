/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author zhuzixuan
 */
public class Catalog {
//    SimpleDateFormat sdf;
//    Date date;
    String time;

    public Catalog(String time) {
        this.time=time;
        //this.sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
    }

    
    public void setTime(){
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
        Date date = new Date();
        this.time=sdf.format(date);
    }
    
    public String getTime(){
        return this.time;
    }
    //Date date = new Date();// 获取当前时间 
}
