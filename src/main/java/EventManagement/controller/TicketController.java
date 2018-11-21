package EventManagement.controller;

import EventManagement.model.SpecialEvent;
import EventManagement.model.Ticket;
import EventManagement.repository.SpecialEventRepository;
import EventManagement.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired private TicketRepository ticketRepository;


    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<Ticket> getAllTicket() {
        return ticketRepository.findAll();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('USER')")
    public Ticket saveTicket(@RequestBody Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('USER')")
    public Optional<Ticket> getTicket(@PathVariable("id") String id) {
        return ticketRepository.findById(id);
    }
}
