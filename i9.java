public class i9 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if((i==1&&j==3)||(i==3&&j==1)||(i==6&&(j==1||j==5))||(j==3&&(j>=3&&j!=2))){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
