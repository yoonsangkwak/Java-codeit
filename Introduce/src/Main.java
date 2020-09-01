import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean inMainMenu = true;

        while (inMainMenu) {
            System.out.println("(I)ntro (C)ourses (E)xit");

            Scanner scanner = new Scanner(System.in);
            String key = scanner.next();

            if (key.equals("I") || key.equals("i")) {
                System.out.println("안녕하세요! 우리는 코드잇입니다.");
                System.out.println("함께 공부합시다!");
            } else if (key.equals("c") || key.equals("C")) {
                boolean inCourseMenu = true;
                while (inCourseMenu) {
                    System.out.println("코드잇 수업을 소개합니다.");
                    System.out.println("(P)ython (J)ava (i)OS (B)ack");

                    String lecture = scanner.next();

                    if (lecture.equals("P") || lecture.equals("p")) {
                        System.out.println("Python 언어를 통해 컴퓨터 사이언스의 기초를 배웁니다.");
                        System.out.println("강사: 강영훈");
                        System.out.println("추천 선수과목: 없음");
                    } else if (lecture.equals("J") || lecture.equals("j")) {
                        System.out.println("Java의 기본 문법과 객체지향적 프로그래밍을 배웁니다.");
                        System.out.println("강사: 김신의");
                        System.out.println("추천 선수과목: Python");
                    } else if (lecture.equals("I") || lecture.equals("i")) {
                        System.out.println("최신 Swift 언어를 통해 iOS 개발을 시작할 수 있습니다.");
                        System.out.println("강사: 성태호");
                        System.out.println("추천 선수과목: Python, Java");
                    } else if (lecture.equals("B") || lecture.equals("b")) {
                        inCourseMenu = false;
                    }
                }
            } else if (key.equals("E") || key.equals("e")) {
                System.out.println("안녕히 가세요.");
                inMainMenu = false;
            }
        }
    }
}
