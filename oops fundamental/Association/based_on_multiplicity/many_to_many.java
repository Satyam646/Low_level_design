class Group{
   private List<User> users;
   public addUser(User user){
       this.users.add(user);
   }

}
class User{
  private List<Group> groups;
  void addGroup(Group group){
      this.groups.add(group);
  }
}