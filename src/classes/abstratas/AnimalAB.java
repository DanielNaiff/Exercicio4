package classes.abstratas;
import classes.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected int quantidadePatas;
    protected double peso;
    protected int quantidadeComida;
    protected int distanciaPercorrida;
    protected int horasDormidas;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
        this.peso = peso;
    }

    @Override
    public void comer(int quantidade) {
        quantidadeComida += quantidade;
        System.out.println(nome + " comeu " + quantidade + " unidades de comida.");
    }

    @Override
    public void moverse(int distancia) {
        distanciaPercorrida += distancia;
        System.out.println(nome + " se moveu " + distancia + " metros.");
    }

    @Override
    public void dormir(int horas) {
        horasDormidas += horas;
        System.out.println(nome + " dormiu por " + horas + " horas.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(int distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public int getHorasDormidas() {
        return horasDormidas;
    }

    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }

    @Override
    public String toString() {
        return "AnimalAB{" +
                "nome='" + nome + '\'' +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                ", idade=" + idade +
                ", habitat='" + habitat + '\'' +
                ", quantidadePatas=" + quantidadePatas +
                ", peso=" + peso +
                ", quantidadeComida=" + quantidadeComida +
                ", distanciaPercorrida=" + distanciaPercorrida +
                ", horasDormidas=" + horasDormidas +
                '}';
    }
}
