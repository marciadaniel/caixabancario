package contacorrente;

import java.util.Scanner;

public class ContaCorrente {

	int numeroDaConta;
	double saldoDaConta;
	boolean contaEspecial = true;
	double limiteChequeEspecial;
	double limiteDaConta;

	boolean realizarSaque(double valorALevantar) {

		if (valorALevantar <= saldoDaConta) {
			saldoDaConta = saldoDaConta - valorALevantar;
			return true;

		} else if (saldoDaConta > 0 && saldoDaConta < valorALevantar
				&& limiteChequeEspecial >= (valorALevantar - saldoDaConta)) {
			valorALevantar -= saldoDaConta;
			saldoDaConta -= saldoDaConta;
			saldoDaConta = saldoDaConta - valorALevantar;
			limiteChequeEspecial -= valorALevantar;
			return true;
		} else if (contaEspecial && valorALevantar <= limiteChequeEspecial) {
			saldoDaConta = saldoDaConta - valorALevantar;
			limiteChequeEspecial -= valorALevantar;
			return true;
		} else {
			return false;
		}
	}

	void RealizarDeposito(double valorADepositar) {

		Scanner scan = new Scanner(System.in);

		double saldoMaisDeposito = saldoDaConta + valorADepositar;

		if (saldoMaisDeposito <= limiteDaConta) {
			saldoDaConta = saldoDaConta - valorADepositar;
		} else {
			System.out.println("Valor limite  da conta excedido!\nValor limite da conta:" + limiteDaConta);
		}

	}

	void consultarSaldo() {

		System.out.println("O saldo disponível é:" + saldoDaConta);

	}

	boolean verificarChequeEspecial() {

		if (saldoDaConta < 0) {
			return true;
		} else
			return false;

	}

}
