package Book;

public class Teacher{
    private String name;
    private String age;
    private int subject;

    public Teacher(String name, String age, int subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }


    public String obtenerInfoTeacher(){
        return "Age: "+ this.name +"\n" + "Age: " +"\n" + "Subject: "+"\n" + this.subject;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }
}
