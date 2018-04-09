package nl.wilron.gemfire.service;

import nl.wilron.gemfire.domain.Counter;
import nl.wilron.gemfire.repository.CounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CounterServiceImpl implements CounterService {

    @Autowired
    CounterRepository counterRepository;

    @Override
    public Counter getCounter() {
        Optional<Counter> counter = counterRepository.findById(1L);
        if (!counter.isPresent()) {
            Counter newCounter = new Counter();
            newCounter.setId(1L);
            newCounter.setValue(1);
            counterRepository.save(newCounter);
            return newCounter;
        } else {
            return counter.get();
        }
    }

    @Override
    public void updateCounter() {
        Optional<Counter> counter = counterRepository.findById(1L);
        if (counter.isPresent()) {
            counter.get().increment();
        }
    }
}
