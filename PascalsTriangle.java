import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> genrow(int row){
        int ans = 1;
        List<Integer> l = new LinkedList<>();
        l.add(1);
        for(int i=1;i<row;i++){
            ans = ans *(row -i);
            ans = ans / i;
            l.add(ans);
        } 
        return l;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new LinkedList<>();
        for(int i=1;i<=numRows;i++){
            l.add(genrow(i));
        }
        return l;
    }
}
// To find a element in the pascals triangle the formula will be (n-1)C(r-1) where n is the row index and r is the column index
// To find a row in the pascals triangle we first one will be 1 and next elements will be multiplied by ans * ((row-1)/column) --> this will be most optimised than finding every element in brute force method
// To print the total Triangle we will be finding every row and print them