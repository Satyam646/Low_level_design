class Project{
    private List<Issue> issues = new ArrayList<>()
    void Issue(Issue issue){
        this.issues.add(issue);
        issue.setProject(this);
    }
}
class Issue{
    private Project project;
    void setProject(Project project){
        this.project = project;
    }
}