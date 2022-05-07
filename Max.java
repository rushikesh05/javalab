class Max{
    public static void main(String[] args){
     int array[] = {10,43,12,60,19,120,14,100,900,70};
     int max = 0;
     for(int i=0;i<array.length;i++){
        if(max <= array[i]){
        max = array[i];
    }
    }
    System.out.println("The highest number out of given 10 numbers in array is "+ max);
    }
    }
    