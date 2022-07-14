package com.davidgs.itjuana.challenge.UserCorp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.davidgs.itjuana.challenge.UserCorp.dto.PaginationResponse;
import com.davidgs.itjuana.challenge.UserCorp.models.UserModel;
import com.davidgs.itjuana.challenge.UserCorp.repository.UserPaginationRepository;
import com.davidgs.itjuana.challenge.UserCorp.repository.UserRepository;
import com.davidgs.itjuana.challenge.UserCorp.services.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired()
    private UserRepository userRepository;

    @Autowired()
    private UserPaginationRepository userPaginationRepository;

    @Override
    public UserModel createUser(UserModel user) {
        
        return userRepository.save(user);
    }

    @Override
    public UserModel getUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public PaginationResponse getAllUsers(int page,int size) {
        Pageable paging = PageRequest.of(page, size,Sort.by("id").ascending());
        Page<UserModel> pagedResult = userPaginationRepository.findAll(paging);
        
        PaginationResponse paginationResponse = new PaginationResponse(
            pagedResult.toList(),
            pagedResult.getTotalPages(),
            pagedResult.getTotalElements(),
            page
        );
        return paginationResponse;
    }

    @Override
    public UserModel updateUser(UserModel user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserModel> getAllUsersOrderById() {
        return userRepository.findAll();
    }
    
}
