package com.example.demo.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
   private static List<User> users = new ArrayList<>();
   private static int count = 3;

   static {
       users.add(new User(1, new Date(), "Yaswanth"));
       users.add(new User(2, new Date(), "Kavya"));
       users.add(new User(3, new Date(), "Kritini"));
   }

   public List<User> findAll() {
       return users;
   }

}
