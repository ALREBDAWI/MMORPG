package Controller;

import Model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateGroup {
    public static ArrayList<Person> createGroup(){
        //creating a group of 3 players
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter players details : ");
        ArrayList<Person> group = new ArrayList<Person>();
        for (int i = 0; i<3 ; i++){
            group.add(CreatPerson.createPerson());
        }
        System.out.println("Welcome to the group : " + group);
        return group;
    }
}
