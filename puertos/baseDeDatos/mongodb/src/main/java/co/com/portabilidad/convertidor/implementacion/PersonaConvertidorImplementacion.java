package co.com.portabilidad.convertidor.implementacion;

import co.com.portabilidad.DAO.PersonaData;
import co.com.portabilidad.clases.Persona;
import co.com.portabilidad.convertidor.PersonaConvertidor;
import lombok.AllArgsConstructor;



@AllArgsConstructor
public class PersonaConvertidorImplementacion implements PersonaConvertidor {


    @Override
    public Persona personaDataAPersona(PersonaData personaData) {
        return Persona
                .builder()
                .nombre(personaData.getNombre())
                .apellido(personaData.getApellido())
                .ciudad(personaData.getCiudad())
                .correo(personaData.getCorreo())
                .departamento(personaData.getDepartamento())
                .estadoCivil(personaData.getEstadoCivil())
                .fechaNacimiento(personaData.getFechaNacimiento())
                .sueldo(personaData.getSueldo())
                .build();
    }

    @Override
    public PersonaData personaAPersonaData(Persona persona) {
        return PersonaData
                .builder()
                .apellido(persona.getApellido())
                .nombre(persona.getNombre())
                .ciudad(persona.getCiudad())
                .correo(persona.getCorreo())
                .departamento(persona.getDepartamento())
                .estadoCivil(persona.getEstadoCivil())
                .fechaNacimiento(persona.getFechaNacimiento())
                .sueldo(persona.getSueldo())
                .build();

    }

}
