import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("일회중");
        nameList.add("이회중");
        nameList.add("삼회중");
        nameList.add("사회중");
        nameList.add("오회중");
        nameList.add("육회중");
        nameList.add("칠회중");
        nameList.add("팔회중");

        nameList.remove(3);

        System.out.println(nameList.size());
        System.out.println(nameList);
    }
}
