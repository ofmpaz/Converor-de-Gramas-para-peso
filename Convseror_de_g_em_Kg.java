package projetoextra; 

import java.util.*; 
public class Aula_1 {
	public static void main(String[] args) {


		Scanner input = new Scanner(System.in); 
		
		System.out.println("Insera o valor em gramas: ");
		int gramas = input.nextInt(); 
		
		int kilos = gramas / 1000; 
		gramas = gramas % 1000; 
		
		System.out.println("Total de kilos é " + kilos + "Kg e " + gramas + "g");
		
		
	}	
	




}
