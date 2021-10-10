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
public class Temp {
    public static final int serial=0;
    private String Name;
    private boolean Ava;
    private String Type;
    private String City_Car;
    private String Manufacturer;
    private String Product_Date;
    private String Maintain_Certi;
    private int Seat;
    private String Model_num;
    private int Serial_num;

//    public Temp getTemp(){
//        return temp;
//    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isAva() {
        return Ava;
    }

    public void setAva(boolean Ava) {
        this.Ava = Ava;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getCity_Car() {
        return City_Car;
    }

    public void setCity_Car(String City_Car) {
        this.City_Car = City_Car;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getProduct_Date() {
        return Product_Date;
    }

    public void setProduct_Date(String Product_Date) {
        this.Product_Date = Product_Date;
    }

    public String getMaintain_Certi() {
        return Maintain_Certi;
    }

    public void setMaintain_Certi(String Maintain_Certi) {
        this.Maintain_Certi = Maintain_Certi;
    }

    public int getSeat() {
        return Seat;
    }

    public void setSeat(int Seat) {
        this.Seat = Seat;
    }

    public String getModel_num() {
        return Model_num;
    }

    public void setModel_num(String Model_num) {
        this.Model_num = Model_num;
    }

    public int getSerial_num() {
        return Serial_num;
    }

    public void setSerial_num(int Serial_num) {
        this.Serial_num = Serial_num;
    }
   
    @Override
    public String toString(){
        return String.valueOf(Serial_num);
    }
    
}
