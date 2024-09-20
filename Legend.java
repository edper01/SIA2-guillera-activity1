package com.example.demo;

public class Legend {
    private Long id;
    private String heroes;
    private double bp;

    public Legend() {}

    public Legend(Long id, String heroes, double bp) {
        this.id = id;
        this.heroes = heroes;
        this.bp = bp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return heroes;
    }

    public void setName(String heroes) {
        this.heroes = heroes;
    }

    public double getPrice() {
        return bp;
    }

    public void setPrice(double bp) {
        this.bp = bp;
    }
}