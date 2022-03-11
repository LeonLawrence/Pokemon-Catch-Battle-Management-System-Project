package model;

public class Pokemon {
    private String name;
    private int health;

    public Pokemon(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String pokemonInfo() {
        return "NAME: " + name + "\tHEALTH: " + health;
    }

    public int deductHealth1() {
        return health = health - 10;
    }

    public int deductHealth2() {
        return health = health - 20;
    }

    public int healthStatus() {
        return health;
    }
}


