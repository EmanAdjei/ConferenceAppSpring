package pluralsight.model;

public class Speaker {

    private String firstname;
    private String lastName;
    private Double seedNum;

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

    public Double getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(Double seedNum) {
        this.seedNum = seedNum;
    }

    public String testMethod(String message){
        return message;
    }
}
