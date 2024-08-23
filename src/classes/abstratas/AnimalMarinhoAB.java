package classes.abstratas;

public abstract class AnimalMarinhoAB extends AnimalAB {

    /*
    Eu coloquei a quantidade de patas como zero, porque geralmente animais marinhos não tem patas
    */
    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double peso) {
        super(nome, tipoAnimal, idade, habitat, 0, peso);
    }

    public abstract void nadar(int distancia);
}
