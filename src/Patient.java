public class Patient {
    int id;
    String name;
    int severity;
    int age;

    public Patient(int id, String name, int severity, int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }


    //write a get method
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSeverity() {
        return severity;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return "Patient: " + name + " id: " + id + " severity: " + severity + " age: " + age;
    }
}
