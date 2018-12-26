package br.com.emmanuelneri;

import lombok.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@FeignClient(url = "http://tickets:8090", path = "/tickets", name = "tickets")
public interface Tickets {

    @GetMapping
    public List<Ticket> getTickets();

    @Value
    public class Ticket {
        private String company;
        private LocalDateTime departingDateTime;
        private LocalDateTime arravingDateTime;
    }

}
