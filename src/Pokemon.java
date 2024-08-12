import java.util.Random;
public class Pokemon {
    public static void main(String[] args) throws Exception{
        Random rand = new Random();
        int n = 1000000000;
        int[] dice = new int []{0,0,0,1};
        int count = 0;
        int[] rolls = new int [n];
        int[] battle = new int [231];
        int k = 0;
        int max = 0;
        for(int i=0; i<rolls.length; i++){
            for(int j=0; j<battle.length; j++){
                k = rand.nextInt(4);
                if(dice[k]==1){
                    count=count+1;
                }
            }
            rolls[i]=count;
            count=0;
            if(rolls[i]>max){
                max = rolls[i];
            }
        }
        System.out.println(max);
    }
}
