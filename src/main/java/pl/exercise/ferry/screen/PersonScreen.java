package pl.exercise.ferry.screen;

import pl.exercise.ferry.Singleton;
import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.person.Adult;
import pl.exercise.ferry.ticket.person.Child;
import pl.exercise.ferry.ticket.person.Senior;
import pl.exercise.ferry.ticket.person.Young;

import java.util.Scanner;

public class PersonScreen implements Screen {
    @Override
    public void interact() {
        System.out.println("Podaj wiek:");
        final Scanner in = new Scanner(System.in);
        Singleton.getInstance();

        int age = in.nextInt();

        if (age <= 3) {
            System.out.println("Podróżuje za darmo");
            new Child(PaxType.CHILD, age);
        } else if (age > 3 & age <= 18) {
            System.out.println("5zł");
            new Young(PaxType.YOUNG, age);
        } else if (age > 18 & age <= 70) {
            System.out.println("10zł");
            new Adult(PaxType.ADULT, age);
        } else {
            System.out.println("5zł");
            new Senior(PaxType.SENIOR, age);
        }

        System.out.println("Czy chcesz kupić następny bilet?");


        String firstResponse = in.nextLine();

        if ("tak".equalsIgnoreCase(firstResponse)) {
            TicketScreen ticketScreen = new TicketScreen();
            ticketScreen.interact();

        }
    }
}
