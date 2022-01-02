//package com.example.Employees.Security;
//
//import com.google.common.collect.Sets;
//import org.apache.tomcat.util.buf.StringUtils;
////import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//public enum ApplicationUserRole {
//    EMPLOYEE(Sets.newHashSet(ApplicationUserPermission.DEPARTMENT_READ,
//                                ApplicationUserPermission.EMPLOYEE_READ,
//                                ApplicationUserPermission.PROJECT_READ)),
//    ADMIN(Sets.newHashSet(ApplicationUserPermission.EMPLOYEE_WRITE,
//            ApplicationUserPermission.EMPLOYEE_READ,
//            ApplicationUserPermission.DEPARTMENT_WRITE,
//            ApplicationUserPermission.DEPARTMENT_READ,
//            ApplicationUserPermission.PROJECT_WRITE,
//            ApplicationUserPermission.PROJECT_READ,
//            ApplicationUserPermission.USER_WRITE,
//            ApplicationUserPermission.USER_READ
//            ));
//
//    private final Set<ApplicationUserPermission> permissions;
//
//    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
//        this.permissions = permissions;
//    }
//
//    public Set<ApplicationUserPermission> getPermissions() {
//        return permissions;
//    }
//
//    public Set<SimpleGrantedAuthority> getGrantedAuthority(){
//       Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
//                .map(p -> new SimpleGrantedAuthority(p.getPermission()))
//                .collect(Collectors.toSet());
//        permissions.add( new SimpleGrantedAuthority("ROLE_"+ this.name()));
//        return permissions;
//    }
//
//    public String getGrantedAuthorityAsString(){
//        Set<String> auths = getPermissions().stream()
//                .map(p -> p.getPermission())
//                .collect(Collectors.toSet());
//        auths.add("ROLE_"+ this.name());
//        String authAsString = StringUtils.join(auths,',');
//        return authAsString;
//    }
//}
