public class BubbleSort {
    public static void main(String[] args) {
        String wh="王辉是爸爸";
        //创建一个数组,这个数组是乱序的
        int[] array={63,4,24,1,3,15};
        //new出来一个对象,用来排序,跟调用排序方法
        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);
    }

    /**
     * 冒泡排序
     * @param array
     */
    private void sort(int[] array) {
        //第一层是循环的次数,长度array.length
       for (int i=1;i<=array.length;i++){
            //循环比较,较大的数往后冒泡
           for (int j=0;j<array.length-i;j++){
               if (array[j]>array[j+1]){
                   int temp =array[j];
                   array[j]=array[j+1];
                   array[j+1]=temp;
               }
           }
        }
       //调用输出方法
        showArray(array);
    }
    //输出排序后的数组
    private void showArray(int[] array) {
        for (int i:array) {
            System.out.println(">"+i);
        }
        System.out.println();
    }
}
