package practicasBackEnd.practicaHarry;


public class PersonajeHarryPotter {

    //Caracteristicas - Campos
    public String genero, nombre, boggart, patronus, casa;
    public PersonajeHarryPotter(){ }

    public PersonajeHarryPotter(String nombre, String genero, String casa, String boggart, String patronus){
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.boggart = boggart;
        this.patronus = patronus;
    }


    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getCasa(){  return casa;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }
}
