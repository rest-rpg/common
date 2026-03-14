package com.rest_rpg.common.feign.user;

import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(clients = UserInternalClient.class)
public class UserFeignConfigurer {}
