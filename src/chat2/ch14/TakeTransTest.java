package src.chat2.ch14;

public class TakeTransTest {

    public static void main(String[] args) {
        Student studentP = new Student("Park", 5000);
        Student studentK = new Student("kim", 10000);

        Bus bus100 = new Bus(100);

        Subway subwayGreen = new Subway(2);


        studentP.takeBus(bus100);
        studentK.takeSubway(subwayGreen);

        studentP.showInfo();
        studentK.showInfo();

        bus100.showBusInfo();

        subwayGreen.showSubwayInfo();
    }

}

