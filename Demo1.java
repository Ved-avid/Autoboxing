import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class IntClass{
    private int value;

    public IntClass(int n){
        setValue(n);
        this.value = getValue();
    }

    public void setValue(int n){
        this.value = n;
    }
    public int getValue(){
        return this.value;
    }
}

class Demo1{
    static public void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<IntClass> list = new ArrayList<IntClass>();
        for(int i = 0;i<20;i++){
            list.add(new IntClass(i));
        }

        for(IntClass s : list){
            System.out.print(s.getValue()+"  ");
        }
        System.out.println();
    }
}