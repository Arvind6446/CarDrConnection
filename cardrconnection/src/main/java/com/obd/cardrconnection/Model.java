package com.obd.cardrconnection;

import com.google.gson.annotations.SerializedName;

public class Model {
    @SerializedName("name")
    private String superName;

    public Model(String name) {
        this.superName = name;
    }

    public String getName() {
        return superName;
    }

}
