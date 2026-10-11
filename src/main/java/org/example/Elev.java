package org.example;

import java.util.HashSet;
import java.util.Set;

public class Elev
{
    private String nume;
    private Gen gen;
    private Set<String> activitati;

    public Elev(String nume, Gen gen)
    {
        this.nume = nume;
        this.gen = gen;
        this.activitati = new HashSet<>();
    }

    public String getNume()
    {
        return nume;
    }

    public Gen getGen()
    {
        return gen;
    }

    public Set<String> getActivitati()
    {
        return activitati;
    }

    public void adaugaActivitate(String numeActivitate)
    {
        activitati.add(numeActivitate);
    }

    public void eliminaActivitate(String numeActivitate)
    {
        activitati.remove(numeActivitate);
    }
}
