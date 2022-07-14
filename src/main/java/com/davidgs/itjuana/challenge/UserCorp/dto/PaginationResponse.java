package com.davidgs.itjuana.challenge.UserCorp.dto;

import java.util.List;

import com.davidgs.itjuana.challenge.UserCorp.models.UserModel;

public class PaginationResponse {
    
    private List<UserModel> users;
    private int totalPages;
    private Long totalElements;
    private int currentPage;

    public PaginationResponse(List<UserModel> users, int totalPages, Long totalElements, int currentPage) {
        this.users = users;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.currentPage = currentPage;
    }

    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public Long getTotalElements() {
        return totalElements;
    }
    
    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

}
