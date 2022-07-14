package com.davidgs.itjuana.challenge.UserCorp.controller;

import com.davidgs.itjuana.challenge.UserCorp.dto.PaginationResponse;
import com.davidgs.itjuana.challenge.UserCorp.dto.Response;
import com.davidgs.itjuana.challenge.UserCorp.models.UserModel;
import com.davidgs.itjuana.challenge.UserCorp.services.UserService;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired()
    private UserService userService;


    @GetMapping(value = "/{page}/{size}")
    public ResponseEntity<PaginationResponse> getAll(@PathVariable int page, @PathVariable int size) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user").toUriString());
        return ResponseEntity.created(uri).body(userService.getAllUsers(page, size));
    }

    @GetMapping(value = "/asc")
    public ResponseEntity<List<UserModel>> getAllAsc(){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user").toUriString());
        return ResponseEntity.created(uri).body(userService.getAllUsersOrderById());
    }



    @GetMapping(value = "/{key}")
    public ResponseEntity<UserModel> getById(@PathVariable Long key){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user").toUriString());
        return ResponseEntity.created(uri).body(userService.getUser(key));
    }
    

    @PostMapping()
    public ResponseEntity<UserModel> save(@RequestBody UserModel user){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user").toUriString());
        return ResponseEntity.created(uri).body(userService.createUser(user));
    }


    @PutMapping()
    public ResponseEntity<UserModel> update(@RequestBody UserModel user){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user").toUriString());
        return ResponseEntity.created(uri).body(userService.updateUser(user));
    }

    @DeleteMapping(value = "/{key}")
    public ResponseEntity<Response> delete(@PathVariable Long key){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user").toUriString());
        try{
            userService.deleteUser(key);
            return ResponseEntity.created(uri).body(new Response("User delete", 200));
        }catch(Exception e){
            return ResponseEntity.created(uri).body(new Response(e.getMessage(), 400));
        }
    }

}
