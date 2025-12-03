package com.example.web.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="fb")
@Scope(value="prototype")
public class FlightBean {
private String flightID;
private String flightName;
private int seatingCapacity;
private int reservationCapacity;
public String getFlightID() {
	return flightID;
}
public void setFlightID(String flightID) {
	this.flightID = flightID;
}
public String getFlightName() {
	return flightName;
}
public void setFlightName(String flightName) {
	this.flightName = flightName;
}
public int getSeatingCapacity() {
	return seatingCapacity;
}
public void setSeatingCapacity(int seatingCapacity) {
	this.seatingCapacity = seatingCapacity;
}
public int getReservationCapacity() {
	return reservationCapacity;
}
public void setReservationCapacity(int reservationCapacity) {
	this.reservationCapacity = reservationCapacity;
}
@Override
public String toString() {
	return "FlightBean [flightID=" + flightID + ", flightName=" + flightName + ", seatingCapacity=" + seatingCapacity
			+ ", reservationCapacity=" + reservationCapacity + "]";
}

}
