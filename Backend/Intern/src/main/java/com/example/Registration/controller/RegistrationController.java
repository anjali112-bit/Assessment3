package com.example.Registration.controller;

import com.example.Registration.model.RegistrationModel;
import com.example.Registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public List<RegistrationModel> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @GetMapping("/{id}")
    public Optional<RegistrationModel> getRegistrationById(@PathVariable String id) {
        return registrationService.getRegistrationById(id);
    }

    @PostMapping
    public RegistrationModel addRegistration(@RequestBody RegistrationModel registration) {
        return registrationService.addRegistration(registration);
    }

    @PutMapping("/{id}")
    public RegistrationModel updateRegistration(@PathVariable String id, @RequestBody RegistrationModel registration) {
        return registrationService.updateRegistration(id, registration);
    }

    @DeleteMapping("/{id}")
    public void deleteRegistration(@PathVariable String id) {
        registrationService.deleteRegistration(id);
    }
}
