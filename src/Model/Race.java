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

    static {
        //creating fixed races
        Race race1 = new Race("Elf");
        Race race2 = new Race("Ork");
        Race race3 = new Race("Man");
        Race.getRaces().put("elf", race1);
        Race.getRaces().put("ork", race2);
        Race.getRaces().put("man", race3);
    }

    public static Map<String, Race> getRaces() { //get races
        return races;
    }



    @Override
    public String toString() {
        return "race --> " + this.getName();
    }

}
