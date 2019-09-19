package co.com.portabilidad;


import co.com.portabilidad.acciones.persona.ExistenciaPersona;
import co.com.portabilidad.acciones.persona.GuardarPersona;
import co.com.portabilidad.acciones.persona.ListaPersona;
import co.com.portabilidad.acciones.persona.crear.CrearPersona;
import co.com.portabilidad.acciones.persona.lista.ListarPersona;
import co.com.portabilidad.acciones.persona.crear.CrearPersonaImplementacion;
import co.com.portabilidad.acciones.persona.lista.ListarPersonaImplementacion;
import co.com.portabilidad.convertidor.PersonaConvertidor;
import co.com.portabilidad.convertidor.implementacion.PersonaConvertidorImplementacion;
import co.com.portabilidad.implementacion.persona.ExistenciaPersonaData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;

@Configuration
public class ConfiguracionPrincipal {



    @Bean
    public CrearPersona crearPersona(

            GuardarPersona guardarPersona,
            ExistenciaPersona existenciaPersona) {
        return new CrearPersonaImplementacion(

                guardarPersona,
                existenciaPersona);
    }


    @Bean
    public CrearPersonaImplementacion crearPersonaImplementacion(
            GuardarPersona guardarPersona,
            ExistenciaPersona existenciaPersona
    ) {
        return new CrearPersonaImplementacion(guardarPersona, existenciaPersona);
    }

    @Bean
    public ListarPersonaImplementacion listarPersonaImplementacion(
            ListaPersona listaPersona
    ) {
        return new ListarPersonaImplementacion(listaPersona);
    }

    @Bean
    public ListarPersona listarPersona(ListaPersona listaPersona) {
        return new ListarPersonaImplementacion(listaPersona);
    }

    @Bean
    public PersonaConvertidor personaConvertidor(

    ) {
        return new PersonaConvertidorImplementacion();
    }

    @Bean
    public ExistenciaPersona existenciaPersona(MongoOperations mongoOperations) {
        return new ExistenciaPersonaData(mongoOperations);
    }
}
