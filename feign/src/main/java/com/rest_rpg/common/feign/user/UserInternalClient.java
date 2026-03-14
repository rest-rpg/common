package com.rest_rpg.common.feign.user;

import com.ms.user.model.UserLite;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Objects;
import java.util.UUID;

@FeignClient(value = "user", url = "${feign.user.url}")
public interface UserInternalClient extends UserInternalApi {

  default String getUsernameFromContext() {
    return SecurityContextHolder.getContext().getAuthentication().getName();
  }

  default UserLite getUserFromContext() {
    String username = getUsernameFromContext();

    return getUserLiteByUsername(username);
  }

  default boolean doesCharacterBelongToUser(UUID userId) {
    UserLite user = getUserById(userId);

    return Objects.equals(user.getUsername(), getUsernameFromContext());
  }
}
