public class hw {
    static String str;
    static fin myfin;
    public static void main(String args[])
    {
        System.out.println("hello world!");
        if (args.length == 0){
            System.out.println("hw.main");
        }

        mymeth("hello");



    }

    private static fin mymeth( String satr ){
        myfin = new sub_fin();

        myfin.mysecondmethod();
        return myfin;

    }

    static class fin {
        public final String mymethod (String  str) {
            System.out.println(str);
            return str;
        }
        public String mysecondmethod (){
            System.out.println("try to override me! ");
            return  null;
        }
    }

    static class sub_fin extends fin {
        @Override
        public String mysecondmethod (){
            System.out.println(str + mysecondmethod());
            return  null;
        }

    }
}
