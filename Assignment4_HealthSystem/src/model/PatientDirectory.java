/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author deepv
 */
public class PatientDirectory {

    ArrayList<Patient> patientList;
    private static int num=0;

    public PatientDirectory() {
        if (this.patientList == null || this.patientList.isEmpty()) {
            this.patientList = new ArrayList<>();
        }
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

//    public static void addNum(){
//        num++;
//    }
//    
//    public static void removeNum(){
//        num--;
//    }
//    
//    public static int getNum() {
//        return num;
//    }

//
//    public int getNum(){
//        return num;
//    }
    public static void setNum(int num) {    
        PatientDirectory.num = num;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient addPatients() {
        Patient patient = new Patient();
        num++;
        patientList.add(patient);
        return patient;
    }
    
    public void removePatients(Patient patient) {
        patientList.remove(patient);
        
    }
    
    public Patient searchPatient(String name) {

        for(Patient p : patientList) {
            if(p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
    
    public int getPatientsSize(){
        return patientList.size();
    }
    
}
