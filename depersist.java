import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class depersist {
    public static void main(String[] args) {
    try{
        FileInputStream fin=new FileInputStream("Output.txt");
        ObjectInputStream in=new ObjectInputStream(fin);
        emp e1=(emp) in.readObject();
        emp e2=(emp) in.readObject();
        emp e3=(emp) in.readObject();
        
        System.out.println(e1.id+" "+e1.name);
        System.out.println(e2.id+" "+e2.name);
        System.out.println(e3.id+" "+e3.name);

      
    }
    catch(Exception e){
        System.out.println("Exception");
    }
}
}
