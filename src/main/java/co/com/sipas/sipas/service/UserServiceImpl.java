package co.com.sipas.sipas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sipas.sipas.dao.UserRepository;
import co.com.sipas.sipas.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}
}
