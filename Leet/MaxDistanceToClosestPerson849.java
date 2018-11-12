package com.example.neohelloworld.Leet;

public class MaxDistanceToClosestPerson849 {

//    public int maxDistToClosest(int[] seats) {
//        List<Integer> list = new ArrayList<>();
//
//        for(int i=0;i<seats.length;i++){
//            if(seats[i]==1)
//                list.add(i);
//        }
//
//        if(list.size()==1){
//            if(list.get(0)>seats.length/2){
//                return 0;
//            } else{
//                return seats.length-1;
//            }
//        }
//
//        int left=0;
//        int right=0;
//        int maxLength=0;
//
//        for(int i=0;i<list.size()-1;i++){
//            int currentLength=Math.max(maxLength,list.get(i+1)-list.get(i));
//            if(currentLength>maxLength){
//                left=list.get(i);
//                right=list.get(i+1);
//                maxLength=currentLength;
//            }
//        }
//
//        return (right-left)/2;
//
//    }

    public int maxDistToClosest(int[] seats) {

        if(seats.length==1){
            return 0;
        }

        int zeroCount=0;
        int maxCount=0;
        int oneCount=0;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==0){
                if(oneCount!=0 && i+1==seats.length){
                    zeroCount=(zeroCount+1)*2-1;
                }
                else{
                    zeroCount++;
                }
            } else{
                if(oneCount==0){
                    oneCount++;
                    maxCount=Math.max(maxCount,zeroCount*2-1);
                    zeroCount=0;
                } else{
                    maxCount=Math.max(maxCount,zeroCount);
                    zeroCount=0;
                }

            }
        }

        maxCount=Math.max(maxCount,zeroCount);

        return (maxCount+1)/2;
    }


}
