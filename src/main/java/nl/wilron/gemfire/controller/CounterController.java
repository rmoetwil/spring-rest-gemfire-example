package nl.wilron.gemfire.controller;

import nl.wilron.gemfire.domain.Counter;
import nl.wilron.gemfire.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class CounterController {

    @Autowired
    private CounterService counterService;

    @GetMapping("/counter")
    public ResponseEntity<Counter> getCounter() {
        return new ResponseEntity<>(counterService.getCounter(), HttpStatus.OK);
    }


    @PutMapping("/counter")
    public ResponseEntity<Counter> updateCounter() {
        counterService.updateCounter();

        return new ResponseEntity<>(counterService.getCounter(), HttpStatus.OK);
    }
}
