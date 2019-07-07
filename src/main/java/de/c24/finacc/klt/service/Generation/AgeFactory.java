package de.c24.finacc.klt.service.Generation;

public class AgeFactory {
    public static AgeStrategy getAgeObject(int age){
        if(age<18)
            return new Young();
        if(age>67)
            return new Old();
        if(isNumberPrime(age))
            return new Prime();

        return new OK();
    }

    private static boolean isNumberPrime(int numberToCheck){
        // Sqrt is the shortest number that enough to check.
        // if A= B*B and A=C*D and C>B then D must be smaller than the B. so B=sqrt(A) is enought to check
        // as commonly used A/2is much longer than sqrt (foreaxample for 625, I test 25 number others tests 310 number)
        for (int i =2; i<=Math.sqrt(numberToCheck); i++){
            int remainder = numberToCheck%i;
            if(remainder == 0){
                return false;
            }
        }
        return true;
    }
}
