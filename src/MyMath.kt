import kotlin.math.abs

class MyMath {
    tailrec fun GCD(a: Int, b: Int): Int {
        if (a == 0 || b ==  0)
            return 0
        if (abs(a) == 1 || abs(b) == 1)
            return 1
        if (abs(a) == abs(b))
            return a
        else {
            if (abs(a) > abs(b)) return GCD( (abs(a)-abs(b)), abs(b))
            return GCD( (abs(b) - abs(a)), abs(a))
        }
    }
}