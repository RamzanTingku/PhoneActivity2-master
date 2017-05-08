package com.example.abirhossainamee.phoneactivity.ModelClass;

import java.util.ArrayList;

/**
 * Created by RamzanUllah on 09-May-17.
 */

public class InfoClass {

    private String periodName;
    private int unlockedTime, SocialTime, DataPack;

    public InfoClass() {
    }

    public InfoClass(String periodName, int unlockedTime, int socialTime, int dataPack) {
        this.periodName = periodName;
        this.unlockedTime = unlockedTime;
        this.SocialTime = socialTime;
        this.DataPack = dataPack;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public void setUnlockedTime(int unlockedTime) {
        this.unlockedTime = unlockedTime;
    }

    public void setSocialTime(int socialTime) {
        SocialTime = socialTime;
    }

    public void setDataPack(int dataPack) {
        DataPack = dataPack;
    }

    public String getPeriodName() {
        return periodName;
    }

    public int getUnlockedTime() {
        return unlockedTime;
    }

    public int getSocialTime() {
        return SocialTime;
    }

    public int getDataPack() {
        return DataPack;
    }



}

