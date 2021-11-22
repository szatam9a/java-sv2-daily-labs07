package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    private Human human;
    @Test
    void aWorkingTest(){
        Human human = new Human("Józska Pista", 100);
        assertEquals("Józska Pista",human.getName());
        assertEquals(100 , human.getAge());
    }
    @Test
    void aTestForThrowAge(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                human = new Human("Józksa", 1));
        assertEquals("a név nem két részből áll", exception.getMessage());
    }
    @Test
    void aTestForThrowName(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                human = new Human("Józskaa Pista" , 121));
        assertEquals("senki se lehet 120évesnél öregebb", exception.getMessage());
    }
}