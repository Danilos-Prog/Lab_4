public class ArraySum {
    Integer n;
    Integer m;

    public ArraySum(Integer n, Integer m) {
        if (n == null || m == null) throw new NullPointerException("n or m can't be equal null!");
        if (m > n) throw new IllegalArgumentException("m should be less than n or equal n!");
        this.n = n;
        this.m = m;
    }

    public Integer getSum(){
        return null;
    }
}
