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
}
