package ch01;

/**
 * Created by kirk on 2018. 6. 20..
 */
class Tv2 {
    // TV의 속성(멤버 변수)
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}

class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은 " + t1.channel +"입니다.");
        System.out.println("t1의 channel 값은 " + t2.channel +"입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel 값을 7로 변경하였습니다");

        System.out.println("t1의 channel 값은 " + t1.channel +"입니다.");
        System.out.println("t1의 channel 값은 " + t2.channel +"입니다.");
    }
}
