package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class User 
{
	public String firstName;
	public String lastName;
	public String email;
	public String password;
	private Map<String, User> users = new HashMap<String, User>();

	public User()
	{
	}

	public Collection<User> getUsers ()
	{
		return users.values();
	}

	public User(String firstName, String lastName, String email, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public User createUser(String firstName, String lastName, String email, String password) 
	{
		User user = new User (firstName, lastName, email, password);
		users.put(email, user);
		return user;
	}

	public User getUser(String email) 
	{
		return users.get(email);
	}

	public void deleteUser(String email) 
	{
		users.remove(email);
	}

	public String toString()
	{
		return toStringHelper(this).addValue(firstName)
				.addValue(lastName)
				.addValue(password)
				.addValue(email)                               
				.toString();
	}
}