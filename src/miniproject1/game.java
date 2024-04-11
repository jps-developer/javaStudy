package miniproject1;
import java.util.Scanner;

public class game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사용자1 : 가위바위보 입력 : ");
        String user1 = scanner.nextLine();

        System.out.println("사용자2 : 가위바위보 입력 : ");
        String user2 = scanner.nextLine();


        if (user1.equals(user2)) {
            System.out.println("비겼습니다. 게임종료");
        } else {
            while (!user1.equals(user2)) {
                switch (user1) {
                    case "가위":
                        if (user2.equals("바위")) {
                            System.out.println("사용자 2 승리");
                            break;
                        } else if (user2.equals("보")) {
                            System.out.println("사용자 1 승리");
                            break;
                        }

                    case "바위":
                        if (user2.equals("보")) {
                            System.out.println("사용자 2 승리");
                            break;
                        } else if (user2.equals("가위")) {
                            System.out.println("사용자 1 승리");
                            break;
                        }

                    case "보":
                        if (user2.equals("가위")) {
                            System.out.println("사용자 2 승리");
                            break;
                        } else if (user2.equals("바위")) {
                            System.out.println("사용자 1 승리");
                            break;
                        }

                    default:
                        System.out.println("잘못 입력 하셨습니다. 다시 입력해주세요");
                        user2 = scanner.nextLine();
                }
                System.out.println("게임을 다시시작합니다. 사용자1 다시 입력해주세요");
                user1 = scanner.nextLine();
                System.out.println("게임을 다시시작합니다. 사용자2 다시 입력해주세요");
                user2 = scanner.nextLine();
                if(user1.equals(user2)){
                    System.out.println("비겼습니다. 게임종료");
                    return;
                }

            }
        }

    }
}
