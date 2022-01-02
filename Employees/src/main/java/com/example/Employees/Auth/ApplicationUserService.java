//package com.example.Employees.Auth;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ApplicationUserService implements UserDetailsService {
//
//
//    private UserRepository userRepository;
//    final private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public ApplicationUserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        ApplicationUser user = userRepository.findByUsername(username)
//                .orElseThrow(()-> new UsernameNotFoundException("User not found"));
//        return user;
//    }
//
//    public void AddUser(ApplicationUser newUser) {
//        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
//        userRepository.save(newUser);
//    }
//}
