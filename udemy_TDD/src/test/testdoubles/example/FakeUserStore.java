package testdoubles.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Fake user store
 */
public class FakeUserStore implements UserStore{
	private ArrayList<User> users = new ArrayList<User>();
	
	@Override
	public void store(User user) {
		users.add(user);
	}

	@Override
	public List<User> findAll() {
		return users;
	}

}
