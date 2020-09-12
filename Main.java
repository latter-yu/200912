import java.util.*;

public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ArrayList<String>> list = new ArrayList<>();
        int n = sc.nextInt();
        int i = 0;
        for (; i < n; i++) {
            String str = sc.nextLine();
            String[] s = new String[str.length()];
            s = str.split(" ");
            list.add(new ArrayList<>(Arrays.asList(s)));
        }
        for (ArrayList s : list) {
s
        }
    }

    public static void main(String[] args) {
        int n = 3;
        String str1 = "man woman";
        String[] s1 = str1.split(" ");
        String str2 = "coder gamer painter";
        String[] s2 = str2.split(" ");
        String str3 = "phd";
        String[] s3 = str3.split(" ");
        System.out.println(s1[0] + "-" + s2[0] + "-" + s3[0]);
        System.out.println(s1[1] + "-" + s2[0] + "-" + s3[0]);
        System.out.println(s1[0] + "-" + s2[1] + "-" + s3[0]);
        System.out.println(s1[1] + "-" + s2[1] + "-" + s3[0]);
        System.out.println(s1[0] + "-" + s2[2] + "-" + s3[0]);
        System.out.println(s1[1] + "-" + s2[2] + "-" + s3[0]);
    }

}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            int len = str.length();
            if (len == 0 || len == 1) {
                System.out.println(0);
            }
            int count = 0;
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length - 2; i++) {
                if (chars[i] == chars[i + 1]) {
                    count++;
                }
                if (chars[i] == chars[i + 2]) {
                    count++;
                }
            }
            if (chars[chars.length - 1] == chars[chars.length - 2]) {
                count++;
            }
            System.out.println(count);
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] s = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            int t = sc.nextInt();
            s[i] = t;
        }
        int ret = packeg(n, k, s);
        System.out.println(ret);
    }
    public static int packeg(int n, int k, int[] s) {
        Map<Integer, Integer> map = new HashMap<>();
        if (k == 0 || n == 0) {
            return 0;
        }
        if (k == 0 && n == 1) {
            return 1;
        }
        int j = 0;
        int count = 0;
        for (; j < s.length; j++) {
            if (!map.containsKey(s[j])) {
                map.put(s[j], 1);
            } else {
                map.put(s[j], map.get(s[j]) + 1);
            }
        }
        if (k == 1 && map.containsKey(1)) {
            return 2;
        }
        if (k == 1 && map.containsKey(2)) {
            return 2;
        }
        for (j = 2; j < n; j++) {
            if (map.containsKey(2)) {
                count++;
                k--;
            }
        }
        return count + 1;
    }
}