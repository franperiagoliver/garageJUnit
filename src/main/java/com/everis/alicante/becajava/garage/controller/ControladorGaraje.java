package com.everis.alicante.becajava.garage.controller;

import java.util.Date;
import java.util.List;

import com.everis.alicante.becajava.domain.Booking;
import com.everis.alicante.becajava.domain.Client;
import com.everis.alicante.becajava.domain.Parkingplace;
import com.everis.alicante.becajava.domain.Vehicle;

public interface ControladorGaraje {
	
	List<Parkingplace> listarPlazasLibres();	
	List<Client> listarClientes();
	List<Booking> listarReservas();
	List<Vehicle> listarVehiculos();
	List<Booking> listarReservasByFecha(Date fecInicio, Date fecFin);
	boolean reservarPlaza(Client client, Vehicle vehicle);
	double findImporteCliente(Client client);
	List<Parkingplace> listarPlazasOcupadas();
	Booking listarReservasById(int id);
	Boolean actualizarReserva(Booking booking);
	Client listarClientesById(Integer id);
	Boolean actualizarCliente(Client client);
}
