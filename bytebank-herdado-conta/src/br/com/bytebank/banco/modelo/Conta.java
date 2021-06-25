package br.com.bytebank.banco.modelo;

/**
 * Classe que representa uma conta no ByteBank
 * @author Natalia
 *
 */


public abstract class Conta {
	
	//Atributos
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero .
	 * 
	 * @param agencia parametro agencia
	 * @param numero parametro numero da agencia
	 */
	
	public Conta(int agencia,int numero) {
		total++;
		//System.out.println("o total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma conta " + this.numero);
		
	}
	
	//Metodos
	public  abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor da conta
	 * @return retorno verdadeiro com valor
	 */

	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor,Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
			return false;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <=0) {
			System.out.println("não pode valor menor igual a 0");
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
}
