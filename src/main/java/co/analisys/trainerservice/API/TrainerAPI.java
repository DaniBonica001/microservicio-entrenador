package co.analisys.trainerservice.API;

import co.analisys.trainerservice.model.Trainer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(TrainerAPI.BASE_URL)
public interface TrainerAPI {

    String BASE_URL = "/trainers";
    @PostMapping
    @Operation(
            summary = "Crear un nuevo entrenador",
            description = "Este endpoint permite crear un nuevo entrenador proporcionando los detalles en el cuerpo de la solicitud."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Entrenador creado exitosamente"),
            @ApiResponse(responseCode = "400", description = "Datos de entrada no válidos"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    Trainer createTrainer(@RequestBody Trainer trainer);

    @GetMapping("/all")
    @Operation(
            summary = "Obtener todos los entrenadores",
            description = "Este endpoint permite obtener una lista de todos los entrenadores registrados."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Entrenadores recuperados exitosamente"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    List<Trainer> getAllTrainers();

    @GetMapping("/{id}")
    @Operation(
            summary = "Obtener entrenador por ID",
            description = "Este endpoint permite obtener los detalles de un entrenador proporcionando su ID."
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Entrenador recuperado exitosamente"),
            @ApiResponse(responseCode = "404", description = "Entrenador no encontrado"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    Trainer getTrainerById(@PathVariable Long id);
}
