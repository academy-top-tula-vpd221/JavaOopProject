package com.company;

import com.country.*;
import com.shape.*;
import com.controls.*;
import com.store.*;

import static java.lang.System.*;

enum Ways{
    Up,
    Down,
    Left,
    Right
}

enum Colors{
    Red("#FF0000"),
    Blue("#0000FF"),
    Green("#00FF00");

    private String code;
    Colors(String value){
        this.code = value;
    }

    public String GetCode(){ return code; }
}

enum Operations{
    Sum{ public int run(int a, int b){ return a + b; }},
    Sub{ public int run(int a, int b){ return a - b; }},
    Mult{ public int run(int a, int b){ return a * b; }};

    public abstract int run(int a, int b);
}

public class Main {

    public static void main(String[] args) {
        /*Employee bob = new Employee();
        bob.name = "Bobby";
        bob.age = 25;

        bob.Info();

        var p = bob.passport;

        Employee.GlobalId = 100;

        Company yandex = new Company();
        yandex.title = "Yandex";

        Country russia = new Country();
        russia.title = "Russia";*/

        /*Shape shape = new Shape(10, 20);
        Rectangle rect = new Rectangle(5, 7, 12, 16);
        shape.Info();
        rect = (Rectangle) shape;
        rect.Info();
        //shape = rect;
        //shape.Info();*/

        /*Car car = new Car();
        car.Info();
        car.RealImpl();

        IMovable movable = car;
        movable.RealImpl();
        ((Car)movable).Info();

        IMovable.StaticImpl();

        Car car2 = new Car();
        car2 = (Car)ReMovable(car);*/


        /*WinApp app = new WinApp();
        app.Run();

        //Ways way = Ways.Down;
        for(var t : Ways.values())
            out.print(t.ordinal() + " " + t + " ");
        out.println();
        var color = Colors.Red.GetCode();

        out.println(Operations.Sum.run(10, 20));
        out.println(Operations.Mult.run(10, 20));

        Object obj = new Object();*/

        Store<Integer, String> storeInt = new Store<Integer, String>();
        storeInt.SetValue(100);
    }
    static IMovable ReMovable(IMovable moveble){
        Train train = new Train();
        return train;
    }
}

class Employee
{
    String name;
    int age;
    static int GlobalId;
    Passport passport;

    {
        name = "";
        passport.series = "XI89";
        passport.number = "123234";
    }
    static
    {
        GlobalId = 100;
    }

    Employee()
    {
        name = "";
        age = 0;
    }

    Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void Info()
    {
        out.printf("Name: %s, Age: %d\n", name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", passport=" + passport +
                '}';
    }

    class Passport {
        String series;
        String number;
    }
}

interface IMovable
{
    int MaxSpeed = 250;
    void Move();
    default void RealImpl(){
        out.println("real implements method");
    }

    static void StaticImpl()
    {
        out.println("static implements method");
    }
}

interface ISuperMovable extends IMovable
{

}

class Car implements IMovable
{
    float volume;

    @Override
    public void Move() {
        out.println("car is drive");
    }

    void Info(){

    }
}

class Train implements IMovable{
    int counts;

    @Override
    public void Move() {
        out.println("train is drive");
    }
}