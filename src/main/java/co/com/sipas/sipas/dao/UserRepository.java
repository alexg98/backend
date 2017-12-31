package co.com.sipas.sipas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.sipas.sipas.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@SuppressWarnings("unchecked")
	User save(User user);
}
