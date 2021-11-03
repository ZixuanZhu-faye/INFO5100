/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rushabh
 */
public class Person {
    
    private int id;
    private String Name;
    private String age;
    private House house;
    //private House residence;
    private String community;
    private String city;
    private int blood;
    private boolean isPatient;
    private static int count = 0;
    
    
    //private VitalSigns vitalSigns;

    
    
    public Person() {
        count++;
        id = count;
        
    }

//    public VitalSigns getVitalSigns() {
//        return vitalSigns;
//    }
//
//    public void setVitalSigns(String name,String date) {
//        this.vitalSigns = new VitalSigns(name,date);
//    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHouse() {
        return this.house.getResidence();
    }

    public void setHouse(String residence) {
        this.house=new House(residence);
    }

    

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsPatient() {
        return isPatient;
    }

    public void setIsPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    

    
    @Override
    public String toString() {
        return String.valueOf(id);
    }

    
    
}
