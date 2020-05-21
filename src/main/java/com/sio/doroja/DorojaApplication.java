package com.sio.doroja;

import com.sio.doroja.models.ERole;
import com.sio.doroja.models.Role;
import com.sio.doroja.models.User;
import com.sio.doroja.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Set;

@SpringBootApplication
public class DorojaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DorojaApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
       User user = new User();
        user.setEmail("sdsd@gmail.com");
        user.setPassword("111111");
        user.setUsername("ovisdsd");
        Role role = new Role() ;
        role.setName(ERole.ROLE_ADMIN);
        user.setRoles((Set<Role>) role);
        userRepository.save(user);
    }
}
