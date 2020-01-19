package pl.exercise.ferry.screen;

import java.util.Scanner;

public class MainScreen implements Screen {

  private final Scanner in = new Scanner(System.in);

  public void interact() {
    System.out.println("Witaj, czy chcesz kupić bilet?");

    String firstResponse = in.nextLine();

    if ("tak".equalsIgnoreCase(firstResponse)) {
      TicketScreen ticketScreen = new TicketScreen();
      ticketScreen.interact();
    }
  }
}


