public class Incapsulation {
    public static void main (String[] args){
        Incapsulation Inc = new Incapsulation();
        Inc.setCarBrand("Buick");
        Inc.setCarQuantity(50);
        Inc.getCarQuantity();
        Inc.getCarBrand();
        Inc.Info();

    }
    // для безпеки ми закриваєм доступ до полів класу щоб унеможливити небажані маніпуляції з даними
    private String CarBrand;
    private int CarQuantity;
    //для кожного з полів ми назначаєм гетери і сетери щоб відповідно отримувати і задавати значення
    public void setCarBrand(String carname){
        CarBrand=carname;
    }
    public String getCarBrand(){
       return CarBrand;
    }
    public void setCarQuantity(int carQuant){
        CarQuantity = carQuant;
    }
    public int getCarQuantity(){
        return CarQuantity;
    }
    //виводим задане значенння в консоль
    public void Info(){
        System.out.print(getCarBrand()+getCarQuantity());
    }

}
