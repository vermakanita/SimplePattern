public class a1 {
    public static void main(String[] args) {
     for(int i= 0;i<=7;i++){
        for(int j= 0;j<=7;j++){
            if((i==0&&j==5)||(i==1&&(j==5||j==3))||(i==2&&(j==1||j==5))||(i==3&&(j==1||j==5))||(i==4&&(j==3||j==5||j==7))){
                System.out.print("0");
            }
            else{
                System.out.print(" ");
            }
        }System.out.println();
     }
        
    }
}
