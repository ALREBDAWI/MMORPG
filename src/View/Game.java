package View;

import Controller.CreatPerson;
import Controller.CreateGroup;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("loading ... \n\nto creat a group of players type 1, to creat a player type 2 ");
        int gamePlay = sc.nextInt();
        switch (gamePlay) {
            case 1:
                CreateGroup.createGroup();
                break;
            case 2:
                CreatPerson.createPerson();
                break;
        }
    }
}
