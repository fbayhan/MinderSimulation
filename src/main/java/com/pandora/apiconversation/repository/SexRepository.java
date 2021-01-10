package com.pandora.apiconversation.repository;

import com.pandora.apiconversation.model.Sex;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexRepository extends CrudRepository<Sex, Long> {
}
