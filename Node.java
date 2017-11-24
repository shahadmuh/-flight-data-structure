public class Node {
private Node next;
private Passneger data;
public Node(){
next=null;

}

public Node(Passneger p){
data=p;
next=null;}

public Passneger getData(){
return data;}

public Node getNext(){
return next;}

public void setData(Passneger p){
data=p;}

public void setNext(Node n){
next=n;}
}