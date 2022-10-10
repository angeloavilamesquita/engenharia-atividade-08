package atividade08;

import java.util.ArrayList;

public class Fase {
    private String inicio;
    private String fim;
    private ArrayList<Grupo> grupos;

    public Fase() {
        this.grupos = new ArrayList<>();
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }
    
}
