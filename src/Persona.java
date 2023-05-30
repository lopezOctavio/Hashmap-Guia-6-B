public class Persona implements Comparable<Persona>{
    private String nombre;
    private String dni;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }



    @Override
    public int compareTo(Persona o) {
        if(this.edad>o.edad)
        return 1;
        else if(this.edad<o.edad)
        return -1;
        else {
            return 0;
        }
    }
}
