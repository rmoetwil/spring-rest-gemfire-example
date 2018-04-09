package nl.wilron.gemfire.service;

import nl.wilron.gemfire.domain.Counter;

public interface CounterService {

    Counter getCounter();

    void updateCounter();
}
