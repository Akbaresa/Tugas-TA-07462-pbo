package model;

public class Admin {
    private final String admin = "admin";
    private final String id = "admin";

    public String getId() {
        return id;
    }

    public String getPass() {
        return admin;
    }

    public int loginAdmin(String id, String pass) {
        int status = 0;
        if (getId().equals(id) && getPass().equals(pass)) {
            status = 1;
        }
        return status;
    }

}