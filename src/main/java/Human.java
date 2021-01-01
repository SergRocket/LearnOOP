public class Human implements CarandHuman {
    public static void main(String[] args){
        Human H = new Human(32, "Serg");
        //створили обєкт з типом переміної яка не співпадає з класом, перемінна саН класа CarandHuman ссилається на люєет класу  Human
        CarandHuman caH = new Human(33, "Jesus");
        H.tellNameandAge();
        //отримуєм доступ до методів тільки інтерфейсу
        caH.showmainInfo();
        //H.showmainInfo();
    }
    //створюєм конструктор для параметрів обєкту, і через зіс задаєм значееня які прийшли в конструктор в аргументах
    public Human(int age, String name){
        this.name=name;
        this.age=age;

    }
    public int age;
    public String name;
    public String gendeR;
    public void tellNameandAge(){
        System.out.print("Im "+age+"years old and my name is "+name);
    }

    public void showmainInfo() {
        System.out.print("My age is "+age);
    }

}
