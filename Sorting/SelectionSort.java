public void SelectionSort()
{
int out,in,min;
for(out=0;out<nelemns-1;out++)
{
  min=out;
  for(int in=out+1;in<nelemns;in++)
  {
    if(a[in]<a[min])
    {
      min=in;
      swap(out,min);
    }
   }
 }
 }
 public void swap(int one, int two)
 {
 long temp=a[one];
 a[one]=a[two];
 a[two]=temp;
 }
 
