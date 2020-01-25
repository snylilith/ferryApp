package pl.exercise.ferry.ticket.vehicle;

import java.math.BigDecimal;

import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.vehicle.VehicleType;

public abstract class VehicleTicket implements Ticket {

  private final VehicleType vehicleType;
  private final String owner;

  VehicleTicket(VehicleType vehicleType, String owner) {
    this.vehicleType = vehicleType;
    this.owner = owner;
  }

  @Override
  public BigDecimal getPrice() {
    return BigDecimal.ZERO;
  }

}
