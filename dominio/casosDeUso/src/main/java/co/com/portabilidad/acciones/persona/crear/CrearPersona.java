package co.com.portabilidad.acciones.persona.crear;

import co.com.portabilidad.clases.Persona;

import java.time.LocalDate;


public interface CrearPersona {

    Persona crearPersona(
            String nombre,
            String apellido,
            Integer estadoCivil,
            LocalDate fechaNacimiento,
            Integer sueldo,
            String correo,
            Integer departamento,
            Integer ciudad
    );

}
