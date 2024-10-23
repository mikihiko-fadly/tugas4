package com.tugas4.models;

public class Chef {
    private Integer id;
    private String name;
    private String asal;

    public Chef(Integer id, String name, String asal) {
        this.id = id;
        this.name = name;
        this.asal = asal;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getAsal() { return asal; }
}
