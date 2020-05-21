package com.sio.doroja.repository;

import java.util.Optional;

import com.sio.doroja.models.ERole;
import com.sio.doroja.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
