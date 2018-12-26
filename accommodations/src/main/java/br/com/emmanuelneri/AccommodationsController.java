package br.com.emmanuelneri;

import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/accommodations")
public class AccommodationsController {

    private Logger logger = LoggerFactory.getLogger(AccommodationsController.class);

    @GetMapping
    public List<Accommodation> getAccommodations() {
        logger.info("get accommodations");
        return Arrays.asList(
                new Accommodation("Brazil HOTEL", "Brazil avenue, 1500"),
                new Accommodation("BC LOFT", "Brazil avenue, 2300"),
                new Accommodation("Atlantic Hotel", "Atlantic avenue, 1300"),
                new Accommodation("IBIS Hotel", "Atlantic avenue, 1100")
        );
    }

    @Value
    class Accommodation {
        private String name;
        private String address;
    }

}
