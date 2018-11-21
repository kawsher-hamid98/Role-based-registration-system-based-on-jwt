package EventManagement.controller;

import EventManagement.model.SpecialEvent;
import EventManagement.repository.SpecialEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/special-event")
public class SpecialEventController {

    @Autowired private SpecialEventRepository specialEventRepository;

    @GetMapping
    public List<SpecialEvent> getAllSpecialEvents() {
        return specialEventRepository.findAll();
    }
}
