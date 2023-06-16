class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double count=0.0;
        double sum=0.0;
        for(int i=1;i<salary.length-1;i++)
        {
             sum=sum+salary[i];
             count++;
        }
        return (sum/count);
        
    }
}

