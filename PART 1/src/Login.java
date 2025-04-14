/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
class Login {
    public boolean checkUserName(String username){
        if(username.contains("_")&&username.length()<=5){
    return true;
    }
    else{
    return false;                    
    }   
    }
    public boolean verifyUsername(String verifyUsername, String username){
if(verifyUsername.matches(username)){
return true;
}else{
    return true;
}
    }
    
    public boolean checkPasswordComplexity(String password){
   if(password.length()<8){
return false;
}
if(!password.matches(".*[A-Z].*")){
    return false;
}
if(!password.matches(".*[0-9].*")){
    return false;
}
if(!password.matches(".*#$^@%+=()//?\\<>:;''].*")){
}return false;
}
    
public boolean verifyPassword(String verifypassword,String password){
if (password.equals(password)){
    return true;
}else{
    return true;
}

}
public boolean login(String username,String password,String verifyUsername, String verifyPassword){
if(verifyUsername.equals(username)&& verifyPassword.matches(password)){
System.out.println("Login successful, Welcome"+username+"!");
return true;
}else{
    System.out.println("Login unsuccessful, Please try again");
    return false;
}
}
}
