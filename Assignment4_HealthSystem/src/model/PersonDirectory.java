/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class PersonDirectory {
    
    private ArrayList<Person> personCatalog;
    
    public PersonDirectory() {
        personCatalog = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonCatalog() {
        return personCatalog;
    }
    
    public Person addPerson() {
        Person p = new Person();
        personCatalog.add(p);
        return p;
    }
    
    public void removePerson(Person p) {
        personCatalog.remove(p);
    }
    
    public Person searchPerson(int id) {

        for(Person p : personCatalog) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
    public int getPersonCount(){
        return personCatalog.size();
    }
}
