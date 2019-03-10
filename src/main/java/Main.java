public class Main {
    public static void main(String[] args) {

        // How can we equate an Integer object to primitive int ??

        Integer i = new Integer(12);
        int j = i.intValue();

        System.out.println(i.compareTo(j));
        System.out.println(i.equals(j));

//        static Integer decode(String s)
        int a = Integer.decode("012");
        System.out.println(a);
        int b = Integer.decode("#A");
        System.out.println(b);
        int c = Integer.decode("10");
        System.out.println(c);

//        static int parseInt(String s)
        int d = Integer.parseInt("12");

//        static int parseInt(String s, int radix)
        System.out.println(Integer.parseInt("1010",2));
        System.out.println(Integer.parseInt("10",10));
        System.out.println(Integer.parseInt("12",8));
        System.out.println(Integer.parseInt("A",16));

//        String toString()
        Integer e = new Integer(135);
        String f = e.toString();

//        static String toString(int i)
        String g = Integer.toString(12);

//        static Integer valueOf(int i)
        int h = Integer.valueOf(12);
        System.out.println(h);

//        static Integer valueOf(String s)
        int k = Integer.valueOf("12");

//        static Integer valueOf(String s, int radix)
        System.out.println(Integer.valueOf("1010",2));
        System.out.println(Integer.valueOf("10",10));
        System.out.println(Integer.valueOf("12",8));
        System.out.println(Integer.valueOf("A",16));

        float l = Float.valueOf("1.20");
        System.out.println(l);
    }
}
