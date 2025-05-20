package com.mygroup.snakes_and_ladders.domain.model;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Position other = (Position) obj;
        return this.x == other.x && this.y == other.y;
    }
}
