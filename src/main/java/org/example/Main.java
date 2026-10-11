package org.example;

public class Main
{
    public static void main(String[] args)
    {
        Scoala scoala = new Scoala();

        Clasa clasa1A = new Clasa(67, NumarClasa.I, 'A');
        scoala.adaugaClasa("1A", clasa1A);

        Elev elev1 = new Elev("Darius", Gen.Masculin);
        Elev elev2 = new Elev("Andreea", Gen.Feminin);
        Elev elev3 = new Elev("Sigma", Gen.Masculin);

        scoala.adaugaElevInClasa("1A", elev1);
        scoala.adaugaElevInClasa("1A", elev2);
        scoala.adaugaElevInClasa("1A", elev3);

        Profesor profMate = new Profesor("Dl. Thor");
        Profesor profSport = new Profesor("Dl. Messi");
        Profesor profMuzica = new Profesor("Dna. Maria");

        Activitate info = new Activitate("Programare", profMate);
        Activitate sport = new Activitate("Fotbal", profSport);
        Activitate cor = new Activitate("Cor", profMuzica);

        scoala.adaugaActivitate("Programare", info);
        scoala.adaugaActivitate("Fotbal", sport);
        scoala.adaugaActivitate("Cor", cor);

        scoala.inscrieElevLaActivitate(elev1, "Programare");
        scoala.inscrieElevLaActivitate(elev2, "Programare");
        scoala.inscrieElevLaActivitate(elev1, "Fotbal");
        scoala.inscrieElevLaActivitate(elev3, "Cor");

        System.out.println("Situatia initiala: ");
        scoala.afiseazaTopActivitati();
        System.out.println("Elevi implicati in activitati: " + scoala.getNumarEleviCuCelPutinOActivitate());

        scoala.eliminaElevDinActivitate(elev1, "Programare");

        scoala.eliminaActivitate("Cor");

        System.out.println("Situatia dupa eliminari: ");
        scoala.afiseazaTopActivitati();
        System.out.println("Elevi implicati in activitati: " + scoala.getNumarEleviCuCelPutinOActivitate());
    }
}