package com.davidgs.itjuana.challenge.UserCorp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.davidgs.itjuana.challenge.UserCorp.models.UserModel;

public interface UserPaginationRepository extends PagingAndSortingRepository<UserModel, Long> {
    
}
