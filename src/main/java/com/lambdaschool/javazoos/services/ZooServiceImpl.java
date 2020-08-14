package com.lambdaschool.javazoos.services;

/**
 * Implements ZooService Interface
 */

import com.lambdaschool.javazoos.models.Zoo;
import com.lambdaschool.javazoos.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService{
    @Autowired
    private ZooRepository zoorepos;

    @Override
    public List<Zoo> findAllZoos() {
        List<Zoo> list = new ArrayList<>();
        zoorepos.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }

    @Override
    public Zoo findZooById(long id) throws EntityNotFoundException {
        return zoorepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Zoo " + id + " Not Found"));
    }
}

//@Transactional
//@Service(value = "userService")
//public class ZooServiceImpl
//        implements ZooService
//{
//    /**
//     * Connects this service to the Zoo table.
//     */
//    @Autowired
//    private ZooRepository userrepos;
//
//    /**
//     * Connects this service to the Animal table
//     */
//    @Autowired
//    private AnimalService animalService;
//
//
//    public Zoo findUserById(long id) throws
//            EntityNotFoundException
//    {
//        return userrepos.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Zoo id " + id + " not found!"));
//    }
//
//    @Override
//    public List<Zoo> findByNameContaining(String username)
//    {
//        return userrepos.findByUsernameContainingIgnoreCase(username.toLowerCase());
//    }
//
//    @Override
//    public List<Zoo> findAll()
//    {
//        List<Zoo> list = new ArrayList<>();
//        /*
//         * findAll returns an iterator set.
//         * iterate over the iterator set and add each element to an array list.
//         */
//        userrepos.findAll()
//                .iterator()
//                .forEachRemaining(list::add);
//        return list;
//    }
//
//    @Transactional
//    @Override
//    public void delete(long id)
//    {
//        userrepos.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Zoo id " + id + " not found!"));
//        userrepos.deleteById(id);
//    }
//
//    @Override
//    public Zoo findByName(String name)
//    {
//        Zoo uu = userrepos.findByUsername(name.toLowerCase());
//        if (uu == null)
//        {
//            throw new EntityNotFoundException("Zoo name " + name + " not found!");
//        }
//        return uu;
//    }
//
//    @Transactional
//    @Override
//    public Zoo save(Zoo zoo)
//    {
//        Zoo newZoo = new Zoo();
//
//        if (zoo.getUserid() != 0)
//        {
//            userrepos.findById(zoo.getUserid())
//                    .orElseThrow(() -> new EntityNotFoundException("Zoo id " + zoo.getUserid() + " not found!"));
//            newZoo.setUserid(zoo.getUserid());
//        }
//
//        newZoo.setUsername(zoo.getUsername()
//                                    .toLowerCase());
//        newZoo.setPassword(zoo.getPassword());
//        newZoo.setPrimaryemail(zoo.getPrimaryemail()
//                                        .toLowerCase());
//
//        newZoo.getRoles()
//                .clear();
//        for (ZooAnimals r : zoo.getRoles())
//        {
//            Animal newAnimal = animalService.findRoleById(r.getRole().getRoleid());
//
//            newZoo.getRoles()
//                    .add(new ZooAnimals(newZoo, newAnimal));
//        }
//
//        newZoo.getUseremails()
//                .clear();
//        for (Zootelephone ue : zoo.getUseremails())
//        {
//            newZoo.getUseremails()
//                    .add(new Zootelephone(newZoo,
//                                       ue.getUseremail()));
//        }
//
//        return userrepos.save(newZoo);
//    }
//
//    @Transactional
//    @Override
//    public Zoo update(
//            Zoo zoo,
//            long id)
//    {
//        Zoo currentZoo = findUserById(id);
//
//        if (zoo.getUsername() != null)
//        {
//            currentZoo.setUsername(zoo.getUsername()
//                                            .toLowerCase());
//        }
//
//        if (zoo.getPassword() != null)
//        {
//            currentZoo.setPassword(zoo.getPassword());
//        }
//
//        if (zoo.getPrimaryemail() != null)
//        {
//            currentZoo.setPrimaryemail(zoo.getPrimaryemail()
//                                                .toLowerCase());
//        }
//
//        if (zoo.getRoles()
//                .size() > 0)
//        {
//            currentZoo.getRoles()
//                    .clear();
//            for (ZooAnimals r : zoo.getRoles())
//            {
//                Animal newAnimal = animalService.findRoleById(r.getRole().getRoleid());
//
//                currentZoo.getRoles()
//                        .add(new ZooAnimals(currentZoo, newAnimal));
//            }
//        }
//
//        if (zoo.getUseremails()
//                .size() > 0)
//        {
//            currentZoo.getUseremails()
//                    .clear();
//            for (Zootelephone ue : zoo.getUseremails())
//            {
//                currentZoo.getUseremails()
//                        .add(new Zootelephone(currentZoo,
//                                           ue.getUseremail()));
//            }
//        }
//
//        return userrepos.save(currentZoo);
//    }
//
//    @Transactional
//    @Override
//    public void deleteAll()
//    {
//        userrepos.deleteAll();
//    }
//}
