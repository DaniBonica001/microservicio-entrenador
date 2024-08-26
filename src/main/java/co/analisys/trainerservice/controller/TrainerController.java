package co.analisys.trainerservice.controller;

import co.analisys.trainerservice.API.TrainerAPI;
import co.analisys.trainerservice.model.Trainer;
import co.analisys.trainerservice.service.TrainerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
public class TrainerController implements TrainerAPI {
    private final TrainerService trainerService;

    @Override
    public Trainer createTrainer(Trainer trainer) {
        return trainerService.createTrainer(trainer);
    }

    @Override
    public List<Trainer> getAllTrainers() {
        return trainerService.getAllTrainers();
    }

    @Override
    public Trainer getTrainerById(Long id) {
        return trainerService.getTrainerById(id);
    }
}
