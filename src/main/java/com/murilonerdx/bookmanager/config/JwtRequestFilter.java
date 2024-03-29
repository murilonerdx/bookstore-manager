package com.murilonerdx.bookmanager.config;

import com.murilonerdx.bookmanager.model.user.service.AuthenticationService;
import com.murilonerdx.bookmanager.model.user.service.JwtTokenManager;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {

  @Autowired private AuthenticationService authenticationService;

  @Autowired private JwtTokenManager jwtTokenManager;

  @Override
  protected void doFilterInternal(HttpServletRequest request,
                                  HttpServletResponse response,
                                  FilterChain chain)
      throws ServletException, IOException {
    String username = null;
    String jwtToken = null;

    String requestTokenHeader = request.getHeader("Authorization");
    if (requestTokenHeader != null &&
        requestTokenHeader.startsWith("Bearer ")) {
      jwtToken = requestTokenHeader.substring(7);
      username = jwtTokenManager.getUsernameFromToken(jwtToken);

    } else {
      logger.warn("JWT Token does not begin with Bearer String");
    }

    if (username != null &&
        SecurityContextHolder.getContext().getAuthentication() == null) {
      addUsernameInContext(request, username, jwtToken);
    }
    chain.doFilter(request, response);
  }

  private void addUsernameInContext(HttpServletRequest request, String username,
                                    String jwtToken) {
    UserDetails userDetails =
        authenticationService.loadUserByUsername(username);
    if (jwtTokenManager.validateToken(jwtToken, userDetails)) {
      UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
          new UsernamePasswordAuthenticationToken(userDetails, null,
                                                  userDetails.getAuthorities());
      usernamePasswordAuthenticationToken.setDetails(
          new WebAuthenticationDetailsSource().buildDetails(request));
      SecurityContextHolder.getContext().setAuthentication(
          usernamePasswordAuthenticationToken);
    }
  }
}
