package com.lambdaschool.javazoos.repository;

import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.views.ZooCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository
        extends CrudRepository<Animal, Long>
{

//    Animal findByNameIgnoreCase(String name);

@Query(value = "SELECT a.animaltype as animal, a.animalid as animalid, count(zooid) as zoos\n" +
        "FROM animals a LEFT JOIN zooanimals z\n" +
        "ON a.animalid = z.animalid\n" +
        "GROUP BY animal\n" +
        "ORDER BY animal", nativeQuery = true)
    List<ZooCounts> findZooCounts();

}
