package co.analisys.trainerservice.service;

import co.analisys.trainerservice.model.Trainer;
import co.analisys.trainerservice.repository.TrainerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class TrainerServiceTest {

    @InjectMocks
    private TrainerService trainerService;

    @Mock
    private TrainerRepository trainerRepository;

    public TrainerServiceTest() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void testGetTrainerByIdNotFound() {
        when(trainerRepository.findById(1L)).thenReturn(Optional.empty());

        Trainer result = trainerService.getTrainerById(1L);
        assertNull(result);
    }
}
