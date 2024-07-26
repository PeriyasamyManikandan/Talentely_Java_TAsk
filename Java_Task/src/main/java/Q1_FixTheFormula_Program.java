import java.util.Scanner;

public class FixTheFormula_Program1 {

    public static int fixTheFormula(String n) {
        StringBuilder d = new StringBuilder();
        StringBuilder o = new StringBuilder();
        
        for (char ch : n.toCharArray()) {
            if (Character.isDigit(ch)) {
                d.append(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                o.append(ch);
            }
        }
        
        char[] dA = d.toString().toCharArray();
        char[] oA = o.toString().toCharArray();
        
        int r = dA[0] - '0'; 
        
        for (int i = 0; i < oA.length; i++) {
            int nextDigit = dA[i + 1] - '0'; 
            
            switch (oA[i]) {
                case '+':
                    r += nextDigit;
                    break;
                case '-':
                    r -= nextDigit;
                    break;
                case '*':
                    r *= nextDigit;
                    break;
                case '/':
                    r /= nextDigit;
                    break;
            }
        }
        
        return r;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();

        
        System.out.println("The Final is: " + fixTheFormula(n));
        String n1 = in.nextLine();

        
        System.out.println("The Final is: " + fixTheFormula(n1));
        String n2 = in.nextLine();

        
        System.out.println("The Final is: " + fixTheFormula(n2));

        
    }
}
