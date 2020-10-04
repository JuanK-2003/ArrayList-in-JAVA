package CLASES;

/**
 *
 * @author Juan_K
 */
public class ESTUDIANTE extends PERSONA {
    private double Note_P1;
    private double Note_P2;
    private double Note_P3;
    private String nameCourse;

    public ESTUDIANTE() {
    }
 
    public ESTUDIANTE(double Note_P1, double Note_P2, double Note_P3,String nameCourse, String ID, String FirstName, String LastName) {
        super(ID, FirstName, LastName);
        this.Note_P1 = Note_P1;
        this.Note_P2 = Note_P2;
        this.Note_P3 = Note_P3;
        this.nameCourse = nameCourse;
    }

    public double getNote_P1() {
        return Note_P1;
    }

    public void setNote_P1(double Note_P1) {
        this.Note_P1 = Note_P1;
    }

    public double getNote_P2() {
        return Note_P2;
    }

    public void setNote_P2(double Note_P2) {
        this.Note_P2 = Note_P2;
    }

    public double getNote_P3() {
        return Note_P3;
    }

    public void setNote_P3(double Note_P3) {
        this.Note_P3 = Note_P3;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }
    
}
