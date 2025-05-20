package com.mygroup.snakes_and_ladders.domain.model;

public class Player {
    private final String name;
    private Position position;

    public Player(String name){
        this.name = name;
        this.position = null;
    }

    public String getName(){
        return this.name;
    }

    public Position getPosition(){
        return this.position;
    }

    public void move(Position new_position){
        this.position = new_position;
    }
}
