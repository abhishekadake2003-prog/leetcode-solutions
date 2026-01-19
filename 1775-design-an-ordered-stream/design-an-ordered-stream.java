class OrderedStream {
    List<String> ls;
    String arr[];
    int ptr;
    public OrderedStream(int n) {
        arr=new String[n];
        ptr=0;
    }
    
    public List<String> insert(int idKey, String value) {
        arr[idKey-1]=value;
        ls=new ArrayList<>();
        for(int i=ptr;i<arr.length;i++)
        {
            if(arr[i]==null)
            {
                ptr=i;
                break;
            }
            else
                ls.add(arr[i]);
        }
        return ls;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */