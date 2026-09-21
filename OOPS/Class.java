
public class Class {

    public static void main(String[] args) {
        Student kumar = new Student();

        // kumar.num = 12;
        // kumar.name = "kumar";
        // kumar.marks = 90f;
        // System.out.println(kumar.num);
        // System.out.println(kumar.name);
        // System.out.println(kumar.marks);

        kumar.greetings();
    }
        // creation of class
        // for every students
      static class Student {
        // Collection of Properties and methods

            int num;
            String name;
            float marks;

           void greetings(){
            System.out.println("My Name is : "+this.name);
           }
            Student() {
                this.num = 12;
                this.name = "kumar";
                this.marks = 90f;
            }
        }
    }

