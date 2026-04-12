package model;

public class User {
    private int id;
    private String username;
    private int password;
    
    public User(int id, String username, int password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public int getPassword (){
        return this.password;
    }
    public void setPassword(int password){
        this.password = password;
    }
}
