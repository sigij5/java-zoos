package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.repository.AnimalRepository;
import com.lambdaschool.javazoos.repository.ZooRepository;
import com.lambdaschool.javazoos.views.ZooCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Implements the AnimalService Interface
 */
@Transactional
@Service(value = "animalService")
public class AnimalServiceImpl
        implements AnimalService
{
    /**
     * Connects this service to the Animal Model
     */
    @Autowired
    AnimalRepository animalrepos;

    @Autowired
    private ZooAuditing zooAuditing;

    /**
     * Connect this service to the Zoo Model
     */
    @Autowired
    ZooRepository zoorepos;

    @Override
    public List<ZooCounts> getZooCounts() {
        List<ZooCounts> list = animalrepos.findZooCounts();
        return list;
    }

    //    @Override
//    public List<Animal> findAll()
//    {
//        List<Animal> list = new ArrayList<>();
//        /*
//         * findAll returns an iterator set.
//         * iterate over the iterator set and add each element to an array list.
//         */
//        animalrepos.findAll()
//                .iterator()
//                .forEachRemaining(list::add);
//        return list;
//    }


//    @Override
//    public Animal findAnimalById(long id)
//    {
//        return animalrepos.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Animal id " + id + " not found!"));
//    }

//    @Override
//    public Animal findByName(String name)
//    {
//        Animal rr = animalrepos.findByNameIgnoreCase(name);
//
//        if (rr != null)
//        {
//            return rr;
//        } else
//        {
//            throw new EntityNotFoundException(name);
//        }
//    }
//
//    @Transactional
//    @Override
//    public Animal save(Animal animal)
//    {
//        if (animal.getUsers()
//                .size() > 0)
//        {
//            throw new EntityExistsException("Zoo Roles are not updated through Animal.");
//        }
//
//        return rolerepos.save(animal);
//    }
//
//    @Transactional
//    @Override
//    public void deleteAll()
//    {
//        rolerepos.deleteAll();
//    }
//
//    @Transactional
//    @Override
//    public Animal update(long id,
//                         Animal animal)
//    {
//        if (animal.getName() == null)
//        {
//            throw new EntityNotFoundException("No animal name found to update!");
//        }
//
//        if (animal.getUsers()
//                .size() > 0)
//        {
//            throw new EntityExistsException("Zoo Roles are not updated through Animal. See endpoint POST: users/user/{userid}/animal/{roleid}");
//        }
//
//        Animal newAnimal = findRoleById(id); // see if id exists
//
//        rolerepos.updateRoleName(zooAuditing.getCurrentAuditor()
//                                         .get(),
//                                 id,
//                                 animal.getName());
//        return findRoleById(id);
//    }
}
