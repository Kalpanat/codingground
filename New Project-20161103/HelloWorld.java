public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        for (int i = 0; i < 4; i++)
            {
                for (int j = 0; j < 4-i; j++)
                    System.out.print(" ");
                for (int k = 0; k < (2*i+1); k++)
                    System.out.print("*");
                
                System.out.println("");
                
            }
     }
}
