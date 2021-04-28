package com.example.userservice.userservice.repository;


import com.example.userservice.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {

    User findByUserId(Long userId);

}
