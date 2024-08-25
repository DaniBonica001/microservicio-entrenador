package co.analisys.trainerservice.service;

import co.analisys.trainerservice.model.Trainer;
import co.analisys.trainerservice.repository.TrainerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TrainerService {
    private final TrainerRepository trainerRepository;

    public Trainer createTrainer(Trainer trainer){
        return trainerRepository.save(trainer);
    }

    public List<Trainer> getAllTrainers(){
        return trainerRepository.findAll();
    }
}
