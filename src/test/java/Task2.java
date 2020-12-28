import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age =scanner.nextInt();

        int CatAge = 0;
        int DogAge = 0;
        //int NumanAge = 0;

        for ( int i = 0; i < age; i++){
            if (i == 0){
                CatAge = 15;
                DogAge = 15;
            }
            else if (i == 1){
                CatAge = CatAge + 9;
                DogAge = DogAge + 9;
            }
            else {
                CatAge = CatAge + 4;
                DogAge = DogAge + 5;
            }
        }
        System.out.println("HumanYears: " + age);
        System.out.println("CatYears: " + CatAge);
        System.out.println("DogYears: " + DogAge);




    }
}
