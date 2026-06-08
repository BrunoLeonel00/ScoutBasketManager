/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author beuno
 */

public class Pivo extends jogador {

    public Pivo(String nome, int idade, double altura, int pontos, int rebotes, int assistencias) {
        super(nome, idade, altura, pontos, rebotes, assistencias);
    }

    @Override
    public String mostrarFuncao() {
        return "Pivô: joga próximo à cesta, pega rebotes e protege o garrafão.";
    }
}
