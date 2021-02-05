package day42_Inheritance.Device;

public class deviceObjects {

    public static void main(String[] args) {
        TV tv = new TV("Samsung","LX32", 501);
        System.out.println(tv);
        tv.channelDown();
        tv.channelUp();
        tv.tunrOff();
        tv.turnOn();

        Phone phone = new Phone("iPhone", "12",700);
        phone.turnOn();
        phone.tunrOff();
        phone.call(143434334);
        phone.text(132324224);


    }

}
