package pl.exercise.ferry.screen;

import java.util.Scanner;

public class TicketScreen implements Screen {

    @Override
    public void interact() {
        System.out.println("Jakiego biletu potrzebujesz?");
        System.out.println("1. Pasażerski");
        System.out.println("2. Dla pojazdu");

        final Scanner in = new Scanner(System.in);

        String secondResponse = in.nextLine();
        switch (secondResponse) {
            case "1":
                System.out.println("Wybrałeś bilet pasażerski");
                PersonScreen personScreen = new PersonScreen();
                personScreen.interact();
                break;

            case "2":
                System.out.println("Wybrałeś bilet dla pojazdu");
                VehicleScreen vehicleScreen = new VehicleScreen();
                vehicleScreen.interact();
                break;

            default:
                System.out.println("Wybierz opcję 1 lub 2");
                break;

        }
    }
}
