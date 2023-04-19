public class MainProgram {
    public static void main(String[] args) {

    }

    public static void  printSomeNumbers(){
        for(int i = 6; i<=23; i++){
            System.out.println(i);
        }
    }
    public static void printNumbers(int start, int end){
        for(int i = start; i<=end; i++){
            System.out.println(i);
        }
    }
    public static int sumUpNumbers(int start, int end){
        int j = 0;
        for(int i = start; i<=end; i++){
            j += i;
        }
        return j;
    }
    public static int powerOfTwo(int p){
        int result;
        if (p>= 0){
            result = p*p;
        }
        return p;
    }
    public static int sumUpPowerOfTwo(int n){
        int result = 0;
        for(int i = 0; i <= n;i++){
            result =+ i*i;
        }
        return result;
    }
}
