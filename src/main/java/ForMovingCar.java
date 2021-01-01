public class ForMovingCar implements CarandHuman {
    public static void main (String[]args){
        ForMovingCar FMC = new ForMovingCar(150, "Mustang");
        CarandHuman CaH = new ForMovingCar(250, "Tesla");
        FMC.Informatione();
        //отримуєм доступ до методів тільки інтерфейсу
        CaH.showmainInfo();
        //FMC.showmainInfo();

    }
    //створюєм конструктор для параметрів обєкту, і через зіс задаєм значееня які прийшли в конструктор в аргументах
    public ForMovingCar(int CarPower, String CarName){
     this.CarPower=CarPower;
     this.CarName=CarName;
    }
    public int CarPower;
    public String CarName;
    public int id;
    public void Informatione (){
        System.out.print("Car power is "+CarPower+" and the car name is "+CarName);
    }

    public void showmainInfo() {
      System.out.print(CarName);
    }


}
