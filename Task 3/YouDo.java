public class user {
    private string username;
    private string email;
    
    public user (string user name,email){
        this.username=username;
    }
    public string getusername(){
        return email;
    }
    
    public class Uservalidertor {
        public boolean is valid email(string Email){
            if (email ! = null && email.contains("@")){
                return true ;
            }
        system.out.println ("Invalid email format.");
        return false ;
        }
    }
    public class UserRepository{
        public void save (user save){
            system.out.println("connecting to database...");
            system.out.println("saving user"+ user.getusename()+"to the users table.");
            
        }
    }
    public class main {
        public static void main (string[]arg)|{
            user user =new user ("Fariha","mahmudafariha1209@gmail.com");
            
            userValidator validator = new uservalidator ();
            UserRepositor = new userRepository ();
        
        if(validator.isValidEmail (user.getEmail())) {
            repository.save(user);
        }
        }
    }
