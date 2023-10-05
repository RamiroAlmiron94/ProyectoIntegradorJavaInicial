package edu.curso.java;

import java.text.*;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorDeCSV gestorDeCSV = new GestorDeCSV();
		GestorDeProductosJDBC gestorDeProductosJDBC = new GestorDeProductosJDBC();
		
		/*System.out.println("********Recuperando Los Productos Del CSV********");
		
		ArrayList<Producto> productosRecuperados;
		try {
			productosRecuperados = gestorDeCSV.leerCSV("C:\\Users\\rami3\\listadodeproductos.csv");
			for (Producto p : productosRecuperados) {
				System.out.println(p);
			}
			
			gestorDeProductosJDBC.guardarProductosEnLaBaseDeDatos(productosRecuperados);
			
		} catch (ProductoException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		System.out.println("********Generando Los Productos En El CSV********");
		
		try {
			ArrayList<Producto> productos = gestorDeProductosJDBC.recuperarProductosDeLaDaseDeDatos();
			gestorDeCSV.escribirCSV("C:\\Users\\rami3\\listasdeproductos_generado_010782023.csv", productos);
		} catch(ProductoException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}

}
