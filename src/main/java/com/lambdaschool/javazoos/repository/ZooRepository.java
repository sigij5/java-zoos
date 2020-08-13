package com.lambdaschool.javazoos.repository;

import com.lambdaschool.javazoos.models.Zoo;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD repository connecting Zoo to the rest of the application
 */
public interface ZooRepository
        extends CrudRepository<Zoo, Long>
{
    /**
     * Find a user based off over username
     *
     * @param username the name (String) of user you seek
     * @return the first user object with the name you seek
     */
//    Zoo findById(long id);

    /**
     * Find all users whose name contains a given substring ignoring case
     *
     * @param name the substring of the names (String) you seek
     * @return List of users whose name contain the given substring ignoring case
     */
//    List<Zoo> findByUsernameContainingIgnoreCase(String name);
}
