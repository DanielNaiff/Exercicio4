package classes.concretas;

import classes.abstratas.AnimalAB;
import classes.abstratas.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {
    public Cachorro(String nome, int idade, String habitat, int quantidadePatas, double peso) {
        super(nome, "Animal Terrestre", idade, habitat, quantidadePatas, peso);
    }

    @Override
    public void comer(int quantidade) {
        quantidadeComida += quantidade;
        System.out.println("Cachorro comeu " + quantidade + " unidades de comida.");
    }

    @Override
    public void moverse(int distancia) {
        distanciaPercorrida += distancia;
        System.out.println("Cachorro se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println("Cachorro dormiu por " + horas + " horas.");
    }
}
