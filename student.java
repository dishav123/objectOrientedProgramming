public class Student{
    public static void main(String[] args){
        System.out.println("This is student class.")
        private String name;
        private int age;
    // Student(String name,int age){
    //     this.name=name;
    //     this.age=age;

    // }
    public String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    void setAge(int age){
        this.age=age;
    }
    }
}