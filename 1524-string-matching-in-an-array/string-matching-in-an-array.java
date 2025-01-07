class Solution {
    public List<String> stringMatching(String[] words) {
          LinkedList<String> reslist = new LinkedList<>();
          HashSet<String> set = new HashSet<>(); 
          for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
            if(i!=j && (words[j].contains(words[i]))){
               set.add(words[i]);
            }
        }
        }
        reslist.addAll(set);
        return reslist;

    }
}