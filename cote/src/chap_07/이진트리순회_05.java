package chap_07;

public class 이진트리순회_05 {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.lt = new Tree(2);
        tree.rt = new Tree(3);
        tree.lt.lt = new Tree(4);
        tree.lt.rt = new Tree(5);
        tree.rt.lt = new Tree(6);
        tree.rt.rt = new Tree(7);

        dfs(tree);

    }

    public static void dfs(Tree root) {
        if(root == null) return;
        else{
            System.out.print(root.data+ " ");
            dfs(root.lt);
            dfs(root.rt);
        }

    }
    static class Tree {
        int data;
        Tree lt, rt;

        public Tree(int data) {
            this.data = data;
            lt = rt = null;
        }
    }
}
