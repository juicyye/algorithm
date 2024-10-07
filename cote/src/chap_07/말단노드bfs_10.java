package chap_07;

import java.util.LinkedList;
import java.util.Queue;

public class 말단노드bfs_10 {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.rt.rt = new Node(5);
        System.out.println(dfs(root));


    }

    public static int dfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int l = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                if (cur.lt == null && cur.rt == null) return l;
                if (cur.lt != null) queue.offer(cur.lt);
                if (cur.rt != null) queue.add(cur.rt);
            }
            l++;
        }
        return 0;

    }

    static class Node {
        int data;
        Node lt, rt;

        public Node(int val) {
            data = val;
            lt = rt = null;
        }

    }

}
