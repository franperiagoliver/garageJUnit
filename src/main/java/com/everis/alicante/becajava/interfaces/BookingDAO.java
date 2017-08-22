package com.everis.alicante.becajava.interfaces;

import java.util.Date;
import java.util.List;

import com.everis.alicante.becajava.domain.Booking;

public interface BookingDAO {
	
	void create(Booking booking);
	
	Booking readById(int id);
	
	void update(Booking booking);
	
	void delete(Booking booking);
	
	List<Booking> findAll();

	List<Booking> findByDate(Date fechaInicio, Date fechaFin);
	

}
