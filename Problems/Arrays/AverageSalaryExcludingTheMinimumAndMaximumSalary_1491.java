class AverageSalaryExcludingTheMinimumAndMaximumSalary_1491{
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};   
        System.out.println(average(salary));
    }
    public static double average(int[] salary){
        int min = salary[0];
        int max = salary[0];    
        int sum = salary[0];
        for(int i = 1; i < salary.length; i++){
            if(min > salary[i]){
                min = salary[i];
            }
            if(max < salary[i]){
                max = salary[i];
            }
            sum += salary[i];
        }
        double average = (double)(sum - min - max) / (salary.length - 2);
        return average;
    }
}