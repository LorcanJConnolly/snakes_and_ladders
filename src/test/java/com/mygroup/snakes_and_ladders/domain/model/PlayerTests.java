package com.mygroup.snakes_and_ladders.domain.model;

import org.junit.jupiter.api.Test;

public class PlayerTests {
    private final Player player = new Player("test");

    @Test
    void initialisationTest(){
        assert player.getName().equals("test");
    }

    @Test
    void movePlayerTest(){
        Position new_position = new Position(1, 2);
        player.move(new_position);
        assert player.getPosition().equals(new Position(1, 2));

    }
}
