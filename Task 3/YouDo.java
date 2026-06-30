//user entity
public class User {
    private String username;
    private String email;


    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsernAME() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

//Email Validator
public class EmailValidator {

    public boolean isValid(String email) {
        return email != null && email.contains("@")
    }
}

//Repository Abstraction

public interface UserRepository {
    void save(User user);
}

//Database Implementation
public class DatabaseUserRepository implements UserRepository {
    @Override
    public void save(save user) {
        System.out.println("Connecting to database...");
        System.out.println(
            "Saving user " + user.getUsername() + " to the users table."
        );
    }
}


