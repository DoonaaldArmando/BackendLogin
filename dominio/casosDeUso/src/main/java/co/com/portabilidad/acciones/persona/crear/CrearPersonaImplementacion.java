package co.com.portabilidad.acciones.persona.crear;

import co.com.portabilidad.acciones.persona.ExistenciaPersona;
import co.com.portabilidad.acciones.persona.GuardarPersona;
import co.com.portabilidad.clases.Persona;
import co.com.portabilidad.excepciones.ExistenciaPrevia;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class CrearPersonaImplementacion implements CrearPersona {

    private static final String EXISTENCIA_PREVIA_PERSONA = "La persona que intenta insertar ya se encuentra guardada";


    private final GuardarPersona guardarPersona;
    private final ExistenciaPersona existenciaPersona;

    @Override
    public Persona crearPersona(
            String nombre,
            String apellido,
            Integer estadoCivil,
            LocalDate fechaNacimiento,
            Integer sueldo,
            String correo,
            Integer departamento,
            Integer ciudad
    ) {
        if (this.existenciaPersona.existenciaPersona(nombre, apellido)) {
            throw new ExistenciaPrevia(EXISTENCIA_PREVIA_PERSONA);
        }
        return this.guardarPersona.agregarPersona(
                new Persona(
                        nombre,
                        apellido,
                        estadoCivil,
                        fechaNacimiento,
                        sueldo,
                        correo,
                        departamento,
                        ciudad
                )
        );

    }


}
