import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class PodRace {
    public static Set<Pod> race(double distance, Set<Pod> racers, double timeSlice, double timeLimit) {
        if (distance <= 0){
          throw new IllegalArguementException("Distance must be greater than 0");

        }

        var winners = new HashSet<Pod>();
        var time = 0;
        boolean win_flag = false;

        while (time <= timeLimit){
          for(var i:racers){
            var temp = i.distanceTraveled(0,time, 10);
            if(temp >= distance){
              winners.add(i)
              win_flag = true;
            }
          }
          time += timeSlice;
          if(win_flag = true){
            return winners;
          }
        }
        return winners;
    }
}
