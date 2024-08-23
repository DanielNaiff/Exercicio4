package classes.abstratas;

public abstract class AnimalVoadorAB extends AnimalAB {
    /*
    * apenas animais voadores possuem asas e envergadura, por isso a opcao de colocar aqui
    */
    protected int quantidadeAsas;
    protected double envergaduraAssas;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double peso, int quantidadeAsas, double envergaduraAssas) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, peso);
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAssas = envergaduraAssas;
    }

    public abstract void voar(int altura);

    public int getQuantidadeAsas() {
        return quantidadeAsas;
    }

    public void setQuantidadeAsas(int quantidadeAsas) {
        this.quantidadeAsas = quantidadeAsas;
    }

    public double getEnvergaduraAssas() {
        return envergaduraAssas;
    }

    public void setEnvergaduraAssas(double envergaduraAssas) {
        this.envergaduraAssas = envergaduraAssas;
    }

    @Override
    public String toString() {
        return "AnimalVoadorAB{" +
                "quantidadeAsas=" + quantidadeAsas +
                ", envergaduraAssas=" + envergaduraAssas +
                '}';
    }
}

