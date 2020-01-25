package pl.exercise.ferry.ticket;

import java.math.BigDecimal;


abstract class CargoTicket implements Ticket{


    @Override
    public BigDecimal getPrice() {
        return BigDecimal.ZERO;
    }
}
