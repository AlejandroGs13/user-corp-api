package com.davidgs.itjuana.challenge.UserCorp.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.davidgs.itjuana.challenge.UserCorp.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Long> {
    

   
     
}
