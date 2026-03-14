package com.rest_rpg.common.feign.user;

import com.ms.user.model.UserLite;
import com.ms.user.model.UserWithPassword;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

public interface UserInternalApi {

  @RequestMapping(method = RequestMethod.GET, value = "/internal/user/name/{username}")
  UserWithPassword getUserByUsername(@PathVariable("username") @NotBlank String username);

  @RequestMapping(method = RequestMethod.GET, value = "/internal/user/lite/name/{username}")
  UserLite getUserLiteByUsername(@PathVariable("username") @NotBlank String username);

  @RequestMapping(method = RequestMethod.GET, value = "/internal/user/{userId}")
  UserLite getUserById(@PathVariable("userId") UUID userId);
}
