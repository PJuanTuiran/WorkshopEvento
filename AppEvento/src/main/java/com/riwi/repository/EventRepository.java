package com.riwi.repository;

import com.riwi.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository  extends CrudRepository<Event,String> {
}
