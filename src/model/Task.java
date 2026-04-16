package model;

public class Task {
    private int id;
    private String title;
    private String description;
    private boolean completed;
    private int userId;

    public Task() {
    }

    public Task(int id, String title, String description, boolean completed, int userId){
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.userId = userId;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getUserId() {
        return userId;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
