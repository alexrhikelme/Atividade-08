import java.util.*;

public class pessoas {
    public static void main(String[] args){
      LinkedList<String> nomes = new LinkedList <String>();
      nomes.add(new String("Alex"));
      nomes.add(new String("Simone"));
      nomes.add(new String("Sandro"));
      nomes.add(new String("Vitória"));
      nomes.add(new String("Rhikelme"));

      Iterator<String> it=nomes.iterator();
      while (it.hasNext()){
        System.out.println(it.next());
      }

    }
}