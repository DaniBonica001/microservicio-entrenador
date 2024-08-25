package co.analisys.trainerservice.API;

import co.analisys.trainerservice.model.Trainer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(TrainerAPI.BASE_URL)
public interface TrainerAPI {

    String BASE_URL = "/trainers";
    @PostMapping
    Trainer createTrainer(Trainer trainer);

    @GetMapping("/all")
    List<Trainer> getAllTrainers();
}
