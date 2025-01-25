// //firn the factorial of prime numbers from 1to 10
// class PrimeThenFact{
// public static void main (String [] args){
//     int s=0;
//     int c=0;
//     for(int i=2;i<10;i++){
//         for(int j=2;j<10;j++){
//             if(i%j==0){
//                 c++;
//                 break;
//             }
//             else{

                
//                 System.out.println(s=s+i);
//             }

//         }
//     }

// }
// }





//find the factorial of prime numbers from 1 to 10
class PrimeThenFact {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Factorial of " + i + " is " + factorial(i));
            }
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}