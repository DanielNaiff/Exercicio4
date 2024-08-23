import classes.concretas.*;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos animais
        Cachorro cachorro = new Cachorro("Rex", 5, "Casa", 4, 20.5);
        Gato gato = new Gato("Miau", 3, "Apartamento", 4, 4.5);
        Elefante elefante = new Elefante("Dumbo", 10, "Selva", 4, 3000.0);
        Leao leao = new Leao("Simba", 7, "Savannah", 4, 180.0);
        Peixe peixe = new Peixe("Nemo", 2, "Oceano", 0, 0.5);
        Pombo pombo = new Pombo("Piu", 4, "Cidade", 2, 1.0, 2, 0.5);

        // Testando os métodos dos animais
        System.out.println();
        cachorro.comer(5);
        cachorro.moverse(10);
        cachorro.dormir(8);
        System.out.println();
        System.out.println(cachorro.toString());
        System.out.println();
        System.out.println("################################");
        System.out.println();

        gato.comer(3);
        gato.moverse(5);
        gato.dormir(6);
        System.out.println();
        System.out.println(gato.toString());
        System.out.println();
        System.out.println("################################");
        System.out.println();

        elefante.comer(50);
        elefante.moverse(20);
        elefante.dormir(10);
        System.out.println();
        System.out.println(elefante.toString());
        System.out.println();
        System.out.println("################################");
        System.out.println();

        leao.comer(20);
        leao.moverse(15);
        leao.dormir(12);
        System.out.println();
        System.out.println(leao.toString());
        System.out.println();
        System.out.println("################################");
        System.out.println();

        peixe.comer(2);
        peixe.nadar(30);
        peixe.dormir(4);
        peixe.nadar(67);
        System.out.println();
        System.out.println(peixe.toString());
        System.out.println();
        System.out.println("################################");
        System.out.println();

        pombo.comer(1);
        pombo.moverse(5); // Movimento no solo
        pombo.voar(100);
        pombo.dormir(7);
        System.out.println();
        System.out.println(pombo.toString());
        System.out.println();
        System.out.println("################################");
        System.out.println();
    }
}
