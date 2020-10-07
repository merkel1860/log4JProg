public final class PrimeCheck {

    public static boolean primeCheck(Integer p){
        int i; // for looping

        if(p <= 3){
            return (p > 1);
        }else if( p % 2 == 0 || p % 3 == 0){
            return false;
        }
        i= 5;
        while ((i * i) <= p){
            if(p % i == 0 || p % (i+2) == 0){
                return false;
            }
            i+=6;
        }
        return true;
    }
    /*
    function is_prime(n)
    if n ≤ 3 then
        return n > 1
    else if n mod 2 = 0 or n mod 3 = 0
        return false
    let i ← 5
    while i × i ≤ n do
        if n mod i = 0 or n mod (i + 2) = 0
            return false
        i ← i + 6

    return true

    * */
}
