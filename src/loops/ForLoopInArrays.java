package loops;

public class ForLoopInArrays {
    public static void main(String args[]){
        double[] numList={121.9,200.7,300.8,498.7};
        for(int i=0; i<numList.length; i++){
            System.out.println(numList[i]);
        }
        //sum
    double sum=0;
        for(int i=0; i<numList.length;i++){
            sum+=numList[i];
        }
        System.out.println(sum);

        //largest element
        double max=numList[0];
        for(int i=1; i<numList.length;i++){
            if(numList[i]>max){
                max=numList[i];
            }
        }
        System.out.println(max);
    }
}
