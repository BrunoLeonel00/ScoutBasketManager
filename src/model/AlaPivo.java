/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author beuno
 */

public class AlaPivo extends jogador {

    public AlaPivo(String nome, int idade, double altura, int pontos, int rebotes, int assistencias) {
        super(nome, idade, altura, pontos, rebotes, assistencias);
    }

    @Override
    public String mostrarFuncao() {
        return "Ala Pivô: Mais versatil que o pivo, podendo jogar tanto na parte de cima da quadra"
                + "quanto na parte de baixo";
    }
}