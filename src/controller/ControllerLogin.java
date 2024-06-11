package controller;

public class ControllerLogin {

    private DB db = new DB();

    public boolean validateUser(String name){
        return db.findUser(name);
    }
}
