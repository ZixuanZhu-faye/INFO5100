/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Community {
    
    private String communityName;
    private PersonDirectory personCatalog;
    private PatientDirectory patientCatalog;
    private City city;

    
    
    public Community() {
        personCatalog = new PersonDirectory();
        patientCatalog=new PatientDirectory();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public PersonDirectory getPersonCatalog() {
        return personCatalog;
    }

    public PatientDirectory getPatientCatalog() {
        return patientCatalog;
    }

    public void setPatientCatalog(PatientDirectory patientCatalog) {
        this.patientCatalog = patientCatalog;
    }

    public City getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = new City(city);
    }
    
    
    @Override
    public String toString() {
        return communityName;
    }
    
}
