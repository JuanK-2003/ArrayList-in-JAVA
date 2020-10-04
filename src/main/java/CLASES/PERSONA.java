package CLASES;

/**
 *
 * @author Juan_K
 */
public class PERSONA {
    protected String ID;
    protected String FirstName;
    protected String LastName;

    public PERSONA(){
        
    }
    public PERSONA(String ID, String FirstName, String LastName) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

}
