//package com.lambdaschool.usermodel.services;
//
//import com.lambdaschool.usermodel.models.Zoo;
//import com.lambdaschool.usermodel.models.Zootelephone;
//import com.lambdaschool.usermodel.repository.ZootelephoneRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityNotFoundException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Implements the ZootelephoneService Interface
// */
//@Transactional
//@Service(value = "useremailService")
//public class ZootelephoneServiceImpl
//        implements ZootelephoneService
//{
//    /**
//     * Connects this service to the Zootelephone model
//     */
//    @Autowired
//    private ZootelephoneRepository useremailrepos;
//
//    /**
//     * Connects this servive to the Zoo Service
//     */
//    @Autowired
//    private ZooService zooService;
//
//    @Override
//    public List<Zootelephone> findAll()
//    {
//        List<Zootelephone> list = new ArrayList<>();
//        /*
//         * findAll returns an iterator set.
//         * iterate over the iterator set and add each element to an array list.
//         */
//        useremailrepos.findAll()
//                .iterator()
//                .forEachRemaining(list::add);
//        return list;
//    }
//
//    @Override
//    public Zootelephone findUseremailById(long id)
//    {
//        return useremailrepos.findById(id)
//                .orElseThrow(() -> new EntityNotFoundException("Zootelephone with id " + id + " Not Found!"));
//    }
//
//    @Transactional
//    @Override
//    public void delete(long id)
//    {
//        if (useremailrepos.findById(id)
//                .isPresent())
//        {
//            useremailrepos.deleteById(id);
//        } else
//        {
//            throw new EntityNotFoundException("Zootelephone with id " + id + " Not Found!");
//        }
//    }
//
//    @Transactional
//    @Override
//    public Zootelephone update(
//            long useremailid,
//            String emailaddress)
//    {
//        if (useremailrepos.findById(useremailid)
//                .isPresent())
//        {
//            Zootelephone zootelephone = findUseremailById(useremailid);
//            zootelephone.set(emailaddress.toLowerCase());
//            return useremailrepos.save(zootelephone);
//        } else
//        {
//            throw new EntityNotFoundException("Zootelephone with id " + useremailid + " Not Found!");
//        }
//    }
//
//    @Transactional
//    @Override
//    public Zootelephone save(
//            long userid,
//            String emailaddress)
//    {
//        Zoo currentZoo = zooService.findUserById(userid);
//
//        Zootelephone newUserEmail = new Zootelephone(currentZoo,
//                                               emailaddress);
//        return useremailrepos.save(newUserEmail);
//    }
//}
