package br.com.emmanuelneri;

import lombok.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "http://accommodations:8070", path = "/accommodations", name = "accommodations")
public interface Accommodations {

    @GetMapping
    List<Accommodation> getAccommodation();

    @Value
    public class Accommodation {
        private String name;
        private String address;
    }
}
