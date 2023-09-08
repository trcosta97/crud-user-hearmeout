package br.com.hearMeOut.userCrud.controller;

import br.com.hearMeOut.userCrud.domain.address.Address;
import br.com.hearMeOut.userCrud.domain.user.User;
import br.com.hearMeOut.userCrud.domain.user.UserSignInData;
import br.com.hearMeOut.userCrud.domain.user.UserUpdateData;
import br.com.hearMeOut.userCrud.service.AddressService;
import br.com.hearMeOut.userCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody UserSignInData data, UriComponentsBuilder uriBuilder){
        var user = new User(data);
        var address = new Address(data.address());

        Address savedAddress = addressService.save(address);
        user.setAddress(savedAddress);

        User savedUser = userService.save(user);

        var uri = uriBuilder.path("/user/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(uri).body(savedUser);
    }

    @GetMapping("user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        var user = userService.get(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("user/all")
    public ResponseEntity<List<User>> getAllUsers(){
        var allUsers = userService.getAll();
        return ResponseEntity.ok(allUsers);
    }


    @PutMapping("update")
    public ResponseEntity<User> update(@PathVariable UserUpdateData data, @RequestParam Long id){
        var user = new User(data);
        User updatedUser = userService.update(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("user/{id}")
    public ResponseEntity<User> delete(@PathVariable Long id){
        return ResponseEntity.ok(userService.delete(id));
    }
}
