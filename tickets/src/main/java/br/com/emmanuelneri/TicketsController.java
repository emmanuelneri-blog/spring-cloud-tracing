package br.com.emmanuelneri;

import lombok.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketsController {

    private Logger logger = LoggerFactory.getLogger(TicketsController.class);

    @GetMapping
    public List<Ticket> getTickets() {
        logger.info("get tickets");
        return Arrays.asList(
                new Ticket("LATAM", LocalDateTime.now(), LocalDateTime.now().plusHours(1)),
                new Ticket("GOL", LocalDateTime.now().plusMinutes(30), LocalDateTime.now().plusHours(2)),
                new Ticket("AZUL", LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2).plusMinutes(30)),
                new Ticket("AVIANCA", LocalDateTime.now(), LocalDateTime.now().plusHours(1).plusMinutes(20))
        );
    }

    @Value
    class Ticket {
        private String company;
        private LocalDateTime departingDateTime;
        private LocalDateTime arravingDateTime;
    }
}
