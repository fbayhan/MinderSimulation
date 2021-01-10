package com.pandora.apiconversation.repository;

import com.pandora.apiconversation.model.Importance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface ImportanceRepository extends CrudRepository<Importance, Long> {
}
