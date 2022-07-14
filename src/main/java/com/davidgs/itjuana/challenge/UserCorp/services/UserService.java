package com.davidgs.itjuana.challenge.UserCorp.services;

import java.util.List;

import com.davidgs.itjuana.challenge.UserCorp.dto.PaginationResponse;
import com.davidgs.itjuana.challenge.UserCorp.models.UserModel;

public interface UserService {
    
    //CRUD
    UserModel createUser(UserModel user);
    UserModel getUser(Long id);
    PaginationResponse getAllUsers(int page,int size);
    List<UserModel> getAllUsersOrderById();
    UserModel updateUser(UserModel user);
    void deleteUser(Long id);

}
