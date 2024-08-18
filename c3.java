public class c3 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if((i==1&&j>=3)||(i==2&&j==2)||(i==3&&j==1)||(i==4&&j==2)||(i==5&&j>=3)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
