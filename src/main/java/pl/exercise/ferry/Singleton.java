package pl.exercise.ferry;

import pl.exercise.ferry.ticket.Ticket;


import java.util.ArrayList;
import java.util.List;


public class Singleton {

    public void add(Ticket ticket){
        tickets.add(ticket);


    }

    ArrayList<Ticket> tickets = new ArrayList<Ticket>();


    private Singleton (){
        if (Holder.INSTANCE != null){
            throw new IllegalStateException("Singleton already constructed");
        }
    }
    public static Singleton getInstance(){
        return Holder.INSTANCE;
    }
    private static class Holder{
        private static final Singleton INSTANCE = new Singleton();
    }
}
