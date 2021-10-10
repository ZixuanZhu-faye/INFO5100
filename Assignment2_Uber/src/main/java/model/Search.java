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

    public MasterSearch getMasterSearchList() {
        return masterSearchList;
    }

    public void setMasterSearchList(MasterSearch masterSearchList) {
        this.masterSearchList = masterSearchList;
    }

    public VitalSignHistory getHistory() {
        return history;
    }

    public void setHistory(VitalSignHistory history) {
        this.history = history;
    }
    
}
