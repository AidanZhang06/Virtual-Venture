package com.aidan.virtualventure.api;

import com.aidan.virtualventure.service.VentureService;
import com.aidan.virtualventure.model.Venture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/Venture")
@RestController
public class VentureController {

    private final VentureService ventureService;

    @Autowired
    public VentureController(VentureService ventureService) {
        this.ventureService = ventureService;
    }

    @PostMapping
    public void addPerson(@RequestBody Venture venture) {
        ventureService.addVenture(venture);
    }

    @GetMapping
    public List<Venture> getAllVentures() {
        return ventureService.getAllVentures();
    }

    @GetMapping(path = "{id}")
    public Venture getVentureById(@PathVariable("id") UUID id) {
        return ventureService.getVentureById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteVentureById(@PathVariable("id") UUID id) {
        ventureService.deleteVentureById(id);
    }

    @PutMapping(path = "{id}")
    public void updateVenture(@PathVariable("id") UUID id, @RequestBody Venture newVenture) {
        ventureService.updateVentureById(id, newVenture);
    }

}
