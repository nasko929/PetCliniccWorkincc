package com.naskoSpring.naskoPetClinic.services;

import com.naskoSpring.naskoPetClinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
