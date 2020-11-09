package Leetcode.OctoberChallenge.Week1;
import java.util.ArrayList;
import java.util.LinkedList;

public class RecentCalls {
    public static void main(String[] args) {
        RecentCounter calls=new RecentCounter();
        System.out.println(calls.ping(1));
        System.out.println(calls.ping(100));
        System.out.println(calls.ping(3001));
        System.out.println(calls.ping(3002));
    }
}
class RecentCounter {
   LinkedList<Integer> list;
    public RecentCounter() {
       list=new LinkedList<>();
    }
    public int ping(int t) {
        list.addLast(t);
        while(list.getFirst()<t-3000)
            list.removeFirst();
        return list.size();
    }
}
