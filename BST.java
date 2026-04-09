
public class BST {
    static Nodee root = null;
    static Nodee insert(Nodee root, int key){
        if(root==null){
            Nodee nnode=new Nodee();
            nnode.info=key;
            nnode.left=nnode.right=null;
            root=nnode;
            return root;
        }else if(key<root.info){
            root.left=insert(root.left,key);
        }else{
            root.right=insert(root.right,key);
    }
        return root;
    }
    static void Preorder(Nodee root){
        if(root!=null){
            System.out.println(root.info);
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    static void Inorder(Nodee root){
        if(root!=null){
            Inorder(root.left);
            System.out.println(root.info);
            Inorder(root.right);          
        }
    }
     static void Postorder(Nodee root){
        if(root!=null){
            Postorder(root.left);
            Postorder(root.right);
            System.out.println(root.info);
        }
    }
    public static void main(String[] args) {
        root=insert(root,4);
        root=insert(root,2);
        root=insert(root,6);
        root=insert(root,10);
        System.out.println("Pre-Order");          
        Preorder(root);
                   System.out.println();
        System.out.println("In-Order");
        Inorder(root);
                   System.out.println();
        System.out.println("Post-Order");
        Postorder(root);
    }
}