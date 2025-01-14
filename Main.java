import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("🌟 Welcome to the Java Pattern Drawing Program!");
        System.out.println("Choose a pattern type:");
        System.out.println("1. Right-angled Triangle");
        System.out.println("2. Square with Hollow Center");
        System.out.println("3. Diamond");
        System.out.println("4. Left-angled Triangle");
        System.out.println("5. Pyramid");
        System.out.println("6. Reverse Pyramid");
        System.out.println("7. Rectangle with Hollow Center");

        System.out.print("Enter the number corresponding to your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        int rows = 0;
        int width = 0;
        int height = 0;

        if (choice >= 1 && choice <= 6) {
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();
        } else if (choice == 7) {
            System.out.println("Enter the width of the rectangle: ");
            width = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the height of the rectangle: ");
            height = Integer.parseInt(scanner.nextLine());
        } else {
            System.out.println("❌ Invalid choice! Please restart the program.");
            return;
        }


        switch (choice) {

            case 1 -> {
                System.out.println("Right-angled Triangle");
                figure1(rows);
            }
            case 2 -> {
                System.out.println("Square with Hollow Center");
                figure2(rows);

            }
            case 3 ->{
                System.out.println(" Diamond");
                 diamond(rows);


            }
            case 4 ->{
                System.out.println("Left-angled Triangle");
                figure4(rows);
            }
            case 5 ->{
                System.out.println("Pyramid");
                 pyramid(rows);
            }
            case 6 ->{
                System.out.println(" Reverse pyramid" );
                reversePyramid(rows);
            }
            case 7 ->{
                System.out.println("Rectangle with Hollow Center");
               rectangle(height,width);
            }




        }
    }

       public static void figure1(int rows){
           for (int i = 1; i <= rows; i++) {

               for (int j = 1; j <= i; j++) {

                   System.out.print("*");
               }
               System.out.println(" ");

           }
       }

       public static  void figure2(int rows){
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < rows; j++)
               {

                   if (i == 0 || i == rows - 1 || j == 0|| j == rows - 1){

                       System.out.print("*" +" ");
                   }
                   else{
                       System.out.print(" "+" ");
                   }

               }
               System.out.println(" ");

           }
       }

    public static void diamond(int rows){
        int m, n;
        for (m = 1; m <= rows; m++) {

            for (n = 1; n <= rows - m; n++) {
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (m = rows - 1; m > 0; m--) {

            for (n = 1; n <= rows - m; n++) {
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void figure4(int rows){
        for (int i = rows; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.println("*");

            }
            System.out.println(" ");

        }
    }
    public  static  void pyramid(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
    public static void reversePyramid(int rows){
        for (int i = rows; i >=0 ; i--) {
            for (int j = 1; j <=rows-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i*2-1 ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
  public static void rectangle(int height,int width){

      for (int i = 1; i <=height ; i++) {
          for (int j = 1; j <=width ; j++) {

              if (i==1|| i==height|| j==1|| j==width){

                  System.out.print("*");
              }
              else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
  }

}