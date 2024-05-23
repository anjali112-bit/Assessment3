package com.example.Registration.repository;

import com.example.Registration.model.RegistrationModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegistrationRepository extends MongoRepository<RegistrationModel, String> {
}
