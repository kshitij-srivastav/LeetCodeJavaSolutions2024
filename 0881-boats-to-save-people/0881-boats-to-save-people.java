class Solution {
    public int numRescueBoats(int[] people, int limit) {
           //count the no. of boats are needed.
        int count = 0;

        //sort the array in ascending order (2,5,6,7)
        Arrays.sort(people); 

        //If array is empty
        if (people == null){
            return 0;
        }
        //Initialise 2 ponters (i.e i start from 0 and j starts from ending of array.)
        int i = 0;
        int j = people.length - 1;

        //Continue in loop until i(starting of array) is less or    equal to j(ending of array)
        while(i <= j){
            //check whether 2 peoples have weight equal or less than given limit 
            if(people[i] + people[j] <= limit){
                i++;//increase the front pointer
            }
            j--;// decrement rare(last) pointer

            //Increase the no. of boats which are needed
            count++;
        }
        return count;
    }
}