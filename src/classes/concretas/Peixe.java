package classes.concretas;

import classes.abstratas.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(String nome, int idade, String habitat, double peso, double v) {
        super(nome, "Animal Marinho", idade, habitat, peso);
    }

    @Override
    public void comer(int quantidade) {
        quantidadeComida += quantidade;
        System.out.println("Peixe comeu " + quantidade + " unidades de comida.");
    }

    @Override
    public void nadar(int distancia) {
        distanciaPercorrida += distancia;
        System.out.println("Peixe nadou " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println("Peixe dormiu por " + horas + " horas.");
    }

    @Override
    public void moverse(int distancia) {
        nadar(distancia);
    }
}
