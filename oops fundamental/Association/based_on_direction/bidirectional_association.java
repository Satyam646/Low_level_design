class developer{

    private team team;

    void setteam(team team){
        this.team = team;
    }
}


class team{

    private List<developer> developers = new ArrayList<>();
    void addDeveloper(developer developer){
        this.developers.add(developer);
        developer.setTeam(this);
    }

}