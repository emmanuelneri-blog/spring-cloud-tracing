package br.com.emmanuelneri;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trips")
public class TripController {

   private Logger logger = LoggerFactory.getLogger(TripController.class);

    @GetMapping
    public String getTrip() {
        logger.info("Hello trip");
        return "Hello trip";
    }

}
