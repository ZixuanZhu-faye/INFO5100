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
public class CommunityDirectory {
    
    private ArrayList<Community> supplierList;
    
    public CommunityDirectory() {
        supplierList = new ArrayList<Community>();
    }

    public ArrayList<Community> getSupplierList() {
        return supplierList;
    }
    
    public Community addSupplier() {
        Community s = new Community();
        supplierList.add(s);
        return s;
    }
    
    public void removeSupplier(Community s) {
        supplierList.remove(s);
    }
    
    public Community searchSupplier(String keyWord) {
        for(Community s : supplierList) {
            if(keyWord.equals(s.getCommunityName())) {
                return s;
            }
        }
        return null;
    }
    
}
