package pl.exercise.ferry.ticket.cargo;

import pl.exercise.ferry.ticket.Ticket;

import java.math.BigDecimal;


abstract class CargoTicket implements Ticket {


    @Override
    public BigDecimal getPrice() {
        return BigDecimal.ZERO;
    }
}
