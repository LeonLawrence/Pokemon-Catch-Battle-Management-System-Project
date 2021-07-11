package revised_code;

public class Pokemon {

    String name;
    int health;

    Pokemon(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getPokemonDetail() {
        return "Name: " + name + "Health: " + health;
    }

}
