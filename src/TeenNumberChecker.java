public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    private static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 <= 19){
            return true;
        }
        if (num2 >= 13 && num2 <= 19){
            return true;
        }
        if (num3 >= 13 && num3 <= 19){
            return true;
        }else{
            return false;
        }

    }

    private static boolean isTeen(int num4){
        if (num4 >= 13 && num4 <= 19){
            return true;
        }else{
            return false;
        }
    }

}
