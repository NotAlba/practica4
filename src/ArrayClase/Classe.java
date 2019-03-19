package ArrayClase;

import java.util.ArrayList;
import java.util.Scanner;

private class Classe {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> clase =new ArrayList();
		

		int contador= 1;
		//Redueix el maxim per a no tenir que introduïr l'alumne 10 vegades
		for (int i=0; i<=10 ; i++) {
			ArrayList a= new ArrayList();
			Scanner alumne = new Scanner(System.in);
			System.out.println("Introdueix el nom de l'alumne");
		     String nom = alumne.nextLine();
		     a.add(nom);
		     
			while (contador>0) {
				
		    	 Scanner calif = new Scanner(System.in);
					System.out.println("Introdueix la nota de l'alumne");
					int nota = calif.nextInt();
					if (nota>0) {
						a.add(nota);
					}
					else {
						contador=contador-1;
					}		     
		     }
			contador=1;	
			clase.add(a);	
		}
		System.out.println(clase);
	}

}
