package bll;

import java.util.Scanner;

import ui.pName;

public class Menu {

	Scanner entry = new Scanner(System.in);
	pName p = new pName();
	
	public void displayOptions() {
		System.out.println("Bienvenido porfa selecccione un ejercicio");
		System.out.println("Capturar el nombre dentro de un Array");
		System.out.println("Calcular y validar el area de un circulo");
		System.out.println("Calcular la suma, resta, multiplicacion y dividimos de dos numeros");
		System.out.println("Calcular y validar un producto con desc, costo y cantidad");	
		System.out.println("Capturar el nombre en un Array y invertirlo");
		
	}
	
	
	public void menu() {
		
	displayOptions();
		Short opc;
		
		do {
			opc = entry.nextShort();
			switch(opc) {
			case 1:
				p.Principal();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
				default:
					break;
			}
		}while(opc != 6);
		
		
	}
	
}
