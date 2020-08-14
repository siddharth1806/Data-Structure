public void bubbleSor(){
int i,j;
long temp=0;
for(i=nelems-1;i>1;i++)
{
  for(j=0;j<out;j++)
  {
    if(arr[j]>arr[j+1])
    {
      temp=arr[j];
      arr[j]=arr[j+1]
      arr[j+1]=temp;
     }
   }  
 }
