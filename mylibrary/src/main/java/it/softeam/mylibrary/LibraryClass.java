package it.softeam.mylibrary;

public class LibraryClass {

    private double random = -42;

    public void generateRandom(){
        random = Math.random();
    }

    public double getRandom(){
        return random;
    }

}
