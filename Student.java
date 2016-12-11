
package student;

public class Student {
    public String name;
    public String surName;
    public boolean gender; //false - woman, true - man
    public int age;
    public int course; //на каком курсе учится
    public String university;
    public String faculty;
    public String group;
    
    public Student(String n, String s, boolean g, int a, int c, String u, String f, String gr) {
        name = n;
        surName = s;
        gender = g;
        age = a;
        course = c;
        university = u;
        faculty = f;
        group = gr;
    }
    
    public void anket () {
        System.out.println("Name: " + name + "\nSurname: " + surName + "\nCourse: " + course + "\nUniversity: " + university + "\nFaculty: " + faculty + "\nGroup: " + group + "\n");
    }   
    
    public void moreInfo () {
        String s; 
        if (gender == false) {
            s = "Woman";
        }
        else {
            s = "Man";
        }
        System.out.println("Gender: " + s + "\nAge: " + age + "\n");
    }
    
    public void eat() {
        System.out.println(name + ": I want to eat!\n");
    }
    
    public void cry(){
        System.out.println(name + ": I'm stupid, I'm not ready for this session.\n");
    }
    
    public void expulsion() {
        System.out.println("The Student was expelled.\n");
        course = 0;
        university = "none";
        faculty = "none";
        group = "none";
    }
    
    public void moreCrying() {
        System.out.print("Not student: Oh, no... NO, GOD, NO!");
    }
     
       public static void main(String[] args) {
       Student student = new Student("Leeroy", "Jenkins", true, 20, 3, "KFU", "ITIS", "11-404");
       student.anket();
       student.moreInfo();
       student.eat();
       student.cry();
       student.expulsion();
       student.anket();
       student.moreCrying();
    }
    
}
