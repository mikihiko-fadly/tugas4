package com.tugas4.models;

public class Food {
    private Integer id;
    private String name;
    private Long price;
    private String size;

    public Food(Integer id, String name, Long price, String size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public Integer getId() { return id; }
    public String getName() { return name; }
    public Long getPrice() { return price; }
    public String getSize() { return size; }
}
