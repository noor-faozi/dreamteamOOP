import java.util.*;
class Student {
    
    private String fname;
    private String lname;
    private int id;
    private String address;
    private String course;
    private char gender;

    Student(){}
    Student(int id, String fname, String lname, char gender, String course, String address) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.course = course;
        this.address= address;
    }

    public void setName(String fname) {
        this.fname = fname;
    }
    public String getFName() {
        return fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getLname() {
        return lname;
    }
    public void setAddress(String address) {
        this.address= address;
    }
    public String getAddress() {
        return address;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
  
        return String.format("%12d%16s%15s%12c%12s%20s",id, fname, lname, gender, course, address);
    }
    public void addStudent(int id, String fname, String lname, char gender, String address, String course) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.address= address;
        this.course = course;
    }

}

public class Main {

    public static void main(String[] args) {

        List<Student> c = new ArrayList<Student>();
        int choice;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        

        do {
            System.out.println();
            System.out.println(" UNIVERSITY MALAYSIA SABAH ");
            System.out.println("STUDENT REGISTERATION SYSTEM");
            System.out.println("----------------------------");
            System.out.println("Choose Your Operataion (1-6)");
            System.out.println("1. ADD STUDENT"); 
            System.out.println("2. DELETE STUDENT"); //enter student id and then use delete method in Student class to delete
            System.out.println("3. UPDATE STUDENT"); //enter student id and then use edit method in Student class to edit
            System.out.println("4. SEARCH STUDENT"); //enter student id and then use print method in Student class to print
            System.out.println("5. VIEW ALL STUDENTS");
            System.out.println("6. EXIT");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Matric Id : ");
                    int matricId = scanner.nextInt();
                    System.out.print("Enter Student First Name : ");
                    String fname = scanner.next();
                    System.out.print("Enter Student Last Name : ");
                    String lname = scanner.next();
                    System.out.print("Enter Student Gender (F) or (M) : ");
                    char gender = scanner.next().charAt(0);
                    System.out.print("Enter Student Course : ");
                    String course = scanner.next();
                    scanner.nextLine();
                    System.out.print("Enter Student Address : ");
                    String address = scanner.nextLine();

                    c.add(new Student(matricId, fname, lname, gender, course, address));
                    break;
                case 2:
                    boolean found = false;
                    System.out.println("Enter Student Matric Id to Delete : ");
                    matricId = scanner.nextInt();
                    System.out.println("------------------------------------------------------------");
                    Iterator<Student> i = c.iterator();
                    while(i.hasNext()) {
                        Student s = i.next();
                        if(s.getId() == matricId) {
                            i.remove();
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Record Not Found");
                    }
                    else {
                        System.out.println("Record is Deleted Successfully");
                    }
                    System.out.println("------------------------------------------------------------");
                    break;
                case 3:
                    found = false;
                    System.out.println("Enter Student Matric Id to Update : ");
                    matricId = scanner.nextInt();
                    System.out.println("--------------------------------------------------------------------------------");
                    ListIterator<Student> li = c.listIterator();
                    while(li.hasNext()) {
                        Student s = li.next();
                        if(s.getId() == matricId) {
                            System.out.print("Enter New Student First Name : ");
                            fname = scanner1.next();
                            System.out.print("Enter Student Last Name : ");
                            lname = scanner.next();
                            System.out.print("Enter Student Gender (F) or (M): ");
                            gender = scanner2.next().charAt(0);
                            System.out.print("Enter New Course : ");
                            course = scanner3.next();
                            scanner.nextLine();
                            System.out.print("Enter New Address : ");
                            address = scanner.nextLine();
                            li.set(new Student(matricId, fname, lname, gender, course, address));
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Record Not Found");
                    }
                    else {
                        System.out.println("Record is Updated Successfully");
                    }
                    System.out.println("----------------------------------------------------------------------");
                    break;
                case 4:
                    found = false;
                    System.out.println("Enter Student Matric Id to Search : ");
                    matricId = scanner.nextInt();
                    System.out.println();
                    i = c.iterator();
                    while(i.hasNext()) {
                        Student s = i.next();
                        if(s.getId() == matricId) {
                            found = true;
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.printf("%12s%16s%15s%12s%12s%12s","MatricId", "First Name", "Last Name", "Gender", "Course", "Address");
                            System.out.println("\n--------------------------------------------------------------------------------");
                            System.out.println(s);
                        }
                    }

                    if(!found){
                        System.out.println("Record Not Found");
                    }
                    System.out.println("----------------------------------------------------------------------");
                    break;
                case 5:
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Student Regestration System - Display All Students");
                System.out.println("----------------------------------------------------------------------\n");
                System.out.printf("%12s%16s%15s%12s%12s%12s","MatricId", "First Name", "Last Name", "Gender", "Course", "Address");
                System.out.println("\n--------------------------------------------------------------------------------\n");
                    i = c.iterator();
                    while(i.hasNext()) {
                        Student s = i.next();
                        System.out.println(s);
                    }
                    System.out.println("---------------------------------------------------------------------------------");
                
                default:
                    break;
            }
        }while(choice!=6);
        
        scanner.close();
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }
}
