
class Group{
   private String groupName;
   private List<User> users;
   public addUser(User user){
       this.users.add(user);
   }
   void getUsers(){
       return users;
   }
}

class User{
  private String userName;
  private List<Group> groups;
  void addGroup(Group group){
      this.groups.add(group);
  }
  public void getGroups(){
      return groups;
  }
  public void getUserName(){
      return userName;
  }
}