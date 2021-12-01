package main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Proyecto para aprender a hacer un Singleton");

        
        Singleton miUnicaInstancia = Singleton.getInstance();
        // rellenamos los atributos
        miUnicaInstancia.setEdad(18);
        miUnicaInstancia.setNombre("Yago");

      
        Singleton otraInstanciaSeraLaMisma = Singleton.getInstance();
 
        otraInstanciaSeraLaMisma.setEdad(19);


     
    }
}
