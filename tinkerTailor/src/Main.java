import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static int countOut(int N, int K){
        List<Integer> players = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            players.add(i);
        }

        Iterator<Integer> iterator = players.iterator();

        while(players.size() > 1){
            for(int j = 1; j <=  K; j++){
                if(!iterator.hasNext()){
                    iterator = players.iterator();
                }
                iterator.next();
                if(j == K){
                    iterator.remove();
                }
            }
        }
        return players.get(0);
    }

    public static void main(String[] args) {
        System.out.println("Hello, it's me...");
        System.out.println(countOut(5,3));
    }
}
