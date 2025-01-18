package br.edu.ifs.avaliacao;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

				int opcao ;
				Menu menu = new Menu ();
				menu.imprimir();
				Scanner leia = new Scanner(System.in);
				opcao = leia.nextInt();
				while(opcao != 0) {
					switch (opcao) {
					case 1:
						System.out.println("Cadastrar Pássaro");
						break;
					
					case 2:
						System.out.println("Listar Pássaro");
						break;
						
					case 3:
						System.out.println("Cadastrar Cão");
						break;
					
					case 4:
						System.out.println("Listar Cão");
						break;
						
					case 5:
						System.out.println("Cadastrar Gato");
						break;
						
					case 6:
						System.out.println("Listar Gato");
						break;
						
					case 7:
						System.out.println("Cadastrar Tartaruga");
						break;
						
					case 8:
						System.out.println("Listar Tartaruga");
						break;
						
					case 9:
						System.out.println("Cadastrar Lobo");
						break;
						
					case 10:
						System.out.println("Listar Lobo");
						break;
						
					}
					menu.imprimir();
					opcao = leia.nextInt();
				}
				leia.close();
			}	
	}
