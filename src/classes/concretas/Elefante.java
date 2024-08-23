package classes.concretas;

import classes.abstratas.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB {
    public Elefante(String nome, int idade, String habitat, int quantidadePatas, double peso) {
        super(nome, "Animal Terrestre", idade, habitat, quantidadePatas, peso);
    }

    @Override
    public void comer(int quantidade) {
        quantidadeComida += quantidade;
        System.out.println("Elefante comeu " + quantidade + " unidades de comida.");
    }

    @Override
    public void moverse(int distancia) {
        distanciaPercorrida += distancia;
        System.out.println("Elefante se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println("Elefante dormiu por " + horas + " horas.");
    }
}
