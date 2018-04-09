package nl.wilron.gemfire.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Region
@Data
public class Counter {

    @Id
    private Long id;

    private int value;

    public void increment() {
        value++;
    }
}
