package org.example;

import java.util.HashSet;
import java.util.Set;

public class Activitate
{
    private String nume;
    private Profesor coordonator;
    private Set<Elev> eleviParticipanti;

    public Activitate(String nume, Profesor coordonator)
    {
        this.nume = nume;
        this.coordonator = coordonator;
        this.eleviParticipanti = new HashSet<>();
    }

    public String getNume()
    {
        return nume;
    }

    public Profesor getCoordonator()
    {
        return coordonator;
    }

    public Set<Elev> getEleviParticipanti()
    {
        return eleviParticipanti;
    }

    public void adaugaElev(Elev elev)
    {
        eleviParticipanti.add(elev);
    }

    public void eliminaElev(Elev elev)
    {
        eleviParticipanti.remove(elev);
    }

    public int getNumarParticipanti()
    {
        return eleviParticipanti.size();
    }
}