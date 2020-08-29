

package com.company.oops;
import java.util.ArrayList;
import java.util.List;
class Parent {
    String Name,occupation;
    public Parent(){

    }
    public Parent(String name ,String Occupation){
        Name=name;
        occupation=Occupation;

    }

    private void printParent() {
        System.out.println("Parent "+Name+occupation);
    }


}

class Child extends Parent {
    String name;
    Parent P;
    int registerNumber;
    public Child(String name ,int registerNumber,String Occupation,String names){
        this.name=name;
        this.registerNumber=registerNumber;
        initializeParent(names,Occupation);
    }

    private void initializeParent(String name,String Occupation) {
        P=new Parent(name,Occupation);
    }
    public String toString(){
        String ParentName=P.Name;
        String ParentOccupation=P.occupation;
        return (ParentName+" "+ParentOccupation+" "+name+" "+registerNumber+"");
    }
    public void printChild(){

    }



}
public class OopsProgram  {
    public static void main(String[] args) {
        List<Child> childList = new ArrayList<>();
        childList.add(new Child("Abc",123,"Business","Xyz"));
        childList.add(new Child("Karthi",456,"Marketing","Abc"));
        childList.add(new Child("Reshma",789,"Provision","Gggg"));

    }
}
