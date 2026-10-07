package org.example;

public class Main {
    public static void main(String[] args)
    {
        Scoala scoala = new Scoala();

        Clasa clasa1A = new Clasa(30, NumarClasa.I, 'A');
        Clasa clasa2B = new Clasa(25, NumarClasa.II, 'B');

        scoala.adaugaClasa("1A", clasa1A);
        scoala.adaugaClasa("2B", clasa2B);


        Elev elev1 = new Elev("Darius", Gen.Masculin);
        Elev elev2 = new Elev("Andreea", Gen.Feminin);
        Elev elev3 = new Elev("Sigma", Gen.Masculin);

        scoala.adaugaElevInClasa("1A", elev1);
        scoala.adaugaElevInClasa("1A", elev2);
        scoala.adaugaElevInClasa("2B", elev3);

        System.out.println("Numar total clase la inceput: " + scoala.getNumarClase());
        System.out.println("Total elevi in scoala la inceput: " + scoala.getTotalElevi());

        clasa1A.eliminaElev(elev2);
        System.out.println("Numarul de elevi dupa eliminarea unuia dintre ei: " + scoala.getTotalElevi());

        scoala.eliminaElevDupaNume("Darius");
        System.out.println("Total elevi dupa stergerea lui Darius: " + scoala.getTotalElevi());

        scoala.eliminaClasa("1A");
        System.out.println("Numar clase dupa stergerea clasei 1A: " + scoala.getNumarClase());
    }
}