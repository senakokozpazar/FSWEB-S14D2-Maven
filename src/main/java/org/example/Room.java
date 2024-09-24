package org.example;

public class Room {
    private String name;
    private Bedroom bedroom;

    public Room(String name, Bedroom bedroom) {
        this.name = name;
        this.bedroom = bedroom;
    }

    public String getName() {
        return name;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }
}
