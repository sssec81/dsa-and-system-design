public  class Anagram {
    public static boolean isAnagram(String t, String s){
        if (t.length() != s.length()){
            return false;
        }
        int[] chars = new int[26];
        for(int i =0;i<t.length();i++){
            chars[s.charAt(i)-'a']++;
            chars[t.charAt(i)-'a']--;
        }
        for(int char2:chars){
            if(char2!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        boolean result = isAnagram("cat","bac");
        System.out.println(result);
    }
}