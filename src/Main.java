import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Swappnumbers(3, 5);
        System.out.println(Vowels("ddidkfj"));
        // Vowels("arTiejenf");
        //OnlyOddNumbers(1,2,4);
        IspolindromeString("aruya");
        factoriel(3);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of list");
        int n= sc.nextInt();
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        if(isListOdd(arr)) {
            System.out.println("List contains only odd elements");
        }
        else{
            System.out.println("list doesn't contains only odd elements");
        }
        isPolidrome(2332);
    }





    public static void Swappnumbers(int a, int b) {
        System.out.println("before swapping" + a + b);
        int t = a;
        a = b;
        b = t;
        System.out.println("sfter swapping" + a + b);


    }

    public static boolean Vowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");

    }

    static boolean isListOdd(List<Integer> arr)
    {
        for(int i:arr){
            if(i%2==0)
                return false;
        }
        return true;
    }
    public static boolean isPolidrome(int num){
        int originalNumber=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;}
            if(originalNumber==rev){
                System.out.println(originalNumber+"eshte polindrome");
                return true;

            }
            else{
                System.out.println(originalNumber+"nuk eshte polidrome");
                return false;

        }
    }

    public static void IspolindromeString(String str){
        String originalstring=str;
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){

            rev=rev+str.charAt(i);
        }
        if(originalstring.equals(rev)){
            System.out.println(originalstring+ "ështe polindrome");
        }
        else{

            System.out.println(originalstring+"nuk ehste polindrome");
        }


        }


    public static long factoriel(long n){
        if(n==1)
            return 1;
      //  System.out.println("faktorieli eshte ");
        else return(n *factoriel(n-1));
    }

    }


