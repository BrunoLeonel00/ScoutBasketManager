/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author beuno
 */
public class Armador extends jogador {
    
    public Armador(String name, int idade, double altura, int rebotes, int assistencias, int pontos){
        super(name, idade, altura, rebotes, assistencias, pontos);
    }
    @Override
    public String mostrarFuncao(){
        return "O armador coordena o jogo e dita o ritmo";
    }
    
}
