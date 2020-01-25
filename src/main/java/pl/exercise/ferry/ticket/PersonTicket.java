package pl.exercise.ferry.ticket;

import pl.exercise.ferry.pax.PaxType;

import java.math.BigDecimal;

public abstract class PersonTicket implements Ticket{
    private final PaxType paxType;


    protected PersonTicket(PaxType paxType) {
        this.paxType = paxType;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.ZERO;
    }
}
