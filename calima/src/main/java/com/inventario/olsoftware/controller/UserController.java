package com.inventario.olsoftware.controller;

import com.inventario.olsoftware.exception.InvalidInputException;
import com.inventario.olsoftware.exception.ResourceNotFoundException;
import com.inventario.olsoftware.service.UserService;
import com.inventario.olsoftware.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {

    @Autowired
    private UserService userService;

    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @GetMapping("/getUsers")
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> getUserById(@PathVariable Long id) {
        UserModel user = userService.getUserById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
        return ResponseEntity.ok(user);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/createUser")
    public ResponseEntity<UserModel> createUser(@RequestBody UserModel user) {
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new InvalidInputException("Username is required");
        }
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            throw new InvalidInputException("Password is required");
        }
        if (user.getTipoDni() == null || user.getTipoDni().isEmpty()) {
            throw new InvalidInputException("Tipo de identificacion es requirido");
        }
        if (user.getNumDni() == null || user.getNumDni().isEmpty()) {
            throw new InvalidInputException("Numero de Identificacion es requerido");
        }
        UserModel savedUser = userService.createUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/users/{id}")
    public ResponseEntity<UserModel> updateUser(@PathVariable Long id, @RequestBody UserModel user) {
        UserModel updatedUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
