import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class emp implements Serializable{
    int id;
    String name;
    public emp(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class persist {
    public static void main(String[] args) {
    try{
        FileOutputStream fout=new FileOutputStream("Output.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        emp e1=new emp(101,"abc");
        emp e2=new emp(102,"xyz");
        emp e3=new emp(103,"pqr");
        out.writeObject(e1);
        out.writeObject(e2);
        out.writeObject(e3);
        out.close();
    }
    catch(Exception e){
        System.out.println("Exception");
    }
}
}
