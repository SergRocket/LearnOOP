public class ForAbstractMethod extends Abstraction {
    public static void main(String[] args){
       Abstraction Ab = new ForAbstractMethod();
       //викликаєм усі абстрактні методи
       Ab.animal();
       Ab.human();
       Ab.planet();
    }

    public void animal() {
        System.out.print("Cat");
    }

    public void human() {
        System.out.print("Sam");
    }

    public void planet() {
        System.out.print("Earth");
    }

}
