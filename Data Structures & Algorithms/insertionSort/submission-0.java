// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }

public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>>res=new ArrayList<>();
           for(int i=0;i< pairs.size();i++){
                   int j = i - 1; 
                   while (j >= 0 && 
                   pairs.get(j).key > pairs.get(j+1).key) {
                        Collections.swap(pairs, j, j + 1);
                         j--;
                     }
                   res.add(new ArrayList<>(pairs));
          

           }
           return res; 
    }
    
}
