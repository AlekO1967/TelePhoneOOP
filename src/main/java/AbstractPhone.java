// АБСТРАКЦИЯ
public abstract class AbstractPhone { //общий абстрактный тип объектов — телефон
    private int year; // данный класс содержит в себе примитивный тип данных год создания

    public AbstractPhone(int year) { // общая характеристику телефона — год его создания
        this.year = year;
    }

    public abstract void call(int outNumber); // общий интерфейс — все телефоны способны посылать вызовы

    public abstract void ring(int inputNumber); // общий интерфейс — все телефоны способны принимать вызовы
}



