import java.util.*;
import java.util.function.BinaryOperator;

public class ABM {
    private HashMap<String, Persona> mapPersonas;

    public ABM(){
        mapPersonas = new HashMap<>();
    }

    public Boolean addPersona(Persona nuevaPersona){
        Boolean agregado = false;
        if(!mapPersonas.containsKey(nuevaPersona)){
            mapPersonas.put(nuevaPersona.getDni(),nuevaPersona);
            agregado = true;
        }
        return agregado;
    }

    public Boolean deletePersona(Persona personaAEliminar){
        Boolean eliminado = true;
        if(mapPersonas.remove(personaAEliminar.getDni())==null){
            eliminado = false;
        }
        return eliminado;
    }

    public String mapToArrayOrdenado(){
        String datos="";
        List<Persona> personas=new ArrayList<>(mapPersonas.values());

        Collections.sort(personas);
        for(Persona persona:personas){
            datos+=persona.toString()+"\n";
        }
        return datos;
    }

}
