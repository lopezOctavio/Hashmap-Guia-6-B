import java.util.Scanner;

public class Consola {
        private static Scanner sc = new Scanner(System.in);

        public static void escribir(Object x){
        System.out.println(x);
    }


    public static String leerString(String mensaje){
        Consola.escribir(mensaje);
        return sc.nextLine();
    }

    public static char leerChar(String mensaje){
        Consola.escribir(mensaje);
        return sc.nextLine().charAt(0);
    }

    public static int leerInt(String mensaje){
            Consola.escribir(mensaje);
            return sc.nextInt();
    }

    public static void limpiar(){
            sc.nextLine();
    }
}
