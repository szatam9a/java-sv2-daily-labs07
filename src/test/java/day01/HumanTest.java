package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    @Test
    void aWorkingTest(){
        Human human = new Human("Józska Pista", 100);
        assertEquals("Józska Pista",human.getName());
        assertEquals(100 , human.getAge());
    }
}