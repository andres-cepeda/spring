package co.edu.sena.springmvc2242753.repository;

import co.edu.sena.springmvc2242753.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
