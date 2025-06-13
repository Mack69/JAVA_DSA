import java.util.*;
class Student implements Comparable<Student>
{
    String name;
    int age;
    int marks;

    public Student(String name,int age,int marks)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    
    @Override
    public int compareTo(Student student)
    {
        if(age==student.age)
            return student.marks-marks;
        else
            return age-student.age;
    }

    @Override
    public String toString()
    {
        return this.name + " " + this.age + " " + this.marks; 
    }
}

class CustomObjectSort {
    public static void main(String args[])
    {
        Student stud[]=new Student[4];
        stud[0]=new Student("Mack",22,100);
        stud[1]=new Student("John",42,90);
        stud[2]=new Student("Ram",30,85);
        stud[3]=new Student("Sam",22,80);
        
        Arrays.sort(stud);
        System.out.println(Arrays.toString(stud));
    }
}