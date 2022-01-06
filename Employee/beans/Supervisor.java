package Employee.beans;

public class Supervisor extends Employee{  

    protected int experience;
    
    public Supervisor(){
        super();
        this.experience=15;
    }
    public Supervisor(int experience){
        super();
        this.experience=experience;
    }
    public void setExperience(int experience){
        this.experience=experience;
    }
    public int getQualified(){
        return this.experience;
    }
    public String toString(){
        return ("This Supervisor's name is "+this.name+" and their id is "+this.id+" and have "+this.experience+" years of experience");
        
    }
}
