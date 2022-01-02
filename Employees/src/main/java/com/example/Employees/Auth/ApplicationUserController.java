//package com.example.Employees.Auth;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ApplicationUserController {
//
//    final private ApplicationUserService service;
//
//    @Autowired
//    public ApplicationUserController(ApplicationUserService service) {
//        this.service = service;
//    }
//
//    @PostMapping("/Register")
//   // @PreAuthorize("hasAuthority('user:write')")
//    public void AddUser(@RequestBody ApplicationUser newUser){
//        service.AddUser(newUser);
//    }
//
//}
