/* User Class is used to manage users, create and store them within an array, each User has a unique username */


public class UserClass {
    /* Instantiate the Username and Password as a String*/
    private String username;
    private String password;

    /* Constructor for UserClass */

    public UserClass(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /* Method to return the username of the user */

    public String getUsername() {
        return this.username;
    }

    /* Method to return the password of the user */

    public String getPassword() {
        return this.password;
    }

    /* Method to return the user as a string */

    public String toString() {
        return this.username + " - " + this.password;
    }
}
