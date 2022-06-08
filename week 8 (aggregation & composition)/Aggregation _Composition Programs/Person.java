public class Person { // 'composite' class
    private double salary;
    private String name;
    private Birthday bday;//declaration of object form 'part' class

    public Person(int y,int m,int d,String name){
        bday=new Birthday(y, m, d);//object 'part' class is created in the constructor of 'commposite' class
        this.name=name;
    }


    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Birthday getBday() {
        return bday;
    }


}