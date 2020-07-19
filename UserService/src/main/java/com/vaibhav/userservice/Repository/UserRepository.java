package com.vaibhav.userservice.Repository;

import com.vaibhav.userservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

