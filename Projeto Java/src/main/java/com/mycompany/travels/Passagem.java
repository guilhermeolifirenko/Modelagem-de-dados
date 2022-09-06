package com.mycompany.travels;
/**
 *
 * @author Guilherme Olifirenko
 */
public class Passagem {
    // Atributos
    private int id, dia, mes, ano, poltrona;
    private double horario, valor, desconto;
    private String destino, partida, chegada;
    
    // Métodos Especiais
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getHorario() {
        return horario;
    }
    public void setHorario(double horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPartida() {
        return partida;
    }
    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getChegada() {
        return chegada;
    }
    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public int getPoltrona() {
        return poltrona;
    }
    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    
}
