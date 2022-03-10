public class BitwiseOpr {
    public static void main(String[] args){
        int a=8, b=12, result;
        System.out.println("Bitwise AND");
        result= a & b ; //8
        System.out.println(result);
        System.out.println("Bitwise OR");
        result = a | b; //12
        System.out.println(result);
        System.out.println("Bitwise XOR");
        result = a ^ b; //4
        System.out.println(result);
        System.out.println("Left Shift");
        result = b << 1; // 24
        System.out.println(result);
        System.out.println("Right Shift");
        result = a >> 2; // 2
        System.out.println(result);
        System.out.println("Unsigned right shift");
        result = a >>> 2; //2
        System.out.println(result);
        System.out.println("Bitwise Complement");
        result = ~a; // -9
        System.out.println(result);

    }
}
