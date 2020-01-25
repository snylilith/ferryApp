package pl.exercise.ferry;

import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.ticket.person.Adult;
import pl.exercise.ferry.ticket.person.Child;
import pl.exercise.ferry.ticket.person.Senior;
import pl.exercise.ferry.ticket.person.Young;
import pl.exercise.ferry.ticket.vehicle.Bike;
import pl.exercise.ferry.ticket.vehicle.Bus;
import pl.exercise.ferry.ticket.vehicle.Car;
import pl.exercise.ferry.ticket.vehicle.Truck;

import java.util.ArrayList;
import java.util.List;


public class Singleton {

    public void add(){
        ticket.add("Child");
        ticket.add("Young");
        ticket.add("Adult");
        ticket.add("Senior");
        ticket.add("Bus");
        ticket.add("Car");
        ticket.add("Truck");
        ticket.add("Bike");

    }

    ArrayList<String> ticket = new ArrayList<String>();


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
