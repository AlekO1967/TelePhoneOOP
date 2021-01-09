//ПОЛИМОРФИЗМ_2
//Теперь опишем различные модели телефонов. Одна из первых моделей телефонов:

public class ThomasEdisonPhone extends AbstractPhone {
    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outNumber) {
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента, сэр");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вызываю номер");

    }
}
