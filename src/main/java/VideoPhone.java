//ПОЛИМОРФИЗМ_4
//И, наконец, крутой видеотелефон:

public class VideoPhone extends AbstractPhone {
    public VideoPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outNumber) {
        System.out.println("Подключаю видеоканал для абонента " + outNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("У вас входящий видеовызов..." + inputNumber);
    }
}
