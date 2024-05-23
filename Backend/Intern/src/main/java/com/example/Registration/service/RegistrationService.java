package com.example.Registration.service;

import com.example.Registration.model.RegistrationModel;
import com.example.Registration.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {
    @Autowired
    private RegistrationRepository registrationRepository;

    public List<RegistrationModel> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    public Optional<RegistrationModel> getRegistrationById(String id) {
        return registrationRepository.findById(id);
    }

    public RegistrationModel addRegistration(RegistrationModel registration) {
        return registrationRepository.save(registration);
    }

    public RegistrationModel updateRegistration(String id, RegistrationModel registration) {
        registration.setId(id);
        return registrationRepository.save(registration);
    }

    public void deleteRegistration(String id) {
        registrationRepository.deleteById(id);
    }
}

