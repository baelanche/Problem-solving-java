import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        HashMap<String, Node> tree = new HashMap<String, Node>();
        
        for (int i=0; i<enroll.length; i++) {
            Node node = new Node();
            node.money = 0;
            node.name = enroll[i];
            node.parent = referral[i];
            tree.put(enroll[i], node);
        }
        
        for (int i=0; i<seller.length; i++) {
            String nowNode = tree.get(seller[i]).name;
            double nowMoney = amount[i] * 100;
            while (!nowNode.equals("-")) {
                Node node = tree.get(nowNode);
                node.money += (int)Math.round(nowMoney * 0.9);
                nowMoney = (int)Math.round(nowMoney * 0.1);
                tree.put(nowNode, node);
                nowNode = tree.get(nowNode).parent;
            }
        }
        
        for (int i=0; i<enroll.length; i++) {
            Node node = tree.get(enroll[i]);
            answer[i] = node.money;
        }
        
        return answer;
    }
}
    
class Node {
    int money;
    String name;
    String parent;
}
