public class MyStackimpl implements IMyStack {
    private int[] elem;
    private  int top;
    private  int usedSize;
    private static  final int DEFAULT_SIZE = 10;

    public MyStackimpl(){
        elem = new int[DEFAULT_SIZE];
        this.top = 0;
        this.usedSize = 0;
    }

    private boolean isFull(){
        if(this.top >= DEFAULT_SIZE){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void push(int item) {
        if(isFull()){
            return ;
        }
        elem[this.usedSize] = item;
        this.usedSize++;
        this.top++;

    }
private  boolean isEmpty(){
/*        if(this.top == 0){
            return true;
        }else{
            return  false;
        }*/

        return this.top == 0;
}
    @Override
    public int pop() {
        if(isEmpty()){
            throw new UnsupportedOperationException();
        }
        int old = elem[this.top];
        this.top--;
        this.usedSize--;
        return old;
    }

    @Override
    public int peek() {
        if(isEmpty()){
            throw new UnsupportedOperationException();
        }
        int old = this.elem[top];

        return old;
    }

    @Override
    public boolean empty() {
/*        if(this.top == 0){
            return true;
        }else{
            return  false;
        }*/
         return  this.top == 0;

    }

    @Override
    public int size() {
        return this.usedSize;
    }
}
