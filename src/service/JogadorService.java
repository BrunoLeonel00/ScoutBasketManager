/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author beuno
 */
import java.util.ArrayList;
import model.jogador;

public class JogadorService {

    private ArrayList<jogador> jogadores = new ArrayList<>();

    public void adicionarJogador(jogador jogador) {
        jogadores.add(jogador);
    }

    public ArrayList<jogador> listarJogadores() {
        return jogadores;
    }
}