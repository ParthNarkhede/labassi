import java.util.*;

public class lab1 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    static class binOpr{

        public static Node insert(Node root,int dta){

            if(root==null){
                root=new Node(dta);
            }
            if(root.val>dta){
                root.left=insert(root.left,dta);
            }
            if(root.val<dta){
                root.right=insert(root.right,dta);
            }
            return root;

        }

        public static void inOr(Node root) {
            if (root == null) {
                return;
            }
            inOr(root.left);
            System.out.print(root.val+" ");
            inOr(root.right);
        }
        public static void preOr(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.val+" ");
            preOr(root.left);

            preOr(root.right);
        }
        public static void postOr(Node root) {
            if (root == null) {
                return;
            }
            postOr(root.left);

            postOr(root.right);
            System.out.print(root.val+" ");
        }

        public static boolean search(Node root,int v){
            if(root==null){
                return false;
            }
            if(root.val<v){
                return search(root.right,v);
            }
            else if(root.val==v){
                return true;
            }
            else if(root.val>v){
                return search(root.left,v);
            }
            return false;
        }

        }



    public static void main(String[]ars){
        Node root=null;
        binOpr t=new binOpr();
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();

        int[]arr=new int[n];

        for(int j=0;j<n;j++){
            int temp=sc.nextInt();
            arr[j]=temp;
        }
        for(int k=0;k<n;k++){
            root=t.insert(root,arr[k]);


        }

        t.inOr(root);
        t.preOr(root);
        t.postOr(root);

    }

}
