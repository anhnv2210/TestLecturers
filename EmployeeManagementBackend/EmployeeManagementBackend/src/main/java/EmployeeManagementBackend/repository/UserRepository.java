package EmployeeManagementBackend.repository;

import EmployeeManagementBackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);

    Optional<User> findOneByUserNameAndPassword(String username, String password);
    Boolean existsByUserName(String username);
}
