package org.cibertec.edu.pe.controller;


import java.util.ArrayList;
import java.util.Date;

import org.cibertec.edu.pe.model.persona;
import org.cibertec.edu.pe.model.ventas;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaMundo{
	
    @GetMapping("/")
    public String Inicio(Model model) {
    return "Index";
    }

    @GetMapping("/Hola ")
    public String holaMundo(Model model) {
    	String msg = "Hola Mundo";
    	model.addAttribute("mensaje",msg);
    	model.addAttribute("DNI", "12345678");
    	model.addAttribute("APELLIDOS", "FLORES VERA");
    	model.addAttribute("EDAD", "25");
    	
        return "HolaMundo";
    }
    
    @GetMapping("/listado")
    public String listado(Model model) {
    	ArrayList<String> colores = new ArrayList<>();
    	colores.add("AZUL");
    	colores.add("ROJO");
    	colores.add("NEGRO");
    	colores.add("BLANCO");
    	colores.add("VERDE");
    	model.addAttribute("colores", colores);
    	return "listar";
    	
    }
    
    @GetMapping("/listado2")
    public String listado2(Model model) {
    	ArrayList<persona> Lista = new ArrayList<>();
    	Lista.add(new persona("12345678", "REYES FERNANDEZ", "JOSE LUIS",20, 'M'));
    	Lista.add(new persona("87564123", "GARCIA PEREZ", "ANA LUISA",30, 'F'));
    	Lista.add(new persona("98564123", "LOPEZ RIVERA", "JULIO ALBERTO",27, 'M'));
    	Lista.add(new persona("75469823", "GONZALES TORRES", "ROSA CLAUDIA",29, 'F'));
    	Lista.add(new persona("56486322", "ZAPATA PAZ", "CARLOS JOSE",25, 'M'));
    	model.addAttribute("lpersonas",Lista);
    	
    	return "listar2";
    }
    
    
    @GetMapping("/listadoventas")
    public String listarVentas(Model model) {
    	ArrayList<ventas> ventas = new ArrayList<>();
        ventas.add(new ventas("1", "10-09-2023", 5, 100.0));
        ventas.add(new ventas("2", "09-09-2023", 3, 50.0));
        ventas.add(new ventas("3", "08-09-2023", 7, 150.0));

        // Agregar la lista de ventas al modelo
        model.addAttribute("ventas", ventas);

        // Calcular el total de ventas
        double totalVentas = 0;
        for (ventas venta : ventas) {
            totalVentas += venta.getTotalPagar();
        }

        // Agregar el total de ventas al modelo
        model.addAttribute("totalVentas", totalVentas);

        // Devolver la vista para mostrar el listado de ventas
        return "ventas";
}
}
