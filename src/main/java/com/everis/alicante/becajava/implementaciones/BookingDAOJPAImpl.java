package com.everis.alicante.becajava.implementaciones;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Parkingplace;
import com.everis.alicante.becajava.interfaces.BookingDAO;


public class BookingDAOJPAImpl implements BookingDAO{

	EntityManager em;
	Parkingplace parkingPlace = new Parkingplace();
	
	@Override
	public void create(Booking Booking) {
		em.getTransaction().begin();
		em.persist(Booking);			
		em.getTransaction().commit();
	}

	@Override
	public Booking readById(int id) {		
		return em.find(Booking.class, id);		
	}

	@Override
	public void update(Booking Booking) {
		em.getTransaction().begin();
		em.merge(Booking);
		em.getTransaction().commit();
		
	}

	@Override
	public void delete(Booking Booking) {
		em.getTransaction().begin();
		em.remove(Booking);
		em.getTransaction().commit();
	}

	public BookingDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Booking> findAll() {
	
		Query query = em.createNamedQuery("Booking.findAll");		
		
		return query.getResultList();
		
	}

	@Override
	public List<Booking> findByDate(Date fechaInicio, Date fechaFin) {
		Query query = em.createNativeQuery("select idBooking, bookingDate from booking "+
										 "	where bookingDate between ? and ?");
		query.setParameter(1, fechaInicio);
		query.setParameter(2, fechaFin);
		
		return query.getResultList();
	}


}
