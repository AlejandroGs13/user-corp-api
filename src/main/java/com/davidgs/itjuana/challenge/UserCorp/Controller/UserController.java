package com.davidgs.itjuana.challenge.UserCorp.Controller;


import com.davidgs.itjuana.challenge.UserCorp.dto.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping()
    public Response demo(){
        System.out.println("ENTROOOOOO");
        Response  r =  new Response("TEst",33);
        return r;
    }


}
