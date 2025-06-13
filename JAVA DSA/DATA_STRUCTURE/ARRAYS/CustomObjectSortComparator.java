import java.util.*;
class Employee 
{
    String name;
    int age;
    int salary;

    public Employee(String name,int age,int sal)
    {
        this.name=name;
        this.age=age;
        this.salary=sal;
    }

    @Override
    public String toString()
    {
        return this.name + " " + this.age + " " + this.salary;
    }
}

class CustomObjectSortComparator
{
    public static void main(String[] args) {
        Employee emp[]=new Employee[3];
        emp[0]= new Employee("Mayukh",22,65000 );
        emp[1]= new Employee("David",30,47000 );
        emp[2]= new Employee("Mathew",30,65000 );

        Arrays.sort(emp, new Comparator<Employee>(){
            
            @Override
            public int compare(Employee a , Employee b)
            {
                if(a.salary==b.salary)
                     return a.age-b.age;
                 else
                    return a.salary-b.salary;
            }
        });

        System.out.println(Arrays.toString(emp));

    }
}

