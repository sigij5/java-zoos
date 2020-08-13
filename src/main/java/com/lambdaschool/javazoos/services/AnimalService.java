package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.views.ZooCounts;

import java.util.List;

/**
 * The service that works with the Animal Model.
 * <p>
 * Note: no method update Animal name
 */
public interface AnimalService
{
    List<ZooCounts> getZooCounts();
//    Animal findByName(String name);

//    public void deleteAll();

//    Animal update(long id, Animal animal);
}