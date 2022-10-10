package atividade08;

import java.util.ArrayList;

public class Selecao {
    private ArrayList<Jogador> time;
    private Tecnico tecnico;
    
    public Selecao() {
        this.time = new ArrayList<>();
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    public void convocar(Jogador jogador) {
        this.time.add(jogador);
    }
    
    public void cortar(Jogador jogador) {
        if (time.contains(jogador)) {
            time.remove(jogador);
        }
    }
    
    public void verTime() {
        for(int numero = 1; numero <= time.size(); numero++) {
            System.out.printf(
                "Jogador %d: %s \n", 
                time.get(numero).getNumero(), 
                time.get(numero).getNome()
                + (time.get(numero).getPosicao())
            );
        }
    }
    
}
