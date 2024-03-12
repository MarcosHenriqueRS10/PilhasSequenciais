package aplicacao;

import pilhas.PilhaInt;

public class MainTeste {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		pilha.init();
		
		pilha.push(10);
		pilha.push(12);	
		pilha.push(22);
		pilha.push(33);	
		pilha.push(44);
		pilha.push(55);	
		pilha.push(66);
			
		if (!pilha.isEmpty())  
			System.out.println("Valor que está no topo da pilha "+ pilha.top());
		else
			System.out.println("Pilha Vazia");
		
		pilha.esvaziar();
		
//		if (pilha.isEmpty()!=true)  
//			System.out.println("Valor retirado da pilha "+ pilha.pop());
//		else
//			System.out.println("Pilha Vazia");
//		
//		if (pilha.isEmpty()!=true)  
//			System.out.println("Valor retirado da pilha "+ pilha.pop());
//		else
//			System.out.println("Pilha Vazia");
//		
//		if (pilha.isEmpty()!=true)  
//			System.out.println("Valor retirado da pilha "+ pilha.pop());
//		else
//			System.out.println("Pilha Vazia");
		//mesma coisa a operação abaixo
	//System.out.println("valor retirado da pilha "+ pilha.pop());
	//System.out.println("valor retirado da pilha "+ pilha.pop());

		
		}

	}
