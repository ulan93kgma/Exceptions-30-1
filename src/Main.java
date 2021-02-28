
    import java.util.ArrayList;
    public class Main {
        public static void main(String[] args) {
            double P = 3.14;
            int p = (int) P;
            ArrayList<Integer> r = new ArrayList<Integer>();
            r.add(3);
            r.add(22);
            r.add(11);
            r.add(-5);
            r.add(-6);
            int V;
            int b =2;
            int h = 11;
            try {
                for (int i : r) {
                    area(h, i);

                    V = (int) (Math.pow(i, b) * h * P);
                    System.out.println(V);
                    if (i < 0) {

                        throw new IllegalArgumentException();
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException();
            }
        }
        public static void area(int h, int i){
            if(i < 0) {
                System.out.println(i + " " + h);
            }
        }
    }



