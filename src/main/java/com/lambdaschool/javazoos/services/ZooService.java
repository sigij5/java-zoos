package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Zoo;

import java.util.List;

/**
 * The Service that works with Zoo Model.
 * <p>
 * Note: Emails are added through the add user process
 * Roles are added through the add user process
 * No way to delete an assigned role
 */
public interface ZooService
{
    List<Zoo> findAllZoos();

    Zoo findZooById(long id);
//
//    /**
//     * A list of all users whose username contains the given substring
//     *
//     * @param username The substring (String) of the username of the Users you seek
//     * @return List of users whose username contains the given substring
//     */
//    List<Zoo> findByNameContaining(String username);
//
//    /**
//     * Returns the user with the given primary key.
//     *
//     * @param id The primary key (long) of the user you seek.
//     * @return The given Zoo or throws an exception if not found.
//     */
//    Zoo findUserById(long id);
//
//    /**
//     * Returns the user with the given name
//     *
//     * @param name The full name (String) of the Zoo you seek.
//     * @return The Zoo with the given name or throws an exception if not found.
//     */
//    Zoo findByName(String name);
//
//    /**
//     * Deletes the user record and its useremail items from the database based off of the provided primary key
//     *
//     * @param id id The primary key (long) of the user you seek.
//     */
//    void delete(long id);
//
//    /**
//     * Given a complete zoo object, saves that zoo object in the database.
//     * If a primary key is provided, the record is completely replaced
//     * If no primary key is provided, one is automatically generated and the record is added to the database.
//     *
//     * @param zoo the zoo object to be saved
//     * @return the saved zoo object including any automatically generated fields
//     */
//    Zoo save(Zoo zoo);
//
//    /**
//     * Updates the provided fields in the zoo record referenced by the primary key.
//     * <p>
//     * Regarding Animal and Zootelephone items, this process only allows adding those. Deleting and editing those lists
//     * is done through a separate endpoint.
//     *
//     * @param zoo just the zoo fields to be updated.
//     * @param id   The primary key (long) of the zoo to update
//     * @return the complete zoo object that got updated
//     */
//    Zoo update(
//            Zoo zoo,
//            long id);
//
//    public void deleteAll();
}