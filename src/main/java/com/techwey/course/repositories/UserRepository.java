package com.techwey.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techwey.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
