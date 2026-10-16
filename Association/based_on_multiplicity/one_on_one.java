class User{
    private Profile = profile;
    void setProfile(Profile profile){
        this.profile = profile;
    }
}

class Profile{
    private User user;
    void setUser(User user){
        this.user = user;
    }   
}