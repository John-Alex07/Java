package Unit_1;

class P1_Task1_FirstJavaBasedCode {
    public static void main(String[] args) {
        final int gehu = 25;
        System.out.println(gehu);
        // double int = 58;
        // System.out.println(int);
        double pi = 3.14;
        System.out.println(pi);
        /*
         * int new() { System.out.println("NEW FUNCTION"); }
         */
       display();
        // ABC int = new ABC();
        ABC obj = new ABC();
        obj.prop = 52;
    }

    static void display() {
        System.out.println("KEYWORD");
    }

    /*
     * class int{ void function() { System.out.println("Error he be"); } }
     */
}

class ABC {
    int prop;
}
