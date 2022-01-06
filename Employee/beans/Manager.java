package Employee.beans;

public class Manager extends Employee{
    protected int qualified;
    
    public Manager(){
        super();
        this.qualified=15;
    }
    public Manager(int qualified){
        super();
        this.qualified=qualified;
    }
    public void setQualified(int qualified){
        this.qualified=qualified;
    }
    public int getQualified(){
        return this.qualified;
    }
    public String toString(){
        return ("This manager's name is "+this.name+" and their id is "+this.id+" and have "+this.qualified+" years of experience");
        
    }
}
