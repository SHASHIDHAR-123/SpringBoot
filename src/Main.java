// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a=3;

        for(int i=2;i<=5;i++){
            if(a%i==0){
                System.out.println("this is prime");
                break;
            }else{
                System.out.println("not prime");
                break;
            }
        }

    }
}