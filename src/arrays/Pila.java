package arrays;

public class Pila {
    int pila[];
    int pos;

    public Pila(int tam){
        this.pila=new int[tam];
        this.pos=0;
        //inicializar array
        for(int i=0;i<this.pila.length;i++){
            this.pila[i]=-1;
        }
    }
    public void insertar(int ele){
        if(!this.llena()){
            pila[pos]=ele;
            pos++;
        }
        else{
            System.out.println("La pila está llena");
        }
    }
    public boolean llena(){
        boolean res=true;
        if(this.pos<this.pila.length){
            res=false;
        }
        return res;
    }
    public int cima(){
        int res;
        res=this.pila[this.pos-1];

        return res;
    }
    public boolean vacia(){
        boolean res=true;
        if(this.pos==0){
            res=true;
        }
        else{
            res=false;
        }
        return res;
    }
    public int extraer(){
        int res;
        res=this.pila[this.pos-1];
        pos--;
        this.pila[this.pos]=-1;

        return res;
    }
    public String toString(){
        String res="";
        for(int i=0;i<this.pila.length;i++){
            if(this.pila[i]==-1){
                res+="*"+"\n";
            }
            else{
                res+=this.pila[i]+"\n";
            }
        }
        return res;
    }
}
