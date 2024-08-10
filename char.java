import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                int sum1=Character.getNumericValue(c);
                sum+=sum1;
            }
            }
        System.out.println(sum);
    }
}
