package co.com.sipas.sipas.service;

import java.util.List;

import co.com.sipas.sipas.model.User;

public interface UserService {

	/**
	 * 
	 * @param user
	 * @return
	 */
	User save(User user);
	/**
	 * Recupera la lista de usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();


}
