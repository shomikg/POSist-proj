import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;
import java.util.ArrayList;
import java.util.List;
class Posist extends Node
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
	Pos gen=new Pos();
	gen.owner = "Genesis";
	gen.encrypt(gen.owner);
	gen.nodeId = "101";// Giving node a id so that it can be identified later on.
	Node<String> genesis = new Node<String>(gen.owner,null); // Task 1 DONE
	Pos ch1 = new Pos();
	ch1.owner = "Child 1";
	ch1.encrypt(ch1.owner);// TASK 4 encryption done
	ch1.nodeId = "111";// Giving child node a id so that it can be identified later on.
	Node<String> child1 = new Node<String>(ch1.owner,genesis);
	Pos ch2 = new Pos();
	ch2.owner = "Child 2";
	ch2.encrypt(ch2.owner);
	ch2.nodeId = "112";// Giving child node a id so that it can be identified later on.
	Node<String> child2 = new Node<String>(ch2.owner,genesis); // TASK 2 DONE
	Pos ch1_1 = new Pos();
	ch1_1.owner = "Child 1_1";
	ch1_1.encrypt(ch1_1.owner);
	ch1_1.nodeId = "111_1";// Giving child node a id so that it can be identified later on.
	Node<String> child1_1 = new Node<String>(ch1_1.owner,child1);/* TASK 3 DONE where I have added a child to the 1st child of Genesis Node */
	String decrypted = ch1.decrypt(ch1.owner); // TASK 4 decryption done
	//TASK 5 Verifying the owner of the node with the encryption key previous described as
	if(gen.hash() > 9); //Just using Java Object class's hashCode method to evaluate the has value of an object i.e. HashSet
	//TASK 6 to edit value of a particular NOde value
	gen.number = 114141.5423;
	//TASK 6 to edit value of a subtree root and similarly it can be done for others, by trickling down by making a func
	List<Node<String>> childrenNodes = genesis.getChildren();
	childrenNodes.get(0).data = "child1changed";
	//Task 7 to set parent
	child1.setParent(child2);
	}
}
public class Node<T> extends Pos{
    private List<Node<T>> children = new ArrayList<Node<T>>();
    private Node<T> parent = null;
    private T data = null;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> parent) {
        this.data = data;
        this.parent = parent;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setParent(Node<T> parent) {
        parent.addChild(this);
        this.parent = parent;
    }

    public void addChild(T data) {
        Node<T> child = new Node<T>(data);
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(Node<T> child) {
        child.setParent(this);
        this.children.add(child);
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean isLeaf() {
        return this.children.size == 0;
    }

    public void removeParent() {
        this.parent = null;
    }
}
class Pos
{
	public Pos()
	{
		Date timeStamp = new Date();
		String ownerId = "101010";
		ownerId = this.encrypt(ownerId);
		float number = 888.78f;
        String value = String.format ("%.2f", number);
        String owner = "Shomik";
        HashSet<String> h = new HashSet<String>();
        h.add(owner);
        h.add(value);
        h.add(ownerId);
        int nodeNumber=0;
        String nodeId="";
        String referenceNodeId = "";
        String genesisReferenceNodeId = "";
        HashSet<String> h2 = new HashSet<String>();
        DateFormat dateFormat = new SimpleDataFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(timeStamp);
        h2.add(strDate);
        h2.add(h);
        h2.add(Integer.toString(nodeNumber));
        h2.add(nodeId);
        h2.add(referenceNodeId);
        h2.add(childReferenceNodeId);
        h2.add(genesisReferenceNodeId);
	}
	public int hash()
	{
	return(this.h2.hashCode());
	}
	public void encrypt(String str)// ENcrypting Owner id, value, owner name to store in HashSet variable
	{
		for (int i=0;i<str.length();i++)  
        {  
            char ch=Character.toLowerCase(str.charAt(i));  
            switch (ch)  
            {  
                case 'a':  
                    Newstr=Newstr+"{";  
                    break;  
                case 'b':  
                    Newstr=Newstr+"}";  
                    break;  
                case 'c':  
                    Newstr=Newstr+"#";  
                    break;  
                case 'd':  
                    Newstr=Newstr+"~";  
                    break;  
                case 'e':  
                    Newstr=Newstr+"+";  
                    break;  
                case 'f':  
                    Newstr=Newstr+"-";  
                    break;  
                case 'g':  
                    Newstr=Newstr+"*";  
                    break;  
                case 'h':  
                    Newstr=Newstr+"@";  
                    break;  
                case 'i':  
                    Newstr=Newstr+"/";  
                    break;  
                case 'j':  
                    Newstr=Newstr+"\\";  
                    break;  
                case 'k':  
                    Newstr=Newstr+"?";  
                    break;  
                case 'l':  
                    Newstr=Newstr+"$";  
                    break;  
                case 'm':  
                    Newstr=Newstr+"!";  
                    break;  
                case 'n':  
                    Newstr=Newstr+"^";  
                    break;  
                case 'o':  
                    Newstr=Newstr+"(";  
                    break;  
                case 'p':  
                    Newstr=Newstr+")";  
                    break;  
                case 'q':  
                    Newstr=Newstr+"<";  
                    break;  
                case 'r':  
                    Newstr=Newstr+">";  
                    break;  
                case 's' :  
                    Newstr=Newstr+"=";  
                    break;  
                case 't':  
                    Newstr=Newstr+";";  
                    break;  
                case 'u':  
                    Newstr=Newstr+",";  
                    break;  
                case 'v' :  
                    Newstr=Newstr+"_";  
                    break;  
                case 'w':  
                    Newstr=Newstr+"[";  
                    break;  
                case 'x' :  
                    Newstr=Newstr+"]";  
                    break;  
                case 'y':  
                    Newstr=Newstr+":";  
                    break;  
                case 'z' :  
                    Newstr=Newstr+"\"";  
                    break;  
                case ' ' :  
                    Newstr=Newstr+" ";  
                    break;  
                case '.':  
                    Newstr=Newstr+'3';  
                    break;  
                case ',':  
                    Newstr=Newstr+"1";  
                    break;  
                case '(':  
                    Newstr=Newstr+'4';  
                    break;  
                case '\"':  
                    Newstr=Newstr+'5';  
                    break;  
                case ')' :  
                    Newstr=Newstr+"7";  
                    break;  
                case '?' :  
                    Newstr= Newstr+"2";  
                    break;  
                case '!':  
                    Newstr= Newstr+"8";  
                    break;  
                case '-' :  
                    Newstr= Newstr+"6";  
                    break;  
                case '%' :  
                    Newstr = Newstr+"9";  
                    break;  
                case '1':  
                    Newstr=Newstr+"r";  
                    break;  
                case '2':  
                    Newstr=Newstr+"k";  
                    break;  
                case '3':  
                    Newstr=Newstr+"b";  
                    break;  
                case '4':  
                    Newstr = Newstr+"e";  
                    break;  
                case '5':  
                    Newstr = Newstr+"q";  
                    break;  
                case '6':  
                    Newstr = Newstr+"h";  
                    break;  
                case '7':  
                    Newstr = Newstr+"u";  
                    break;  
                case '8' :  
                    Newstr= Newstr+"y";  
                    break;  
                case '9':  
                    Newstr = Newstr+"w";  
                    break;  
                case '0':  
                    Newstr = Newstr+"z";  
                    break;  
                 default:  
                    Newstr=Newstr+"0";  
                    break;  
            }  
        }   
	}
	public void decrypt(String str)// ENcrypting Owner id, value, owner name to store in HashSet variable
	{
		for (int i=0;i<str.length();i++)  
        {  
            char ch=Character.toLowerCase(str.charAt(i));  
            switch (ch)  
            {  
                case '{':  
                    Newstr=Newstr+"A";  
                    break;  
                case '}':  
                    Newstr=Newstr+"B";  
                    break;  
                case '#':  
                    Newstr=Newstr+"C";  
                    break;  
                case '~':  
                    Newstr=Newstr+"D";  
                    break;  
                case '+':  
                    Newstr=Newstr+"E";  
                    break;  
                case '-':  
                    Newstr=Newstr+"F";  
                    break;  
                case '*':  
                    Newstr=Newstr+"G";  
                    break;  
                case '@':  
                    Newstr=Newstr+"H";  
                    break;  
                case '/':  
                    Newstr=Newstr+"I";  
                    break;  
                case '\\':  
                    Newstr=Newstr+"J";  
                    break;  
                case '?':  
                    Newstr=Newstr+"K";  
                    break;  
                case '$':  
                    Newstr=Newstr+"L";  
                    break;  
                case '!':  
                    Newstr=Newstr+"M";  
                    break;  
                case '^':  
                    Newstr=Newstr+"N";  
                    break;  
                case '(':  
                    Newstr=Newstr+"O";  
                    break;  
                case ')':  
                    Newstr=Newstr+"P";  
                    break;  
                case '<':  
                    Newstr=Newstr+"Q";  
                    break;  
                case '>':  
                    Newstr=Newstr+"R";  
                    break;  
                case '=' :  
                    Newstr=Newstr+"S";  
                    break;  
                case ';':  
                    Newstr=Newstr+"T";  
                    break;  
                case ',':  
                    Newstr=Newstr+"U";  
                    break;  
                case '_' :  
                    Newstr=Newstr+"V";  
                    break;  
                case '[':  
                    Newstr=Newstr+"W";  
                    break;  
                case ']' :  
                    Newstr=Newstr+"X";  
                    break;  
                case ':':  
                    Newstr=Newstr+"Y";  
                    break;  
                case '\"' :  
                    Newstr=Newstr+"Z";  
                    break;       
                case '1':  
                    Newstr=Newstr+"r";  
                    break;  
                case '2':  
                    Newstr=Newstr+"k";  
                    break;  
                case '3':  
                    Newstr=Newstr+"b";  
                    break;  
                case '4':  
                    Newstr = Newstr+"e";  
                    break;  
                case '5':  
                    Newstr = Newstr+"q";  
                    break;  
                case '6':  
                    Newstr = Newstr+"h";  
                    break;  
                case '7':  
                    Newstr = Newstr+"u";  
                    break;  
                case '8' :  
                    Newstr= Newstr+"y";  
                    break;  
                case '9':  
                    Newstr = Newstr+"w";  
                    break;  
                case '0':  
                    Newstr = Newstr+"z";  
                    break;  
                 default:  
                    Newstr=Newstr+"0";  
                    break;  
            }  
        }   
	}
}
