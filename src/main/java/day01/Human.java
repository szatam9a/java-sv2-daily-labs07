package day01;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        if (!(name.trim().contains(" "))){
            throw new IllegalArgumentException("a név nem két részből áll");
        }
        if (age>120){ throw new IllegalArgumentException("senki se lehet 120évesnél öregebb");}
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
