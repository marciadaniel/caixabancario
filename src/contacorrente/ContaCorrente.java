package contacorrente;

import java.util.Scanner;

public class ContaCorrente {
	
	int numeroDaConta;
	double saldoDaConta;
	boolean contaEspecial;
	double valorLimiteDaConta;
	
	void realizarSaque() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o valor a levantar:");
		double valorALevantar = scan.nextDouble();
		
		if(valorALevantar <= saldoDaConta) {
			saldoDaConta = saldoDaConta - valorALevantar;
		}else {
		System.out.println("Não há dinheiro suficiente na conta para poder efectuar este saque!");
	}
	  }
	
	void RealizarDeposito() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o valor a depositar:");
		double valorADepositar = scan.nextDouble();
		
		double saldoMaisDeposito = saldoDaConta + valorADepositar;
		
		if(saldoMaisDeposito <= valorLimiteDaConta ) {
			saldoDaConta = saldoDaConta - valorADepositar;
		}else {
		System.out.println("Valor limite  da conta excedido!\nValor limite da conta:" + valorLimiteDaConta);
	}
		
	}
	
	void consultarSaldo() {
		
		System.out.println("O saldo disponível é:" + saldoDaConta);
				
	}
	
	void verificarChequeEspecial() {
		
		if(saldoDaConta < 0) {
		System.out.println("Está usando o cheque especial!");
		}
		
	}
		
		
}
