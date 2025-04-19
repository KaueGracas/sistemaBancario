package model.entities;

import model.exception.Excecoes;

public class Conta {
    private Integer agencia;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta(Integer agencia, Double limiteSaque, Double saldo, String titular) {
        this.agencia = agencia;
        this.limiteSaque = limiteSaque;
        this.saldo = saldo;
        this.titular = titular;
    }


    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposito (double quantia) {
        saldo += quantia;
    }

    public void saque (double quantia) {
        validarRetirada(quantia);
        saldo -= quantia;
    }

    private void validarRetirada(double quantia) {
        if ( quantia > getLimiteSaque()) {
            throw new Excecoes("Saque recusado: valor excede o limite!");
        }
        if (quantia > getSaldo()){
            throw new Excecoes("Valor solicitado é maior que o saldo!");

        }
    }

}



















