package com.fluxo.controle;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parUm = scan.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parDois = scan.nextInt();
		
		try {
			contar(parUm, parDois);		
		}catch (ParametrosInvalidosException exception) {
			System.err.println(exception);
		}
	}
	
	static void contar(Integer parUm, Integer parDois ) throws ParametrosInvalidosException {
		if (parUm == null || parDois == null) {
            throw new ParametrosInvalidosException("Os parâmetros não podem ser nulos");
        }else if(parUm > parDois){
            throw new ParametrosInvalidosException("O primeiro parametro não pode ser maior que o segundo");
        }else{
            int subtracao = parDois - parUm;
            System.out.println("Resultado da subtração: "+ subtracao);
            for(int i = subtracao; i > 0; i--){
                System.out.printf("Imprimindo número %s \n",i);
            }
        }
	}
}
