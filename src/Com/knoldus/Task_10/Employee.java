package Com.knoldus.Task_10;

class Student{
    private String name;
    private int salary;
    private int id;

    public Student(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        return "Id: "+this.id+", Name: "+this.name+", Salary: "+this.salary;
    }

    @Override
    public int hashCode() {
        System.out.println("In hashcode");
        return this.getId();
    }

    @Override
    public boolean equals(Object obj) {
        Student e = null;
        if(obj instanceof Student){
            e = (Student) obj;
        }
        System.out.println("In equals");
        if(this.getId() == e.getId()){
            return true;
        } else {
            return false;
        }
    }
}


