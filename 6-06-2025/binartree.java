public class Main{
    public static void main(String[] args){
        Tree t = new Tree(new int[]{1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1});
    }
}
class Node{
    int data;
    Node left;
    Node right;
      Node(int data){
        this.data=data;
        this.left=null;
        this.right = null;
      }
}
class Tree{
    Node root;
    int index = -1;
    Tree(int[] nodes){
        this.root= buildTreeusingArray(nodes);
        System.out.println(index);
    }
    public Node buildTreeusingArray(int[] nodes){
        index ++;
        if(index >=nodes.length){
            return null;
        }
        if(nodes[index]== -1)
        return null;
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTreeusingArray(nodes);
        newNode.right = buildTreeusingArray(nodes);
        return newNode;
    }
}
