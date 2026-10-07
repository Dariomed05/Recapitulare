package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Scoala
{
    private Map<String, Clasa> clase;
    public Scoala()
    {
        this.clase = new HashMap<>();
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
}
