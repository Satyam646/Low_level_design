///befory applying dry principle
// in support service class
public boolean isEmailValid(Sring email){
    return email.contains("@") && email.contains(".");
}

//in user service class
public boolean isEmailValid(Sring email){
    return email.contains("@") && email.contains(".");
}

//in admin service class
public boolean isEmailValid(Sring email){
    return email.contains("@") && email.contains(".");
}

//After applying dry principle
class EmailValidator{
    public boolean isEmailValid(String email){
        return email.contains("@") && email.contains(".");
    }
}

//support service class
EmailValidator emailValidator = new EmailValidator();
if(emailValidator.isEmailValid(email)){
    //code
}

//In admin service class
EmailValidator emailValidator = new EmailValidator();
if(emailValidator.isEmailValid(email)){
    //code
}

//In user service class
EmailValidator emailValidator = new EmailValidator();
if(emailValidator.isEmailValid(email)){
    //code
}
//We must care about 3times rule before applying dry principle, if we have to change the logic of email validation then we have to change it in 3 places which is not good. After applying dry principle we have to change it in only one place which is good.
