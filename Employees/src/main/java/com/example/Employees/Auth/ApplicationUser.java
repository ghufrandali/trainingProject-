//package com.example.Employees.Auth;
//
//
//import org.checkerframework.common.aliasing.qual.Unique;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.*;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Table(name = "ApplicationUser",uniqueConstraints = {
//        @UniqueConstraint(columnNames = "username")
//})
//@Entity
//public class ApplicationUser implements UserDetails {
//
//
//
//    @Id
//    @Column(name="id")
//    private Long id;
//    @Column(name = "password")
//    private String password;
//    @Column(name = "username",unique = true)
//    private String username;
//    @Column(name="role")
//    private String role;
//    @Column(name="grantedAuthorities")
//    private String grantedAuthorities;
//    @Column(name = "isAccountNonExpired")
//    private Boolean isAccountNonExpired;
//    @Column(name = "isAccountNonLocked")
//    private Boolean isAccountNonLocked;
//    @Column(name = "isCredentialsNonExpired")
//    private Boolean isCredentialsNonExpired;
//    @Column(name = "isEnabled")
//    private Boolean isEnabled;
//
//    public ApplicationUser() {
//        this.isAccountNonExpired = true;
//        this.isAccountNonLocked = true;
//        this.isCredentialsNonExpired = true;
//        this.isEnabled = true;
//    }
//
//    public ApplicationUser(Long id,
//                           String password,
//                           String username,
//                           String role,
//                           String grantedAuthorities,
//                           Boolean isAccountNonExpired,
//                           Boolean isAccountNonLocked,
//                           Boolean isCredentialsNonExpired,
//                           Boolean isEnabled) {
//        this.id = id;
//        this.password = password;
//        this.username = username;
//        this.role = role;
//        this.grantedAuthorities = grantedAuthorities;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Boolean getAccountNonExpired() {
//        return isAccountNonExpired;
//    }
//
//    public void setAccountNonExpired(Boolean accountNonExpired) {
//        isAccountNonExpired = accountNonExpired;
//    }
//
//    public Boolean getAccountNonLocked() {
//        return isAccountNonLocked;
//    }
//
//    public void setAccountNonLocked(Boolean accountNonLocked) {
//        isAccountNonLocked = accountNonLocked;
//    }
//
//    public Boolean getCredentialsNonExpired() {
//        return isCredentialsNonExpired;
//    }
//
//    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
//        isCredentialsNonExpired = credentialsNonExpired;
//    }
//
//    public Boolean getEnabled() {
//        return isEnabled;
//    }
//
//    public void setEnabled(Boolean enabled) {
//        isEnabled = enabled;
//    }
//
//    @Override
//    public Set<SimpleGrantedAuthority> getAuthorities() {
//        Set<String> authorities = Set.of(grantedAuthorities.split(","));
//        Set<SimpleGrantedAuthority> GrantedAuthority = authorities.stream()
//                .map(p-> new SimpleGrantedAuthority(p) )
//                .collect(Collectors.toSet());
//        return GrantedAuthority;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return isAccountNonExpired;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return isAccountNonLocked;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return isCredentialsNonExpired;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return isEnabled;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public void setGrantedAuthorities(String grantedAuthorities) {
//        this.grantedAuthorities = grantedAuthorities;
//    }
//
//    public void setAccountNonExpired(boolean accountNonExpired) {
//        isAccountNonExpired = accountNonExpired;
//    }
//
//    public void setAccountNonLocked(boolean accountNonLocked) {
//        isAccountNonLocked = accountNonLocked;
//    }
//
//    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
//        isCredentialsNonExpired = credentialsNonExpired;
//    }
//
//    public void setEnabled(boolean enabled) {
//        isEnabled = enabled;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public String getGrantedAuthorities() {
//        return grantedAuthorities;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
