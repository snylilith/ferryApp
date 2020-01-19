package pl.exercise.ferry.screen;

import java.util.Scanner;

public class PersonScreen implements Screen {
    @Override
    public void interact() {
        System.out.println("Podaj wiek:");
        final Scanner in = new Scanner(System.in);

        int age = in.nextInt();

        if (age <= 3) {
            System.out.println("Podróżuje za darmo");
        } else if (age > 3 & age <= 18) {
            System.out.println("5zł");
        } else if (age > 18 & age <= 70) {
            System.out.println("10zł");
        } else {
            System.out.println("5zł");
        }
        in.reset();
        System.out.println("Czy chcesz kupić następny bilet?");


        String anyOtherResponse = in.nextLine();

        if ("tak".equalsIgnoreCase(anyOtherResponse)) {
            TicketScreen ticketScreen = new TicketScreen();
            ticketScreen.interact();

        }
    }
}
