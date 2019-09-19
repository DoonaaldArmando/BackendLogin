package co.com.portabilidad.DTO;

import lombok.*;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class PersonaDTO {

    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    @NotNull
    private Integer estadoCivil;
    @NotNull
    private LocalDate fechaNacimiento;
    @NotNull
    private Integer sueldo;
    @NotNull
    private String correo;
    @NotNull
    private Integer departamento;
    @NotNull
    private Integer ciudad;

}
