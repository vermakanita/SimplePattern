public class G {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=8;j++){
                if(j==1||(i==1&&j<=7)||(i==3&&j>2)||(i==4&&(j==5||j==8))||(i==5&&(j<6||j==8)))
                System.out.print("*");
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
