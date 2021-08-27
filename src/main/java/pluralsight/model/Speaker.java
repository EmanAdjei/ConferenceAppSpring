package pluralsight.model;

public class Speaker {

    private String firstname;
    private String lastName;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String testMethod(String message){
        return message;
    }
}
