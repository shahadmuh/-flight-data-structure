import java.io.*;
public class LinkedListPassenger {
private Node head;
public LinkedListPassenger(){
head=null;
}
public int countBusiness(){
Node current=head;
int c=1;
while(current.getNext()!=null){
current=current.getNext();
c++;}
return c;}

public void addPassenger(Passneger p){
Node n=new Node(p);
n.setNext(head);


head=n;}

public void readFromFile(String fileName){
try {
File f=new File(fileName);
FileInputStream FIS=new FileInputStream(f);
ObjectInputStream OIS=new ObjectInputStream(FIS);
try{
Passneger pas=(Passneger)OIS.readObject();
addPassenger(pas);}
catch (EOFException e){
OIS.close();}}
catch (ClassNotFoundException e){
System.out.println("The class is not found");}
catch (FileNotFoundException e){
System.out.println(e);}
catch (IOException e){
System.out.println(e);}

}}
