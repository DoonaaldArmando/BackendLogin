package co.com.portabilidad.acciones.persona.lista;

import co.com.portabilidad.clases.Persona;

import java.util.List;

public interface ListarPersona {

    List<Persona> listarTodos();

    Persona listarPorNombreYApellido(String nombre, String apellido);

}
