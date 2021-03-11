import java.util.*;

public class Main{

public static void main(String[] args){



}


public static double findLargest(ArrayList<Double>  a){
  Collections.sort(a);
  Collections.reverse(a);
  return a.get(0);

 }

 public static int indexOfLargest(ArrayList<Double>  a){
   double number = Collections.max(a);
   double index = a.indexOf(number);
   int answer = (int) index;
   return answer;
 }

 public static int indexOfInt(ArrayList<Integer>  a, int target){
   int index = a.indexOf(target);
   return index;
 }

 public static boolean hasSameElements(ArrayList<Integer>  a, ArrayList<Integer>  b){
   Collections.sort(a);
   Collections.sort(b);
   for (int i = 0; i <a.size(); i++){
     if(a.get(i) != b.get(i)){
       return false;
     }
    }
    return true;
 }

public static void removeEvenLength(ArrayList<String>  a){
  for (int i = 0; i <a.size(); i++){
   String number = a.get(i);
    if(number.length() % 2 == 0){
      a.remove(i);
    }
  }
}

public static void RemoveDuplicates(ArrayList<Integer> a){
  Integer prev = null; 
  for (int i = a.size() - 1; i >= 0; i--){
    if(a.get(i) == prev){
      a.remove(i);
    }else{
      prev = a.get(i);
    }
  }

}

public static void swapPairs(ArrayList<String> a){
  int count = 1;
  int position = 0;
   for (int i = 0; i <a.size(); i++){
     if(count == 1){
       count = 2;
     }else{
       position = i - 1;
       Collections.swap(a, position, i);
       count = 1;
     }
   }
}

public static void doublelist(ArrayList<String> a){
  ArrayList<String> b = new ArrayList();
  for (int i = 0; i <a.size(); i++){
      b.add(a.get(i));
      b.add(a.get(i));
  }
  a.clear();
  for (int j = 0; j <b.size(); j++){
    a.add(b.get(j));
  }
}

public static void removeShorterStrings(ArrayList<String> a){
  ArrayList<String> b = new ArrayList();
  String prev = " ";
  String second = " ";
  int position = 0;
  int count = 1;
  int length1 = 0;
  int length2 = 0;
   for (int i = 0; i <a.size(); i++){
     if(count == 1){
       prev = a.get(i);
       length1 = prev.length();
       count = 2;
     }else{
       second = a.get(i);
       length2 = second.length();
       if(length2 > length1){
         b.add(second);
       }else if(length1 > length2){
         b.add(prev);
       }else{
         b.add(prev);
       }
       count = 1;
       position = i;
     }
  }
if(a.size() % 2 != 0){
  b.add(a.get(position + 1));
}
 a.clear();
  for (int j = 0; j <b.size(); j++){
    a.add(b.get(j));
  }
}

//replace all occurances of the character with an * in the string 
public static String censor(String s, char c){
//return s.replace(c, '*');
String str = " ";
for(int i =0; i< s.length(); i++){
  if(s.charAt(i) == c){
   str = str + "*";
  }else{
    str = str + s.charAt(i);
  }
}
return str;
}
}