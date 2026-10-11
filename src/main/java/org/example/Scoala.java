package org.example;

import java.util.*;

public class Scoala
{
    private Map<String, Clasa> clase;
    private Map<String, Activitate> activitati;

    public Scoala()
    {
        this.clase = new HashMap<>();
        this.activitati = new HashMap<>();
    }

    public void adaugaClasa(String id, Clasa clasa)
    {
        this.clase.put(id, clasa);
    }
    public void eliminaClasa(String id)
    {
        this.clase.remove(id);
    }
    public void adaugaElevInClasa(String id, Elev elev)
    {
        Clasa clasa = this.clase.get(id);
        if(clasa != null)
        {
            clasa.adaugaElev(elev);
        }
    }
    public void eliminaElevDupaNume(String nume)
    {
        for (Clasa clasa : clase.values()) {
            Iterator<Elev> iterator = clasa.getElevi().iterator();
            while (iterator.hasNext()) {
                Elev elev = iterator.next();
                if (elev.getNume().equals(nume)) {
                    iterator.remove();
                }
            }
        }
    }
    public int getNumarClase()
    {
        return this.clase.size();
    }
    public int getTotalElevi()
    {
        int total = 0;
        for(Clasa clasa :this.clase.values())
        {
            total+=clasa.getElevi().size();
        }
        return total;
    }
    public void adaugaActivitate(String idActivitate, Activitate activitate)
    {
        this.activitati.put(idActivitate, activitate);
    }

    public void eliminaActivitate(String idActivitate)
    {
        Activitate activitateEliminata = this.activitati.remove(idActivitate);
        if (activitateEliminata != null)
        {
            for (Elev elev : activitateEliminata.getEleviParticipanti())
            {
                elev.eliminaActivitate(idActivitate);
            }
        }
    }

    public void inscrieElevLaActivitate(Elev elev, String idActivitate)
    {
        Activitate activitate = activitati.get(idActivitate);
        if (activitate != null)
        {
            activitate.adaugaElev(elev);
            elev.adaugaActivitate(idActivitate);
        }
    }

    public void eliminaElevDinActivitate(Elev elev, String idActivitate)
    {
        Activitate activitate = activitati.get(idActivitate);
        if (activitate != null)
        {
            activitate.eliminaElev(elev);
            elev.eliminaActivitate(idActivitate);
        }
    }

    public void afiseazaTopActivitati()
    {
        List<Activitate> listaActivitati = new ArrayList<>(activitati.values());

        listaActivitati.sort((a1, a2) -> Integer.compare(a2.getNumarParticipanti(), a1.getNumarParticipanti()));

        for (Activitate act : listaActivitati) {
            System.out.println(act.getNume() + " - " + act.getNumarParticipanti() + " elevi");
        }
    }

    public int getNumarEleviCuCelPutinOActivitate() {
        Set<Elev> eleviActivi = new HashSet<>();
        for (Activitate activitate : activitati.values()) {
            eleviActivi.addAll(activitate.getEleviParticipanti());
        }
        return eleviActivi.size();
    }
}
