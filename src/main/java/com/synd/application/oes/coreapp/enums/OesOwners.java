package com.synd.application.oes.coreapp.enums;

/**
 * *****************************************************************
 *
 * @author - Md. Badi-Uz-Zaman Shajib
 * @copyright 2015.
 * @email - mbzshajib@gmail.com
 * @gitHub - https://github.com/mbzshajib
 * @date: 12/4/2015
 * @time: 12:30 AM
 * ****************************************************************
 */

public enum OesOwners {
    Arafat("Arafat"),
    Shajib("Shajib"),
    Shuvo("Shuvo");
    private String name;

    OesOwners(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
