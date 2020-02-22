package personContact;

public class Person {

    //create first name of string type
    private String firstName;
    //create last name of String type
    private String lastName;
    //create phone number of long type
    private Long mob;
    //create email
    private String emailId;
    //create constructor for initializing
    public Person(String firstName, String lastName, Long mob, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mob = mob;
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getMob() {
        return mob;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMob(Long mob) {
        this.mob = mob;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}


