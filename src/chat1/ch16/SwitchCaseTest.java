package src.ch16;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day;
        switch (month) {
            case 1: day = 31;
                break;
            case 2: day = 28;
                break;
            case 3: day = 31;
                break;
            case 4: day = 30;
                break;
            case 5: day = 31;
                break;
            case 6: day = 30;
                break;
            case 7: day = 31;
                break;
            case 8: day = 31;
                break;
            case 9: day = 30;
                break;
            case 10: day = 31;
                break;
            case 11: day = 30;
                break;
            case 12: day = 31;
                break;
            default:
                System.out.println("존재하지 않는 달입니다.");
                day = -1;
        }
        System.out.println(month + "월은" + day + "일 입니다.");
    }
}
