package Android;

public class Sort {


  public int[] insertionSort(int[] arr){
    for(int i =1; i < arr.length; i++){
      int j = i - 1;
      int temp = arr[i];

      while (j >= 0 && temp < arr[j]){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = temp;
    }
    return arr;
  }

  public void mergeSort(int [] inputArray) {

    int inputLength = inputArray.length;

    if (inputLength < 2) {
      return;
    }

    int midIndex = inputLength / 2;
    int[] leftHalf = new int[midIndex];
    int[] rightHalf = new int[inputLength - midIndex];

    for (int i = 0; i < midIndex; i++) {
      leftHalf[i] = inputArray[i];
    }
    for (int i = midIndex; i < inputLength; i++) {
      rightHalf[i - midIndex] = inputArray[i];
    }

    mergeSort(leftHalf);
    mergeSort(rightHalf);

    merge(inputArray, leftHalf, rightHalf);

  }

  public void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
    int leftSize = leftHalf.length;
    int rightSize = rightHalf.length;

    int i = 0, j = 0, k = 0;

    while (i < leftSize && j < rightSize) {
      if (leftHalf[i] <= rightHalf[j]) {
        inputArray[k] = leftHalf[i];
        i++;
      }
      else {
        inputArray[k] = rightHalf[j];
        j++;
      }
      k++;
    }

    while (i < leftSize) {
      inputArray[k] = leftHalf[i];
      i++;
      k++;
    }

    while (j < rightSize) {
      inputArray[k] = rightHalf[j];
      j++;
      k++;
    }
  }

  public int[] quickSort(int[] arr){
    int left = 0;
    int right = arr.length -1;
    return quickSort(left, right, arr);
  }
  private int[] quickSort(int left, int right, int[] arr){

    if(left < right ){
      int position = partition(arr, left,right);
      quickSort(left, position -1,arr );
      quickSort(position +1, right ,arr);

    }
    return arr;
  }
  private int partition(int[] arr, int left, int right) {
    int p = arr[right];
    int low = left-1 ;
    int i;
    for( i = left; i< right; i++){
      if(arr[i] <= p){
        low++;
        swap(arr, low, i);
      }
    }
    swap(arr, low+1, right);
    return low+1;
  }
  private void swap(int[] arr, int i, int low) {
    int temp = arr[i];
    arr[i]  = arr[low];
    arr[low] = temp;
  }
}
