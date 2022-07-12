public class Exercise6_20 {
//    static int[] shuffle(int[] arr){
//        if(arr==null||arr.length==0) return arr;
//        int[] result= new int[arr.length];
//        for (int i=0; i<arr.length; i++) {
//            result[i]=(int)(Math.random()*arr.length);
//        }
//        return result;
//    }
    public static int[] shuffle(int[] arr) {
        if(arr==null || arr.length==0)
            return arr;
        for(int i=0; i< arr.length;i++) {
            int j = (int)(Math.random()*arr.length);
    // arr[i] arr[j] . 와 의 값을 서로 바꾼다
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        // 배열을 문자열로...
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}