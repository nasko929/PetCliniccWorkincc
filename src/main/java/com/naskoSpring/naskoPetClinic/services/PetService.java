package com.naskoSpring.naskoPetClinic.services;

import com.naskoSpring.naskoPetClinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService extends CrudService<Pet, Long> {

}
