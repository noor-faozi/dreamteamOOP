class Student {
    
    private String name;
    private String id;
    private String address;
    private String course;
    private char gender;

    Student(){}
    Student(String name, String id, char gender, String address, String course) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.address= address;
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address= address;
    }
    public String getAddress() {
        return address;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
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

}
