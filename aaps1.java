// class aaps1 {
//     public static void main(String[] args) {
//         int start=10, end=30;
//         for(int i=start; i<=end; i++) {
//             if(isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
//     static boolean isPrime(int n) {
//         if(n<2) return false;
//         for(int i=2; i*i<=n; i++) {
//             if(n%i == 0) return false;
//         }
//         return true;
//     }
// }



// public class aaps1 {
//     public static void main(String[] args) {
//         int x = 5;
//         while (x++ <= 7) {
            
//         }
//         System.out.println(x);
//     }
// }



// #include <stdio.h> 
// void main() 
// { 
// int i=1; 
// do{ 
// while(i++<1); 
// }while(i++<=2); 
// printf("%d",i); 
// }

public class aaps1 {
    public static void main(String args[]) {
        int i=1;
        do { 
            while(i++<1);
        } while(i++<=2);
        System.out.print(i);
    }
}