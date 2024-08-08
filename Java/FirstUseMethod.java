
    class FirstUseMethod{
        public static void main(String[]args){
            Sum a = new Sum(5);
            System.out.println(a.i);
        }
    }

    class Sum{
        int i;
        Sum(int i){
            this.i = i + 10;
        }
    }
