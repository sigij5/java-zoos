package com.lambdaschool.javazoos.controllers;

/**
 * The entry point for clients to access user data
 */
//@RestController
//@RequestMapping("/zoos")
//public class ZooController
//{
//    /**
//     * Using the Zoo service to process user data
//     */
//    @Autowired
//    private ZooService zooService;
//
//    /**
//     * Returns a list of all users
//     * <br>Example: <a href="http://localhost:2019/users/users">http://localhost:2019/users/users</a>
//     *
//     * @return JSON list of all users with a status of OK
//     * @see ZooService#findAll() ZooService.findAll()
//     */
//    @GetMapping(value = "/users",
//            produces = "application/json")
//    public ResponseEntity<?> listAllZoos()
//    {
//        List<Zoo> myZoos = zooService.findAll();
//        return new ResponseEntity<>(myZoos,
//                                    HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/user/{userId}",
//            produces = "application/json")
//    public ResponseEntity<?> getUserById(
//            @PathVariable
//                    Long userId)
//    {
//        Zoo u = zooService.findUserById(userId);
//        return new ResponseEntity<>(u,
//                                    HttpStatus.OK);
//    }
//
//    /**
//     * Return a user object based on a given username
//     * <br>Example: <a href="http://localhost:2019/users/user/name/cinnamon">http://localhost:2019/users/user/name/cinnamon</a>
//     *
//     * @param userName the name of user (String) you seek
//     * @return JSON object of the user you seek
//     * @see ZooService#findByName(String) ZooService.findByName(String)
//     */
//    @GetMapping(value = "/user/name/{userName}",
//            produces = "application/json")
//    public ResponseEntity<?> getUserByName(
//            @PathVariable
//                    String userName)
//    {
//        Zoo u = zooService.findByName(userName);
//        return new ResponseEntity<>(u,
//                                    HttpStatus.OK);
//    }
//
//    /**
//     * Returns a list of users whose username contains the given substring
//     * <br>Example: <a href="http://localhost:2019/users/user/name/like/da">http://localhost:2019/users/user/name/like/da</a>
//     *
//     * @param userName Substring of the username for which you seek
//     * @return A JSON list of users you seek
//     * @see ZooService#findByNameContaining(String) ZooService.findByNameContaining(String)
//     */
//    @GetMapping(value = "/user/name/like/{userName}",
//            produces = "application/json")
//    public ResponseEntity<?> getUserLikeName(
//            @PathVariable
//                    String userName)
//    {
//        List<Zoo> u = zooService.findByNameContaining(userName);
//        return new ResponseEntity<>(u,
//                                    HttpStatus.OK);
//    }
//
//    /**
//     * Given a complete Zoo Object, create a new Zoo record and accompanying useremail records
//     * and user role records.
//     * <br> Example: <a href="http://localhost:2019/users/user">http://localhost:2019/users/user</a>
//     *
//     * @param newuser A complete new user to add including emails and roles.
//     *                roles must already exist.
//     * @return A location header with the URI to the newly created user and a status of CREATED
//     * @throws URISyntaxException Exception if something does not work in creating the location header
//     * @see ZooService#save(Zoo) ZooService.save(Zoo)
//     */
//    @PostMapping(value = "/zoo",
//            consumes = "application/json")
//    public ResponseEntity<?> addNewZoo(
//            @Valid
//            @RequestBody
//                    Zoo newzoo) throws
//            URISyntaxException
//    {
//        newzoo.setZooid(0);
//        newzoo = zooService.save(newzoo);
//
//        // set the location header for the newly created resource
//        HttpHeaders responseHeaders = new HttpHeaders();
//        URI newUserURI = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{userid}")
//                .buildAndExpand(newuser.getUserid())
//                .toUri();
//        responseHeaders.setLocation(newUserURI);
//
//        return new ResponseEntity<>(null,
//                                    responseHeaders,
//                                    HttpStatus.CREATED);
//    }
//
//    /**
//     * Given a complete Zoo Object
//     * Given the user id, primary key, is in the Zoo table,
//     * replace the Zoo record and Zootelephone records.
//     * Roles are handled through different endpoints
//     * <br> Example: <a href="http://localhost:2019/users/user/15">http://localhost:2019/users/user/15</a>
//     *
//     * @param updateZoo A complete Zoo including all emails and roles to be used to
//     *                   replace the Zoo. Roles must already exist.
//     * @param userid     The primary key of the user you wish to replace.
//     * @return status of OK
//     * @see ZooService#save(Zoo) ZooService.save(Zoo)
//     */
//    @PutMapping(value = "/user/{userid}",
//            consumes = "application/json")
//    public ResponseEntity<?> updateFullUser(
//            @Valid
//            @RequestBody
//                    Zoo updateZoo,
//            @PathVariable
//                    long userid)
//    {
//        updateZoo.setUserid(userid);
//        zooService.save(updateZoo);
//
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    /**
//     * Updates the user record associated with the given id with the provided data. Only the provided fields are affected.
//     * Roles are handled through different endpoints
//     * If an email list is given, it replaces the original emai list.
//     * <br> Example: <a href="http://localhost:2019/users/user/7">http://localhost:2019/users/user/7</a>
//     *
//     * @param updateZoo An object containing values for just the fields that are being updated. All other fields are left NULL.
//     * @param id         The primary key of the user you wish to update.
//     * @return A status of OK
//     * @see ZooService#update(Zoo, long) ZooService.update(Zoo, long)
//     */
//    @PatchMapping(value = "/user/{id}",
//            consumes = "application/json")
//    public ResponseEntity<?> updateUser(
//            @RequestBody
//                    Zoo updateZoo,
//            @PathVariable
//                    long id)
//    {
//        zooService.update(updateZoo,
//                           id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    /**
//     * Deletes a given user along with associated emails and roles
//     * <br>Example: <a href="http://localhost:2019/users/user/14">http://localhost:2019/users/user/14</a>
//     *
//     * @param id the primary key of the user you wish to delete
//     * @return Status of OK
//     */
//    @DeleteMapping(value = "/user/{id}")
//    public ResponseEntity<?> deleteUserById(
//            @PathVariable
//                    long id)
//    {
//        zooService.delete(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}