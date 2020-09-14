public class Question1 {
    public static void main(String[] args) {
        int[] myInts = Utils.getIntArray();
        int sum = 0;
        for(int i =0; i < myInts.length; i++){
            if (myInts[i]%2 == 0){
                sum += myInts[i];
            }
        }
        System.out.println(sum);
        for(int i =0; i < myInts.length; i++){
            if (myInts[i]%3 == 0) {
                System.out.println("number divisible by 3: " + myInts[i]);
            }
        }
    }
}
