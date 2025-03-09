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




// public class aaps1 {
//     public static void main(String args[]) {
//         int i=1;
//         do { 
//             while(i++<1);
//         } while(i++<=2);
//         System.out.print(i);
//     }
// }




// public class aaps1 {
//     public static void main(String[] args) {
//         int i = 0, j;

//         while (i < 3) {
//             j = 0;

//             while (j < 2) {
//                 if (i == 1 && j == 1) {
//                     break;
//                 }

//                 System.out.println("i = " + i + ", j = " + j);

//                 j++;
//             }

//             i++;
//         }
//     }
// }




public class aaps1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
            if (i == 3 || i == 6) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
