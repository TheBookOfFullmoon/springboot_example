package dev.mangetsu.test_syb.repository;

import dev.mangetsu.test_syb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer> {
}
