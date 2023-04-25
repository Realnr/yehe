public class MainProgram {
    public static void main(String[] args) {
        starThing(5,5);
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
        int result = 0;
        for(int i = start; i<=end; i++){
            result += i;
        }
        return result;
    }
    public static int powerOfTwo(int p){
        int result = 1;
        if(p>= 0) {
            for (int i = 0; i < p; i++) {
                result *= 2;
            }
            return result;
        }else{
                throw new IllegalArgumentException("Number is Negative");
        }
    }
    public static int sumUpPowerOfTwo(int n){
        int result = 0;
        for(int i = 0; i <= n;i++){
           result += powerOfTwo(i);
        }
        return result;
    }
    public static void rectangleStars(int width, int height){
        for (int i = 0; i < height; i++){

            for (int j = 0; j < width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rectangleStarsSave(int width, int height){
        if(width >= 0 && height >= 0) {
            rectangleStars(width, height);
        }else{
            throw new IllegalArgumentException("Number negative lol skill issue");
        }
    }
    public static void triangleStars(int width){
        int s = 0;
        for (int i = 0; i < width; i++){
            s += 1;
            for (int j = 0; j < s; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void printEvenNumbers(int start, int end){
        for(int i = start; i<=end; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static int sumUpThree(int von, int bis){
        int sum = 0;
        for(int i = von; i<=bis; i++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void starThing(int width, int height){
        for (int i = 0; i < height; i++){

            for (int j = 0; j < width; j++){
                System.out.print("*");
                if(i%2 != 0){
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
