package abstraction;
 abstract class AFeature{
    String username;
    String password;
    String gender;
    String role;
    void output(){
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
        System.out.println("Gender : "+gender);
        System.out.println("Role : "+role);
    }
    abstract boolean login(String username, String password);
    abstract  void  logout();
    abstract void signup();
}
 class FeatureOne extends AFeature{
     boolean login (String username, String password){
         System.out.println("Login in Feature one");
         return false;
     }

     @Override
     void logout() {

     }

     void login(){
         System.out.println("Login in Feature one");

     }
     void  signup(){
         System.out.println("Signup in Feature one");

     }
}
 class  FeatureTow extends AFeature{
    boolean login (String username, String password){
        System.out.println("Login in Feature one");
        return false;
    }

     @Override
     void logout() {

     }

     void login(){
        System.out.println("Login in Feature one");
    }
    void  signup(){
        System.out.println("Signup in Feature two");
    }
}
public class Main {
    public static void main(String[] args) {
        FeatureOne obj1 = new FeatureOne();
        FeatureTow obj2 = new FeatureTow();
        obj1.login();
        obj2.logout();
    }
}
