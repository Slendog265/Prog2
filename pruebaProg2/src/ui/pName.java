package ui;

import java.util.Scanner;

import bll.Menu;
import dol.Nombre;

public class pName {

	Scanner entry = new Scanner(System.in);
	Nombre n = new Nombre();
	Menu m = new Menu();
	public void displayOptions() {
		System.out.println("Por favor selecione una");
		System.out.println();
		System.out.println("1.Agregar un nombre");
		System.out.println("2.Mostrar un nombre");
		
	}
	
	public void Principal() {
		displayOptions();
		Short opc;
		do {
			opc = entry.nextShort();
			switch(opc) {
			case 1:
				add();
				break;
			case 2:
				show();
				break;
			case 3:
				m.menu();
				break;
				default:
					break;
			}
		}while(opc != 3);
		
		
		
	}

        
	public void add() {
		System.out.println("Escriba el nombre por favor");
		n.setName(entry.next());
         }
	
	public void show() {
		
	}
}
