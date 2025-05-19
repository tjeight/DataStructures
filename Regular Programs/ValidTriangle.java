public class ValidTriangle {

    public static void main(String[] args) {

        int[] num = { 3, 4, 5 };
        System.out.println(triangleType(num));
    }

    static String triangleType(int[] num) {

        if (num[0] + num[1] > num[2]) {
            if (num[1] + num[2] > num[0]) {
                if (num[0] + num[2] > num[1]) {

                    if (num[0] == num[1] && num[1] == num[2] && num[0] == num[2]) {
                        return "equilateral";
                    } else if ((num[0] == num[1]) || (num[0] == num[2]) || (num[2] == num[1])) {
                        return "isoceles";

                    } else {
                        return "scalene";
                    }

                } else {
                    return "None";
                }
            } else {
                return "None";
            }
        } else {
            return "None";
        }

    }
}