package com.murilonerdx.bookmanager.config;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class BookstoreAuditorAware implements AuditorAware<String> {

  @Override
  public Optional<String> getCurrentAuditor() {
    Authentication authentication =
        SecurityContextHolder.getContext().getAuthentication();
    return Optional.of(authentication.getName());
  }
}
