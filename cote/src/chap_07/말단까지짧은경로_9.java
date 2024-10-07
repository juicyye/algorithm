package chap_07;

public class 말단까지짧은경로_9 {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.rt.rt = new Node(5);

        System.out.println(dfs(0, root));


    }

    public static int dfs(int l, Node root) {
        if(root.lt == null && root.rt ==null) return l;
        else return Math.min(dfs(l + 1, root.lt), dfs(l + 1, root.rt));
    }

    static class Node{
        int data;
        Node lt,rt;

        public Node(int data) {
            this.data = data;
            lt = rt = null;
        }
    }


}
