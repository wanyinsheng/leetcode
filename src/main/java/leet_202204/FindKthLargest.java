package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/23 12:50 AM
 * @Version 1.0
 **/
public class FindKthLargest {
    /**
     * 堆排序
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        buildMaxHeap(nums, heapSize) ;
        for (int i = nums.length-1; i >=nums.length-k+1 ; --i) {//从最后一个节点调整
            swap(nums,0,i);
            --heapSize;
            modifyMaxHeap(nums,0,heapSize);//这里的堆大小是变化的

        }
        return nums[0];
    }

    /**
     * 构建大顶堆
     *
     * @param nums
     * @param heapSize
     */
    public void buildMaxHeap(int[] nums, int heapSize) {
        for (int i = heapSize / 2; i >= 0; i--) {
            modifyMaxHeap(nums, i, heapSize);
        }
    }

    public void modifyMaxHeap(int[] nums, int i, int heapSize) {
        int leftChid = i * 2 + 1;
        int rightChild = i * 2 + 2;
        int largest = i;
        if (leftChid < heapSize && nums[leftChid] > nums[largest]) {//左孩子大
            largest = leftChid;


        }
        if (rightChild < heapSize && nums[rightChild] > nums[largest]) {//右孩子大
            largest = rightChild;
        }
        //孩子节点代替父节点
        if (largest != i) {
            swap(nums, largest, i);
            modifyMaxHeap(nums, largest, heapSize);//继续向上调整大顶堆
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
