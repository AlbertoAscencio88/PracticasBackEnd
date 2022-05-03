package practicasBackEnd.practicaHarry;

public class PruebaPersonaje {

    public static void main(String[] args) {
        def();
    }

    public static void def(){
        PersonajeHarryPotter a = new PersonajeHarryPotter("Ginevra Weasley","Femenino","Gryffindor","Seres queridos muertos","Caballo");

        System.out.println();
        System.out.println("El nombre es: " + a.getNombre());
        System.out.println("Su genero es: "+ a.getGenero());
        System.out.println("Pertenece a la casa: " + a.getCasa());
        System.out.println("Su boggart es: " + a.getBoggart());
        System.out.println("Y su patronus es: " + a.getPatronus());
        System.out.println();

        PersonajeHarryPotter b = new PersonajeHarryPotter("Harry Potter","Masculino","Gryffindor","Dementor","Ciervo");
        System.out.println("El nombre es: " + b.getNombre());
        System.out.println("Su genero es: "+ b.getGenero());
        System.out.println("Pertenece a la casa: " + b.getCasa());
        System.out.println("Su boggart es: " + b.getBoggart());
        System.out.println("Y su patronus es: " + b.getPatronus());
        System.out.println();

        PersonajeHarryPotter c = new PersonajeHarryPotter("Voldemort","Masculino","Slytherin","Su cuerpo muerto","Serpiente");
        System.out.println("El nombre es: " + c.getNombre());
        System.out.println("Su genero es: "+c.getGenero());
        System.out.println("Pertenece a la casa: " + c.getCasa());
        System.out.println("Su boggart es: " + c.getBoggart());
        System.out.println("Y su patronus es: " + c.getPatronus());
        System.out.println();

        PersonajeHarryPotter d = new PersonajeHarryPotter("Remus Lupin","Masculino","Gryffindor","Luna llena","Lobo");
        System.out.println("El nombre es: " +d.getNombre());
        System.out.println("Su genero es: "+ d.getGenero());
        System.out.println("Pertenece a la casa: " +d.getCasa());
        System.out.println("Su boggart es: " + d.getBoggart());
        System.out.println("Y su patronus es: " + d.getPatronus());
        System.out.println();

        PersonajeHarryPotter e = new PersonajeHarryPotter("Hermione Granger","Femenino","Gryffindor","Profesora McGonagall","Nutria");
        System.out.println("El nombre es: " + e.getNombre());
        System.out.println("Su genero es: "+ e.getGenero());
        System.out.println("Pertenece a la casa: " + e.getCasa());
        System.out.println("Su boggart es: " + e.getBoggart());
        System.out.println("Y su patronus es: " + e.getPatronus());

    }


}
