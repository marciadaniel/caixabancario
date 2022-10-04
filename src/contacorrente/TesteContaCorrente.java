package contacorrente;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		short opcao;

		ContaCorrente conta = new ContaCorrente();

		conta.contaEspecial = true;
		conta.numeroDaConta = 001;
		conta.saldoDaConta = 200;
		conta.limiteChequeEspecial = 200;

		do {

			System.out.println("Menu");
			System.out.println("Digite 1 para Saque");
			System.out.println("Digite 2 para Depositar");
			System.out.println("Digite 3 para Consultar Saldo ");
			System.out.println("Digite 4 para verificar se está usando cheque especial");
			System.out.println("Digite 0 para sair");

			opcao = scan.nextShort();

			switch (opcao) {
			case 1:
				System.out.print("Quanto deseja levantar?\nR:");
				double valorALevantar = scan.nextDouble();

				boolean levantamentoEfectuado = conta.realizarSaque(valorALevantar);

				if (levantamentoEfectuado) {
					System.out.println("Levantamento efectuado com sucesso!\n Valor levantado:" + valorALevantar
							+ "Saldo actual:" + conta.saldoDaConta);
				} else {
					System.out.println("Não foi possível efectuar o levantamento, o saldo é insuficiente!");
				}
				break;
			case 2:
				System.out.print("Insira o valor a depositar:");
				double valorADepositar = scan.nextDouble();
				conta.RealizarDeposito(valorADepositar);

				break;
			case 3:
				conta.consultarSaldo();

				break;
			case 4:
				boolean verificacao = conta.verificarChequeEspecial();
				if (verificacao) {
					System.out.println("Está usando o cheque especial!");
				} else {
					System.out.println("Não está usando o cheque especial!");
				}
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);
	}

}
