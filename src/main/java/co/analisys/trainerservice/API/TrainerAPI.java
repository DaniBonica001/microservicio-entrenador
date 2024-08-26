package co.analisys.trainerservice.API;

import co.analisys.trainerservice.model.Trainer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(TrainerAPI.BASE_URL)
public interface TrainerAPI {

    String BASE_URL = "/trainers";
    @PostMapping
    Trainer createTrainer(@RequestBody Trainer trainer);

    @GetMapping("/all")
    List<Trainer> getAllTrainers();

    @GetMapping("/{id}")
    Trainer getTrainerById(@PathVariable Long id);
}
