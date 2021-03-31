package br.com.xti.poo;

import java.io.Serializable;

public class Conta implements Serializable {
	
	//Modificando acesso
	private String cliente;
	
	//Transiente 
	//transient bloqueia o acesso
	
	private double saldo;
	
	public Conta() {
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//Iniciando as variaveis no construtor
	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	
	
	
	public void exibeSaldo() {
		System.out.println(cliente+" seu saldo é: "+saldo);
	}
	
	public void saca(double valor) {
		saldo = saldo - valor;
		//saldo -= valor;
	}
	
	public void deposita(double valor) {
		saldo = saldo + valor;
		//saldo += valor;
	}

	public void tranferePara(Conta destino, double valor) {
		
		//O this referencia o objeto desta conta
		this.saca(valor);
		destino.deposita(valor);
		
	}
	
}
