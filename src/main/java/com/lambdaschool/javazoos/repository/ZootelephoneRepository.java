package com.lambdaschool.javazoos.repository;

import com.lambdaschool.javazoos.models.Zootelephone;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD Repository connecting Zootelephone to the rest of the application
 */
public interface ZootelephoneRepository
        extends CrudRepository<Zootelephone, Long>
{
}
