//ПОЛИМОРФИЗМ_1
//Если мы посмотрим на все модели телефонов, то, несмотря на различия во внешнем облике и устройстве моделей,
// мы можем выделить у них некое общее поведение – все они могут принимать и совершать звонки
// и имеют достаточно понятный и простой набор кнопок управления. Применяя известный нам уже один из основных принципов ООП
// абстракцию в терминах программирования можно сказать, что объект телефон имеет один общий интерфейс.
// Поэтому пользователи телефонов могут вполне комфортно пользоваться различными моделями,
// используя одни и те же кнопки управления (механические или сенсорные), не вдаваясь в технические тонкости устройства.
// Так, вы постоянно пользуетесь сотовым телефоном, и без труда сможете совершить звонок с его стационарного собрата.
//
//Принцип в ООП, когда программа может использовать объекты с одинаковым интерфейсом без информации
// о внутреннем устройстве объекта, называется полиморфизмом.
//
//Давайте представим, что нам в программе нужно описать пользователя, который может пользоваться любыми моделями телефона,
// чтобы позвонить другому пользователю. Вот как можно это сделать:

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone){
// вот он полиморфизм - использование в коде абстактного типа AbstractPhone phone!

        phone.call(number);
    }
}
