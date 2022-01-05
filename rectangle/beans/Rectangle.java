package rectangle.beans;

public class Rectangle {
    int length;
    int width;

    public Rectangle (){
        this.length = 12;
        this.width = 5;
    }
    public Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    public void setLength(int length){
        this.length= length;
    }
    public void setWidth(int width){
        this.width = width;

    }
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }

    public int calcPerimeter(){
        return ((2*this.length)+(2*this.width));

    }
    public int calcArea(){
        return (this.length * this.width);
    }
    public String toString(){
        return ("The rectangle with length :"+getWidth()+" and a length of : "+getLength()+". Has the Perimeter of : "+calcPerimeter()+" and area of :"+calcArea());
    }

}


