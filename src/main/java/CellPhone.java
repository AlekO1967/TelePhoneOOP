//НАСЛЕДОВАНИЕ_2
//Сотовые телефоны наследуют свойства беспроводного телефона, мы также добавили в этот класс реализацию методов call и ring:

public abstract class CellPhone extends WirelessPhone{
    public CellPhone(int year, int hour) {

        super(year, hour);
    }
    @Override
    public void call(int outNumber) {

        System.out.println("Вызываю номер " + outNumber);
    }

    @Override
    public void ring(int inputNumber) {

        System.out.println("Набираю номер " + inputNumber);
    }

}
