class Solution {
    /*
    Sorting: 
    
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length)
            return false;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
               { return false;}
        }
        return true;

    }*/
    public boolean isAnagram(String s, String t) {
    if(s.length()!=t.length())
        return false;
    int[] arr = new int[26];
    Arrays.fill(arr,0);
    for(int i=0;i<s.length();i++){
        int index = s.charAt(i) - 'a';
        arr[index]+=1;
    }
    for(int i=0;i<t.length();i++){
        int index = t.charAt(i) - 'a';
        arr[index]-=1;
    }
    for(int i =0;i<arr.length;i++){
        if(arr[i]!=0)
            return false;
    }
    return true;
    }
}
