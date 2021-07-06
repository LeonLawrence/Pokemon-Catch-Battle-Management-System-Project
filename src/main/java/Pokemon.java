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


}
