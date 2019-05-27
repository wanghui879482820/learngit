public class SelectSort {
    
    String wanghui="shuai";
    /**
     * 直接选择排序
     */
    public static void main(String[] args) {
     //先建立一个数组
        int[] array={1,15,14,19};
        //建立一个对象,用来调用,排序方法
        SelectSort selectSort = new SelectSort();
        //调用排序方法
        selectSort.sort(array);
    }

    private void sort(int[] array) {
        //定义一个下标
      int index;
      for (int i=1;i<array.length;i++){
          index=0;
          for (int j=1;j<=array.length-i;j++){
              if (array[index]<array[j]){
                  index=j;
              }
          }
          //定义一个暂存变量
          int temp=array[array.length-i];
          array[array.length-i]=array[index];
          array[index]=temp;
      }
        //调用输出方法
        shuchu(array);
    }

    private void shuchu(int[] array) {
        for (int i:array) {
            System.out.println(" "+i);
        }
    }
}
