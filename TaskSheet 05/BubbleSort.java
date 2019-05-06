class BubbleSort{
public static void BubbleSort(int a[],int n){
int round,i,t;
for(round=1;round<=n-1;round++){
for(i=0;i<=(n-1)-round;i++){
if(a[i]>a[i+1]){
t=a[i];
a[i]=a[i+1];
a[i+1]=t;
}
}
}
}
public static void main(String args[]){
int arr[]={2,4,1,8,6};
int i;
System.out.print("Array before bubble sorting:");
for(i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
BubbleSort(arr,5);
System.out.println();
System.out.print("Array after bubble sorting:");
for(i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
}
}
