

import java.security.Key;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        int opcion =-1;

        do{
            do{
                //region opciones
                Consola.escribir("-------BIENVENIDO--------");
                Consola.escribir("1- EJERCICIO 1");
                Consola.escribir("2- EJERCICIO 2");
                Consola.escribir("3- EJERCICIO 3");
                Consola.escribir("4- EJERCICIO 4");
                Consola.escribir("5- EJERCICIO 5");
                Consola.escribir("6- EJERCICIO 6");
                Consola.escribir("0- PARA SALIR");
                opcion = Consola.leerInt("Seleccione una opcion <!>");
                Consola.limpiar();
                //endregion
            }while(opcion < 0 || opcion > 6);

            int i = 0;
            switch (opcion){

                case 1:
                    //region 1er Ejercicio
                    Consola.escribir("-------EJERCICIO 1--------");
                    String cadena = Consola.leerString("Ingrese una cadena de texto:");
                    int contador = 0;

                    int j = 0;
                    HashMap<Character, Integer> mapResultados = new HashMap<>();
                    for(i = 0; i<cadena.length();i++){
                        if(!mapResultados.containsKey(cadena.charAt(i))){
                            contador = 0;
                            for(j=i;j<cadena.length();j++){
                                if(cadena.charAt(i) == cadena.charAt(j)){
                                    contador++;
                                }
                            }
                            mapResultados.put(cadena.charAt(i), contador);
                        }
                    }

                    mapResultados.forEach((key,value)->{
                        Consola.escribir("Letra: "+key+" -> Total coincidencias: "+value);
                    });

                    //endregion
                    break;
                case 2:
                    //region 2do Ejercicio
                    Consola.escribir("-------EJERCICIO 2--------");

                    Random aleatorio = new Random();
                    HashSet<Integer> setNumeros = new HashSet<>();
                    ArrayList<Integer> arrayNumeros = new ArrayList<>();

                    int cantNumeros = Consola.leerInt("Cuantos numeros desea generar:");

                    for(i=0;i<cantNumeros;i++){
                        arrayNumeros.add(aleatorio.nextInt(0,100));
                    }

                    System.out.println(arrayNumeros);
                    Collections.sort(arrayNumeros);

                    System.out.println("NUMEROS ORDENADOS");
                    System.out.println(arrayNumeros);

                    for(i=0;i<arrayNumeros.size();i++){
                        setNumeros.add(arrayNumeros.get(i));
                    }

                    System.out.println("HashSet:"+setNumeros);
                    //endregion
                    break;
                case 3:
                    //region 3er Ejercicio
                    Consola.escribir("-------EJERCICIO 3--------");
                    TreeMap<Integer, String> treeMapPersona = new TreeMap<>();
                    char control = ' ';
                    do{
                        String nombrePersona = Consola.leerString("Ingrese nombre: ");
                        int edadPersona = Consola.leerInt("Ingrese edad: ");
                        Consola.limpiar();
                        control = Consola.leerChar("Continuar? -> [s/n]");
                        treeMapPersona.put(edadPersona,nombrePersona);
                    }while(control!='n');

                    System.out.println(treeMapPersona);

                    //endregion
                    break;
                case 4:
                    //region 4to Ejercicio
                    Random random = new Random();
                    Consola.escribir("-------EJERCICIO 4--------");
                    ArrayList<Integer> numeros = new ArrayList<>();

                    for(i=0;i<5;i++){
                        numeros.add(random.nextInt(0,10));
                    }
                    System.out.println("Numeros: "+numeros);
                    int suma = numeros.stream().mapToInt(Integer::intValue).sum();
                    System.out.println("Suma: "+suma);

                    double promedio = suma / numeros.size();
                    System.out.println("Promedio: "+promedio);

                    Map<Integer,Integer> mapFrecuencias = new HashMap<>();
                    for(int numero:numeros){
                        mapFrecuencias.put(numero, mapFrecuencias.getOrDefault(numero,0)+1);
                    }

                    System.out.println("Frecuencia de numeros: "+mapFrecuencias);

                    //endregion
                    break;
                case 5:
                    //region 5to Ejercicio
                    Consola.escribir("-------EJERCICIO 5--------");
                    Random randon5 = new Random();
                    TreeSet treeSetNumeros = new TreeSet<>();
                    for(i=0;i<10;i++){
                        treeSetNumeros.add(randon5.nextInt(0,10));
                    }
                    Iterator<Integer> iterator = treeSetNumeros.iterator();
                    Consola.escribir("ASCENDENTE");
                    while(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    Consola.escribir("DESCENDIENTE");
                    iterator = treeSetNumeros.descendingIterator();
                    while(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    //endregion
                    break;
                case 6:
                    //region 6to Ejercicio
                    Consola.escribir("-------EJERCICIO 6--------");
                    ABM abm = new ABM();
                    Persona p1 = new Persona("Octavio", "37868120", 29);
                    Persona p2 = new Persona("Florencia", "35620111", 32);
                    Persona p3 = new Persona("Pablo", "16421222", 60);

                    abm.addPersona(p1);
                    abm.addPersona(p3);
                    abm.addPersona(p2);


                    //abm.deletePersona(p3);
                    System.out.println(abm.mapToArrayOrdenado());


                    //endregion
                    break;
                case 0:
                    Consola.escribir("Cerrando sesion <!>");
                    break;
            }
        }while(opcion!=0);



    }


}