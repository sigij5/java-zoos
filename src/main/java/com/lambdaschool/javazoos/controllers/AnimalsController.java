package com.lambdaschool.javazoos.controllers;

import com.lambdaschool.javazoos.services.AnimalService;
import com.lambdaschool.javazoos.views.ZooCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The entry point for clients to access role data
 * <p>
 * Note: we cannot update a role
 * we cannot update a role
 * working with the "non-owner" object in a many to many relationship is messy
 * we will be fixing that!
 */
@RestController
@RequestMapping("/animals")
public class AnimalsController
{
    @Autowired
    AnimalService animalService;

    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> getZooCounts(){
        List<ZooCounts> myList = animalService.getZooCounts();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

//    @GetMapping(value = "/roles",
//            produces = "application/json")
//    public ResponseEntity<?> listRoles()
//    {
//        List<Animal> allAnimals = animalService.findAll();
//        return new ResponseEntity<>(allAnimals,
//                                    HttpStatus.OK);
//    }

//    @GetMapping(value = "/role/{roleId}",
//            produces = "application/json")
//    public ResponseEntity<?> getRoleById(
//            @PathVariable
//                    Long roleId)
//    {
//        Animal r = animalService.findRoleById(roleId);
//        return new ResponseEntity<>(r,
//                                    HttpStatus.OK);
//    }

//    @GetMapping(value = "/role/name/{roleName}",
//            produces = "application/json")
//    public ResponseEntity<?> getRoleByName(
//            @PathVariable
//                    String roleName)
//    {
//        Animal r = animalService.findByName(roleName);
//        return new ResponseEntity<>(r,
//                                    HttpStatus.OK);
//    }
//    @PostMapping(value = "/role",
//            consumes = "application/json")
//    public ResponseEntity<?> addNewRole(
//            @Valid
//            @RequestBody
//                    Animal newAnimal)
//    {
//        // ids are not recognized by the Post method
//        newAnimal.setAnimalid(0);
//        newAnimal = animalService.save(newAnimal);
//
//        // set the location header for the newly created resource
//        HttpHeaders responseHeaders = new HttpHeaders();
//        URI newRoleURI = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{roleid}")
//                .buildAndExpand(newAnimal.getAnimalid())
//                .toUri();
//        responseHeaders.setLocation(newRoleURI);
//
//        return new ResponseEntity<>(null,
//                                    responseHeaders,
//                                    HttpStatus.CREATED);
//    }
//
//    @PutMapping(value = "/role/{roleid}",
//            consumes = {"application/json"})
//    public ResponseEntity<?> putUpdateRole(
//            @PathVariable
//                    long roleid,
//            @RequestBody
//                    Animal newAnimal)
//    {
//        newAnimal = animalService.update(roleid,
//                newAnimal);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}
