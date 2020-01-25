package pl.exercise.ferry.ticket.person;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.Ticket;

import java.math.BigDecimal;

public abstract class PersonTicket implements Ticket {

    private final PaxType paxType;
    private final int age;


    protected PersonTicket(PaxType paxType, int age) {

        this.paxType = paxType;
        this.age = age;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.ZERO;
    }
}
