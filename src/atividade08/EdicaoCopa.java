package atividade08;

import java.util.ArrayList;

public class EdicaoCopa {
    private Pais pais;
    private int ano;
    private Fase eliminatoria;
    private Fase oitavas;
    private Fase quartas;
    private Fase semi;
    private Fase partidaFinal;
    private ArrayList<Fase> fases;
    
    public EdicaoCopa() {
        this.fases = new ArrayList<>();
        this.eliminatoria = new Fase();
        this.fases.add(this.eliminatoria);
        this.oitavas = new Fase();
        this.fases.add(this.oitavas);
        this.quartas = new Fase();
        this.fases.add(this.quartas);
        this.semi = new Fase();
        this.fases.add(this.semi);
        this.partidaFinal = new Fase();
        this.fases.add(this.partidaFinal);
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Fase getEliminatoria() {
        return eliminatoria;
    }

    public Fase getOitavas() {
        return oitavas;
    }

    public Fase getQuartas() {
        return quartas;
    }

    public Fase getSemi() {
        return semi;
    }

    public Fase getPartidaFinal() {
        return partidaFinal;
    }
    
}
