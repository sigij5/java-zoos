//package com.lambdaschool.usermodel.services;
//
//import com.lambdaschool.usermodel.models.Zootelephone;
//
//import java.util.List;
//
//
///**
// * The Service that works with the Zootelephone Model
// * <p>
// * Note: Emails are added through the add user process
// */
//public interface ZootelephoneService
//{
//    /**
//     * Returns a list of all users and their emails
//     *
//     * @return List of users and their emails
//     */
//    List<Zootelephone> findAll();
//
//    /**
//     * Returns the user email combination associated with the given id
//     *
//     * @param id The primary key (long) of the user email combination you seek
//     * @return The user email combination (Zootelephone) you seek
//     */
////    Zootelephone findUseremailById(long id);
//
//    /**
//     * Remove the user email combination referenced by the given id
//     *
//     * @param id The primary key (long) of the user email combination you seek
//     */
//    void delete(long id);
//
//    /**
//     * Replaces the email of the user email combination you seek
//     *
//     * @param useremailid  The primary key (long) of the user email combination you seek
//     * @param emailaddress The new email address (String) for this user email combination
//     * @return The Zootelephone object that you updated including the new email address
//     */
////    Zootelephone update(
////            long phoneid,
////            String phone);
//    Zootelephone save(
//            long phoneid,
//            String phonenumber);
//}
