package Polygon.beans;

public class Polygon {
    protected int numSides;
    protected int lenSide;

    public Polygon(){
        this.numSides=4;
        this.lenSide=12;
    }
    public Polygon(int numSides, int lenSide){
        this.numSides= numSides;
        this.lenSide= lenSide;
    }

    public void setNumSides(int numSides){
        this.numSides=numSides;
    }
    public void setLenSide(int lenSide){
        this.lenSide= lenSide;
    }

    public int getNumSides(){
        return this.numSides;

    }
    public int getLenSide(){
        return this.lenSide;
    }
    public double getArea(){
        return (((double)(numSides*lenSide*((lenSide)/(2*(Math.tan(180/numSides)))))));
    }

}
