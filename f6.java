public class f6 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=1;j<=6;j++){
                if((i==4&&i!=6)||(j==3&&j!=2)||(i==2&&j==6)||(i==1&&j==5)){
                    System.out.print("*");
                
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
