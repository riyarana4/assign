import java.util.*;
class SetCommon {
  public static void main(String[] args) {

    Scanner Scan= new Scanner (System.in);
    HashSet<Integer> hash1= new HashSet<Integer>();
    HashSet<Integer> hash2= new HashSet<Integer>();

hash1.add(10);
hash1.add(30);
hash1.add(50);
hash1.add(1611981309);
hash1.add(78);

hash2.add(200);
hash2.add(300);
hash2.add(1611981359);
hash2.add(60);
hash2.add(78);

hash1.retainAll(hash2);
    System.out.println(hash1);
  }
}