package Model;

import Controller.CreatPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    public static void main(String[] args) {




        //creating players

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players : ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Person> groups = new ArrayList<Person>();
        for (int i = 0; i<n ; i++){
            CreatPerson.main(args);

        }
        System.out.println("Welcome to the group : " + groups);
    }
}
