package main;

/**
 * Solo una instancia
 */
public class Singleton {
   
    private String nombre;
    private Integer edad;


    private static Singleton instance = null;

    private Singleton() {
    }

   
    public static Singleton getInstance() {
    
        if (instance == null) {
       
            instance = new Singleton();
        }
     
        return instance;
    }


    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
