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
public class Search {
    MasterSearch masterSearchList;
    VitalSignHistory history;

    public Search() {
        masterSearchList=new MasterSearch();
        history=new VitalSignHistory();
    }
    
}
