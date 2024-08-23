package classes.concretas;

import classes.abstratas.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {
    public Pombo(String nome, int idade, String habitat, int quantidadePatas, double peso, int quantidadeAsas, double envergaduraAssas) {
        super(nome, "Ave", idade, habitat, quantidadePatas, peso, quantidadeAsas, envergaduraAssas);
    }

    @Override
    public void comer(int quantidade) {
        quantidadeComida += quantidade;
        System.out.println("Pombo comeu " + quantidade + " unidades de comida.");
    }

    @Override
    public void moverse(int distancia) {
        System.out.println("Pombo se moveu " + distancia + " metros no solo.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println("Pombo dormiu por " + horas + " horas.");
    }

    @Override
    public void voar(int altura) {
        System.out.println("Pombo voou a uma altura de " + altura + " metros.");
    }
}

