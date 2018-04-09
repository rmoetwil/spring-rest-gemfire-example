package nl.wilron.gemfire.repository;

import nl.wilron.gemfire.domain.Counter;
import org.springframework.data.repository.CrudRepository;

public interface CounterRepository extends CrudRepository<Counter, Long> {

}
