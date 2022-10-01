package contacorrente;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		short opcao;

		ContaCorrente conta = new ContaCorrente();
		
		conta.contaEspecial = true;
		conta.numeroDaConta = 001;
		conta.saldoDaConta = 200.00;
		conta.valorLimiteDaConta = 200000;
		
		
		System.out.println("Menu");
		System.out.println("Digite 1 para Saque");
		System.out.println("Digite 2 para Consultar Saldo");
		System.out.println("Digite 3 para Depositar");
		System.out.println("Digite 4 para verificar se está usando cheque especial");
		
		opcao = scan.nextShort();

		switch (opcao) {
		case 1:
			conta.realizarSaque();
			break;
		case 2:
			conta.consultarSaldo();
			break;
		case 3:
			conta.RealizarDeposito();
			break;
		case 4:
			conta.verificarChequeEspecial();
			break;
		default:
			System.out.println("Opção inválida!");
		}
		
		

	}

}
