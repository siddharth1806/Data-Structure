public void insertionsort(){
  int in,out;
  for(out=1;out<nlemns;out++)
  {
  long temp=a[out];
  in=out;
  while(in>0 && a[in-1]>=temp)
  {
    a[in]=a[in-1];
    --in;
    }
    a[in]=temp;
    }
    
}
