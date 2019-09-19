package co.com.portabilidad.persona;


import co.com.portabilidad.DTO.LocalizacionDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/localizaciones")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class LocalizacionController {

    @GetMapping(path = "departamento")
    public ResponseEntity<List<LocalizacionDTO>> departamento() {
        return ResponseEntity.ok().body(Arrays.asList(
                new LocalizacionDTO("1", "Cordoba"),
                new LocalizacionDTO("2", "Antioquia")
        ));
    }

    @GetMapping(path = "ciudad/{id}")
    public ResponseEntity<List<LocalizacionDTO>> ciudad(@PathVariable String id) {
        if (id.equals("1")) {
            return ResponseEntity.ok().body(Arrays.asList(
                    new LocalizacionDTO("11", "Monteria"),
                    new LocalizacionDTO("22", "Tierralta")
            ));
        }

        if (id.equals("2")) {
            return ResponseEntity.ok().body(Arrays.asList(
                    new LocalizacionDTO("111", "Medellin"),
                    new LocalizacionDTO("222", "Envigado")
            ));
        }

        return ResponseEntity.ok().body(Arrays.asList());
    }



    @GetMapping(path = "ciudad")
    public ResponseEntity<List<LocalizacionDTO>> ciudades() {

            return ResponseEntity.ok().body(Arrays.asList(
                    new LocalizacionDTO("11","Monteria"),
                    new LocalizacionDTO("22","Tierralta"),
                    new LocalizacionDTO("111","Medellin"),
                    new LocalizacionDTO("222","Envigado")
            )) ;
        }





}
