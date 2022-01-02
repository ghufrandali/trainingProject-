//package com.example.Employees.Auth;
//
//import com.google.common.base.Strings;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jws;
//import io.jsonwebtoken.JwtException;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//public class TokenVerifier extends OncePerRequestFilter { //authorization
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request,
//                                    HttpServletResponse response,
//                                    FilterChain filterChain) throws ServletException, IOException {
//
//        String token = request.getHeader("token");
//
//        if(Strings.isNullOrEmpty(token))
//        {
//            filterChain.doFilter(request,response);
//            return;
//        }
//        try {
//
//            Jws<Claims> claimsJws = Jwts.parser()
//                    .setSigningKey(Keys.hmacShaKeyFor("securesecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecuresecure".getBytes()))
//                    .parseClaimsJws(token);
//
//            Claims body = claimsJws.getBody();
//            String username = body.getSubject();
//            var authorities = (List<Map<String,String>>) body.get("Authorities");
//            Set<SimpleGrantedAuthority> grantedAuthorities = authorities.stream()
//                    .map(m-> new SimpleGrantedAuthority(m.get("authority")))
//                    .collect(Collectors.toSet());
//
//            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
//                    username,
//                    null,
//                    grantedAuthorities
//            );
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//        }catch (JwtException e){
//            throw new IllegalStateException("token can not be trusted");
//        }
//
//
//        filterChain.doFilter(request,response);
//    }
//}
