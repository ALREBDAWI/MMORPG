package Controller;

import Model.Race;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Race.getRaces().put("Elf", new Race("Legolas"));
        System.out.println(Race.getRaces());
    }
}