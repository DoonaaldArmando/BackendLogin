package co.com.portabilidad.clases;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
public class Persona {

    private final String nombre;
    private final String apellido;
    private final Integer estadoCivil;
    private final LocalDate fechaNacimiento;
    private final Integer sueldo;
    private final String correo;
    private final Integer departamento;
    private final Integer ciudad;

}