package doggocompetition;

import java.util.ArrayList;

import static doggocompetition.Runner.Competition.position;

public class Runner {
    public static void main(String[] args) {
        System.out.println(position(10));
    }

    public static class Competition {

        public static ArrayList<String> position(int y) {

            ArrayList<String> arr = new ArrayList<>();

            for (int i = 1; i <= 100; i++) {
                int x = i - 1;

                arr.add(String.valueOf(i));
                String st = arr.get(x);

                if (st.endsWith("1")) {
                    arr.set(x, st + "st");
                } else if (st.endsWith("2")) {
                    arr.set(x, st + "nd");
                } else if (st.endsWith("3")) {
                    arr.set(x, st + "rd");
                } else {
                    arr.set(x, st + "th");
                }
            }

            if (y < 1 || y > 100) {
                return arr;
            }
            arr.remove(y - 1);
            return arr;
        }
    }
}