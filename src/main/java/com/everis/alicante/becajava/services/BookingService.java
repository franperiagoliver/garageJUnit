package com.everis.alicante.becajava.services;

import java.util.Date;
import java.util.List;

import com.everis.alicante.becajava.domain.Booking;

public interface BookingService {
	
	Booking findBookingById(int id);
	
	List<Booking> list();
	
	Booking findBooking(String field);
	
	List<Booking> findBookingByDate(Date fechaInicio, Date fechaFin);

	void create(Booking booking);

	void updateBooking(Booking booking);
	
}
