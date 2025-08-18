package View;

import Model.Group;
import Model.Race;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("loading ... \n\nto creat a player type 1, to creat a group of players type 2 ");
        int gamePlay = sc.nextInt();
        switch (gamePlay) {
            case 1:
                Group.main(args);
                break;

            case 2:

                break;

        }
    }
}
