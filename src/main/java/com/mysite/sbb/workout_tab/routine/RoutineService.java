package com.mysite.sbb.workout_tab.routine;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class RoutineService {
    private final RoutineRepository routineRepository;

    public Routine save(Routine routine) {
        return routineRepository.save(routine);
    }

}
