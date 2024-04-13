import java.time.LocalDateTime;

abstract class Person {
    private String userName;
    private String password;
    private String email;
    private LocalDateTime lastSeen;
    private String postalAdress;
    private String fullName;
    private String phoneNumber;
    
    public Person(String userName, String password, String email, LocalDateTime lastSeen, String postalAdress, String fullName, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.lastSeen = lastSeen;
        this.postalAdress = postalAdress;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(LocalDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getPostalAdress() {
        return postalAdress;
    }

    public void setPostalAdress(String postalAdress) {
        this.postalAdress = postalAdress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}