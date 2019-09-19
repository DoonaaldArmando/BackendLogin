package co.com.portabilidad.persona;


import co.com.portabilidad.DTO.PersonaDTO;
import co.com.portabilidad.acciones.persona.crear.CrearPersona;
import co.com.portabilidad.acciones.persona.lista.ListarPersona;
import co.com.portabilidad.clases.Persona;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/personas")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PersonaController {

    private final CrearPersona crearPersona;
    private final ListarPersona listarPersona;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Persona> crearPersona(@Valid @RequestBody PersonaDTO persona) {
        return ResponseEntity
                .created(
                        URI.create(
                                "personas/"
                                        .concat(persona.getNombre())
                                        .concat("/")
                                        .concat(persona.getApellido())
                        )
                )
                .body(
                        this.crearPersona.crearPersona(
                               persona.getNombre(),
                                persona.getApellido(),
                                persona.getEstadoCivil(),
                                persona.getFechaNacimiento(),
                                persona.getSueldo(),
                                persona.getCorreo(),
                                persona.getDepartamento(),
                                persona.getCiudad()
                        )
                );
    }


    @GetMapping(path = "/{tipoDocumento}/{numeroCedula}")
    public ResponseEntity<Persona> consultarPersonaPorTipoDocumentoYNumeroCedula(
            @PathVariable String nombre,
            @PathVariable String apellido
    ) {
        return ResponseEntity
                .ok()
                .body(
                        this.listarPersona.listarPorNombreYApellido(nombre, apellido)
                );
    }

    @GetMapping()
    public ResponseEntity<List<Persona>> consultarPersona() {
        return ResponseEntity.ok().body(this.listarPersona.listarTodos());
    }


}
