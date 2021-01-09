//ПОЛИМОРФИЗМ_3
//Обычный стационарный телефон:

public class Phone extends AbstractPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int outNumber) {
        System.out.println("Вызываю номер " + outNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Звонит телефон");
    }
}
