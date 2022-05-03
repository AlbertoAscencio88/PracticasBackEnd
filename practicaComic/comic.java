

public class comic {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        screen.out("Bienvenido a la practica de Comics \n", "Helvetica", 28,Colors.Desire);
        screen.setVisible(true);

        str = d.readString("Quieres leer este comic? S/N");
        if (str.charAt(0) == 'S' || str.charAt(0) == 's'){

            for (int i =1; i<=8; i++){
                try {
                    screen.showImage("escanear000"+i+".jpg");
                    screen.setSize(1920,1080);
                    Thread.sleep(15000);
                    screen.cls();
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }

            screen.out("Continuara");
        } else
            screen.out("Talvez en otro momento", "Century Schoolbook L", 28,  Colors.BalticSea);


    }


}
