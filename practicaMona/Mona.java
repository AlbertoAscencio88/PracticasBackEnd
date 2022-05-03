package practicasBackEnd.practicaMona;

public class Mona {
    String Nombre, Apariencia, Actividad;

    Mona(String Nombre, String Apariencia, String Actividad){
        this.Nombre= Nombre;
        this.Apariencia= Apariencia;
        this.Actividad= Actividad;
    }
    void imprimir (){
        System.out.println("El nombre del personaje es: "+Nombre+" su apariencia es: "+Apariencia+" Y se dedica a: "+Actividad);
    }
}

 class Boxertocat extends Mona {

    Boxertocat(String Nombre, String Apariencia, String Actividad) {
        super(Nombre, Apariencia, Actividad);
    }
}

class Robotocat extends Mona {

    Robotocat(String Nombre, String Apariencia, String Actividad) {
        super(Nombre, Apariencia, Actividad);
    }
}

class Momtocat extends Mona {

    Momtocat(String Nombre, String Apariencia, String Actividad) {
        super(Nombre, Apariencia, Actividad);
    }
}
class Codertocat extends Mona {

    Codertocat(String Nombre, String Apariencia, String Actividad) {
        super(Nombre, Apariencia, Actividad);
    }
}

class SaintNictocat extends Mona{
    String Temporada;
    SaintNictocat(String Nombre, String Apariencia, String Actividad, String Temporada) {
        super(Nombre, Apariencia, Actividad);
        this.Temporada= Temporada;
    }
    void imprimir (){
        System.out.println("El nombre del personaje es: "+Nombre+" su apariencia es: "+Apariencia+" Y se dedica a: "+Actividad + " en el mes de "+ Temporada);
    }
}

class DaftpunktocatGuy extends Mona{
    String Concierto;
    DaftpunktocatGuy(String Nombre, String Apariencia, String Actividad, String Concierto) {
        super(Nombre, Apariencia, Actividad);
        this.Concierto= Concierto;
    }
    void imprimir (){
        System.out.println("El nombre del personaje es: "+Nombre+" su apariencia es: "+Apariencia+" Y se dedica a: "+Actividad + " en  "+ Concierto);
    }
}

class PruebaMona {
    public static void main(String[] args) {
        Mona  b= new Mona("Boxertocat", "Tiene guantes de box y una cinta en la cabeza", "Boxear");
        b.imprimir();
        Mona  s= new SaintNictocat("SaintNictocat", "Tiene un traje de santa claus y un costal", "Regalar juguetes","Diciembre");
        s.imprimir();
        Mona  d= new DaftpunktocatGuy("DaftpunktocatGuy", "Tiene un casco dorado", "Tocar musica","el teatro Metropolitan");
        d.imprimir();
        Mona  r= new Mona("Robotocat", "Es metalico", "hacer procesos computacionales");
        r.imprimir();
        Mona  m= new Mona("Momtocat", "desalineada", "hacer hacer actividades domesticas y laborales para comprar cosas para sus hijos malagradecidos");
        m.imprimir();
        Mona  c= new Mona("Codertocat", "Godin", "programar codigo como esclavo solo para darse cuenta que por alguna extrana razon compila pero no hace nada util su codigo");
        c.imprimir();

    }
}

