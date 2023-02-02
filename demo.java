class Demo{
    public static void main(String[] args) {
        int n1=1;
        int n2=2;
        int n3;
        int count=20;

        for(int i=1;i<=count;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}

