package com.theironyard.services;

import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jonathandavidblack on 6/27/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
