package core.pokemon.game.entity.player;

import java.text.DecimalFormat;

@SuppressWarnings("all")
public class DefaultLivingPlayer implements ILivingPlayer {

    private static final DecimalFormat formater;

    private String name;
    private String UUID;
    private int wins;
    private int loses;

    protected DefaultLivingPlayer(String name, String UUID) {
        this.name = name;
        this.UUID = UUID;
        this.wins = 0;
        this.loses = 0;
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getUUID() {
        return this.UUID;
    }

    protected void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public int getWins() {
        return this.wins;
    }

    public void increaseWins() {
        this.wins++;
    }

    public void setWins(int value) {
        this.wins = value;
    }

    public int getLoses() {
        return this.loses;
    }

    public void increaseLoses() {
        this.loses++;
    }

    public void setLoses(int value) {
        this.loses = value;
    }

    public double getMMR() {
        return Double.valueOf(formater.format((double) this.wins / (double) this.loses).replaceAll(",", "."));
    }

    static {
        formater = new DecimalFormat("#.###");
    }
}
