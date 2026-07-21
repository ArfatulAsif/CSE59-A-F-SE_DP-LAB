class User{
    private String username;
    private String email;
    
    public User(String username, String email){
        this.username = username;
        this.email = email;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getEmail(){
        return email;
    }
}

class EmailValidator{
    public static boolean isValidEmail(User user){
        if(user.getEmail() != null && user.getEmail().contains("@")){
            return true;
        }
        System.out.println("Invalid email format.");
        return false;
    }
}


class UserRepository {
    public static void saveToDatabase(User user){
        if(EmailValidator.isValidEmail(user)){
            System.out.println("Connecting to database...");
            System.out.println("Saving user " + user.getUsername() + " to the users table.");
            
        }
    }
}


public class Main{
    public static void main(String[] args){
        User user = new User("Alpha", "alpha@example.com");
        
        UserRepository.saveToDatabase(user);
    }
}


