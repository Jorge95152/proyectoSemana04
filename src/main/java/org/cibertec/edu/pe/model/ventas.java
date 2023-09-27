package org.cibertec.edu.pe.model;

import java.util.Date;

public class ventas {
	
	private String IdVenta;
	private String FechaVenta;
	private int Numero_Productos;
	private Double TotalPagar;
	
	
	
	
	public ventas() {
	
	}


	public ventas(String idVenta, String fechaVenta, int numero_Productos, Double totalPagar) {
		
		IdVenta = idVenta;
		FechaVenta = fechaVenta;
		Numero_Productos = numero_Productos;
		TotalPagar = totalPagar;
	}


	public String getIdVenta() {
		return IdVenta;
	}


	public void setIdVenta(String idVenta) {
		IdVenta = idVenta;
	}


	public String getFechaVenta() {
		return FechaVenta;
	}


	public void setFechaVenta(String fechaVenta) {
		FechaVenta = fechaVenta;
	}


	public int getNumero_Productos() {
		return Numero_Productos;
	}


	public void setNumero_Productos(int numero_Productos) {
		Numero_Productos = numero_Productos;
	}


	public Double getTotalPagar() {
		return TotalPagar;
	}


	public void setTotalPagar(Double totalPagar) {
		TotalPagar = totalPagar;
	}
	
	
	
}
