package pl.exercise.ferry.ticket.person;

import pl.exercise.ferry.pax.PaxType;

public class Senior extends PersonTicket {
    protected Senior(PaxType paxType, int age) {
        super(paxType, age);
    }
}
