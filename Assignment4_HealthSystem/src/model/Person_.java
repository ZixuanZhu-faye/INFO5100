/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author deepv
 */
public class Person_ {
    
    private String Name;
    private String age;
    private String residence;
    private String community;
    private String city;
    private boolean isPatient;
    private int id;
    
    public String gettName() {
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
    
    public String getResidence() {
        return residence;
    }
    
    public void setResidence(String residence) {
        this.residence = residence;
//        addHouse(residence);
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
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
//    public void addHouse(String houseNum) {
//        House house = new House();
//        house.addHouse(houseNum);
//    }
    
    public void updateAsAPatient(int id, PersonDirectory_ people) {
//        for (Person_ person : people.getPeople()) {
//            if (person.getId() == id) {
//                person.setIsPatient(true);
//            }
//        }
    }
    
    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
}
