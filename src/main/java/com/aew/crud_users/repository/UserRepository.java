package com.aew.crud_users.repository;

import com.aew.crud_users.model.User;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the User entity. Also defines the operations
 * that every UserService should implement.
 * 
 * @author Adrian E. Wilgenhoff
 * 
 */

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {

    /**
     * Get the "email" user.
     * 
     * @param email the email of the user to find
     * 
     * @return User
     */
    public User findByEmail(String email);

    /**
     * Get the "username" user.
     * 
     * @param username the username of the user to find
     * @return User
     */
    public User findByUsername(String username);

    /**
     * Get the "name and lastname" user.
     * 
     * @param name     the name of the user to find
     * @param lastname the lastname of the user to find
     * @return User
     */
    public User findByNameAndLastname(String name, String lastname);

    /**
     * Get a list of user.
     * 
     * @return List<User> Return a list ordered of users.
     */
    @Query(sort = "{ lastname : -1 }")
    public Iterable<User> findAllUserOrderedByLastname();

}