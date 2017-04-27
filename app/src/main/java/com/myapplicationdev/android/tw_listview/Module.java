package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15017206 on 27/04/2017.
 */

public class Module {
    private String tvYear;
    private String moduleCode;
    private boolean programming;

    public Module(String tvYear, String moduleCode, boolean programming){
        this.tvYear = tvYear;
        this.moduleCode = moduleCode;
        this.programming = programming;
    }

    public String getTvYear(){
        return tvYear;
    }

    public String getModuleCode(){
        return moduleCode;
    }

    public boolean isProgramming(){
        return programming;
    }
}
