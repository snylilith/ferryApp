package pl.exercise.ferry.screen;

import java.util.Scanner;
import java.math.BigDecimal;

public class VehicleScreen implements Screen {
    @Override
    public void interact() {
        System.out.println("Podaj typ pojazdu:");
        final Scanner in = new Scanner(System.in);

        String typ = in.nextLine();
        switch (typ) {
            case "osobowy":
                System.out.println("20zł");
                break;
            case "motor":
                System.out.println("10zł");
                break;
            case "ciężarówka":
                System.out.println("10zł za tonę");

                System.out.println("Podaj wagę pojazdu:");
                final Scanner in2 = new Scanner(System.in);
                BigDecimal wagaCiezarowki = (in.nextBigDecimal());

                BigDecimal cenaBiletu = wagaCiezarowki.multiply(BigDecimal.valueOf(10));
                System.out.print("Cena biletu: " + cenaBiletu);
                System.out.println();
                break;

            case "autobus":
                System.out.println("5zł za metr");
                break;
            default:
                System.out.println("Dostępne typy: osobowy, motor, ciężarówka, autobus");
        }
        System.out.println("Czy chcesz kupić następny bilet?");

        String firstResponse = in.nextLine();

        if ("tak".equalsIgnoreCase(firstResponse)) {
            TicketScreen ticketScreen = new TicketScreen();
            ticketScreen.interact();

        }
    }
}