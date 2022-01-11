
import java.util.ArrayList;
import java.util.List;

class PythagoreanTriplet {

    private int a, b, c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triplet makeTripletsList() {
        return new Triplet();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + a;
        result = prime * result + b;
        result = prime * result + c;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        // if (getClass() != obj.getClass())
        // return false;
        PythagoreanTriplet other = (PythagoreanTriplet) obj;
        if (a != other.a)
            return false;
        if (b != other.b)
            return false;
        if (c != other.c)
            return false;
        return true;
    }

    public static class Triplet {

        private final List<PythagoreanTriplet> allTriplets = new ArrayList<>();
        private final List<PythagoreanTriplet> finalList = new ArrayList<>();

        public Triplet withFactorsLessThanOrEqualTo(int num) {
            for (int i = 1; i <= num / 3; i++) {
                for (int j = i + 1; j <= num / 2; j++) {
                    int k = num - i - j;
                    if (i * i + j * j == k * k) {
                        allTriplets.add(new PythagoreanTriplet(i, j, k));
                    }
                }
            }
            return this;
        }

        public Triplet thatSumTo(int num) {
            for (PythagoreanTriplet x : allTriplets) {
                if (x.a + x.b + x.c == num) {
                    finalList.add(x);
                }
            }
            return this;
        }

        public List<PythagoreanTriplet> build() {
            return finalList;
        }

    }

}