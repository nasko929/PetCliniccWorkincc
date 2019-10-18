package com.naskoSpring.naskoPetClinic.services;

import com.naskoSpring.naskoPetClinic.model.Owner;
import org.springframework.stereotype.Service;

@Service
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
