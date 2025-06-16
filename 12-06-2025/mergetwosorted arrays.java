class Main {
    public static void main(String[] args) {
       int[] a = {2,9,18,21,22};
       int[] b= {1,3,6,19,27,50};
       int[] c= new int[a.length + b.length];
       int i = 0;
       int j = 0;
       int k = 0;
       while(i<a.length && j< b.length){
           if(a[i]<b[j]){
               c[k]=a[i];
               i++;
               k++;
               
           }
           else{
               c[k]=b[j];
               j++;
               k++;
           }
       }
       while(i<a.length){
           c[k]=a[i];
           i++;
           k++;
       }
       while(j<b.length){
            c[k]=b[j];
               j++;
               k++;
       }
       System.out.println("Elements in an Array:");
       for(k=0;k<c.length;k++){
           System.out.print( c[k]+" ");
       }
    }
}