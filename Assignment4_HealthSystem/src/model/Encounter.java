/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author deepv
 */
public class Encounter {

    private VitalSigns vitalSigns;
    private PatientDirectory patientDirectory;
    private PersonDirectory_ personDirectory;
    
    

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(String name,String date) {
        this.vitalSigns = new VitalSigns(name,date);
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory_ getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory_ personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    
    
    
    @Override
    public String toString() {
        return this.vitalSigns.getName();
    }

}
