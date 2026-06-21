public class Main{
    public static void main(String[]args){
        UserValidator validator = new UserValidator();
       UserRepository repository = new UserRepository();

        
        System.out.println("--- Testing Valid User ---");
        
         User validUser = new User("Anik", "anik@example.com");
        if (validator.isValidEmail(validUser)) {
            repository.saveToDatabase(validUser);
        }
        System.out.println(); 
        System.out.println("--- Testing Invalid User ---");
        User invalidUser = new User("Rahat", "rahat-example.com");
        if (validator.isValidEmail(invalidUser)) {
            repository.saveToDatabase(invalidUser);
        } else {
            System.out.println("Database operation aborted due to validation failure.");
        }
    }
}

class User{
    private final String username;
    private final String email;
    public User(String username,String email)
    {
        this.username=username;
        this.email=email;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
}
class UserValidator{
    public boolean isValidEmail(User user){
        if(user!=null&& user.getEmail()!=null && user.getEmail().contains("@")){
            return true;
        }
        System.out.println("Invaild email format.");
        return false;
    }
}
class UserRepository{
    public void saveToDatabase(User user){
        System.out.println("Connecting to database...");
        System.out.println("Saving user" + user.getUsername()+"to the users table.");
        
    }
}

        


