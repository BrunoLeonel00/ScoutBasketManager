/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author beuno
 */
public class jogador {
    private String name;
    private int idade;
    private double altura;
    private int rebotes;
    private int assistencias;
    private int pontos;
    
    public jogador(String name, int idade, double altura, int rebotes, int assistencias, int pontos){
        this.name = name;
        this.idade = idade;
        this.altura = altura;
        this.assistencias = assistencias;
        this.pontos = pontos;
        this.rebotes = rebotes;
    }
    
    public String getNome(){
        return name;
    }
    public int getIdade(){
        return idade;
    
    }
    public double getAltura(){
        return altura;
    }
    public int getRebotes(){
        return rebotes;
    }
    
    public int getAssistencias(){
        return assistencias;
    }
    public int getPontos(){
        return pontos;
    }
    
    public double calculateDesempenho(){
        return pontos + rebotes + assistencias;
    }
    public String mostrarFuncao(){
        return "Jogador de Basquete.";
    }
    
}
