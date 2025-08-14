package Model;

import java.util.HashMap;
import java.util.Map;

public class Race {
    //variables
    private String name;

    //creating map
    private static Map<String, Race> races = new HashMap<>();

    //constructor
    public Race(String pName) {
        this.setName(pName);
    }

    //getter and setter
    public String getName() {
        return this.name;
    }

    public void setName(String pName) {
        this.name=pName;
    }

    public static Map<String, Race> getRaces() { //get races
        return races;
    }

    @Override
    public String toString() {
        return "race --> " + this.getName();
    }

    //test
    public static void main(String[] args) {
        Race.getRaces().put("Elf", new Race("Elf"));
        Race.getRaces().put("Ork", new Race("Ork"));
        System.out.println(races);

    }
}
