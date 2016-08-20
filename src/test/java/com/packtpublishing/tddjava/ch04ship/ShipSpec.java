package com.packtpublishing.tddjava.ch04ship;

import org.testng.annotations.*;

import static org.testng.Assert.*;

@Test
public class ShipSpec {
    public void whenInitiatedThenLocationIsSet() {
        Location location = new Location(new Point(1, 2), Direction.EAST);
        Ship ship = new Ship(location);
        assertEquals(location, ship.getLocation());
    }
}
