package com.sio.doroja;

import com.sio.doroja.models.ERole;
import com.sio.doroja.models.Role;
import com.sio.doroja.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DorojaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DorojaApplication.class, args);
    }

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String... args) {
        if (roleRepository.findAll().size() == 0) {
            roleRepository.save(new Role(1L, ERole.ROLE_USER));
            roleRepository.save(new Role(2L, ERole.ROLE_ADMIN));
            roleRepository.save(new Role(3L, ERole.ROLE_MODERATOR));
        }
    }
}