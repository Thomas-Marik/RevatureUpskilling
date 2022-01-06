package Employee.beans;

public class Employee {
    
    protected int id;
    protected String name;

    public Employee(){
        this.id = 0;
        this.name="Generic";
    }
    public Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public String toString(){
        return ("This employee's name is "+name+" and the id is "+id);
    }

}
