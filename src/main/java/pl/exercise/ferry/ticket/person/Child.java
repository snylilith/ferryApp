package pl.exercise.ferry.ticket.person;

import pl.exercise.ferry.pax.PaxType;

public class Child extends PersonTicket {
    protected Child(PaxType paxType, int age) {
        super(paxType, age);
    }
}
