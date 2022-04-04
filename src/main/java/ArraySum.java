public class ArraySum {
    Integer n;

    public ArraySum(Integer n) {
        setN(n);
    }

    public void setN(Integer n) {
        if (n == null) throw new NullPointerException("n or m can't be equal null!");
        if (n <= 0) throw new IllegalArgumentException("n should be more than 0");
        this.n = n;
    }

    public Integer getN() {
        return n;
    }

    public Integer getSum(Integer m){
        if (m > n) throw new IllegalArgumentException("m should be less than n or equal n!");
        return null;
    }
}
