package task2;

import task2.*;

import java.util.ArrayList;
import java.util.List;

class House {
    private Roof roof;
    private Walls walls;
    private Windows windows;
    private Doors doors;
    private List<Inhabitant> inhabitants;

    public House(Roof roof, Walls walls, Windows windows, Doors doors) {
        this.roof = roof;
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
        this.inhabitants = new ArrayList<>();
    }
    public void addInhabitant(Inhabitant inhabitant) {
        inhabitants.add(inhabitant);
    }

    public List<Inhabitant> getInhabitants() {
        return inhabitants;
    }
}