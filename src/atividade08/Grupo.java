package atividade08;

import java.util.ArrayList;

public class Grupo {
    private ArrayList<Selecao> times;
    
    public Grupo() {
        this.times = new ArrayList<>();
    }
    
    public void adicionaTime(Selecao time) {
        this.times.add(time);
    }
}
