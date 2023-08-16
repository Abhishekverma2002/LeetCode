class Solution {
    public int findContentChildren(int[] greed, int[] size) {
         int n=0;
        Arrays.sort(greed);
        Arrays.sort(size);
        for(int i=0;i<greed.length;i++){
            for(int j=0;j<size.length;j++){
                if(size[j]>=greed[i]){
                    n++;
                    size[j]=0;
                    
                    break;
                    

                 
                }
            }

        }
        return n;
    }
}