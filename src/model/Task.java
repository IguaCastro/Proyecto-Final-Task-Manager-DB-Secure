package model;

public class Task {
    private int id;
    private String title;
    private boolean completed;
    private int userId;

    public Task(int id, String title, boolean completed, int userId){
        this.id = id;
        this.title = title;
        this.completed = completed;
        this.userId = userId;
    }
}
