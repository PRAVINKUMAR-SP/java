class a{
    public static void main(String[] args) {
        // Diamond pattern - upper half
        for(int i=0;i<5;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<5-i;j++){
                System.out.print("* ");
            
            }
            System.out.println();
        }
        // Diamond pattern - lower half
        for(int i=1;i<5;i++){
            for(int k=1;k<5-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}