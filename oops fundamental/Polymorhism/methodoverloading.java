// Online Java Compiler (Editor)
// Write and run Java online using this editor.
class Add{
    public int add(int a,int b){
        return a+b;
    }
    
    public double add(double a,double b){
         return a+b;    
    }

    public int add(int a, int b,int c){
        return a+b+c;
    }
    
}
class Main {
    public static void main(String[] args) {
        Add num = new Add();
        System.out.println("Addition of two integer number:-"+num.add(2,3));
        System.out.println("Addition of two decimal number:-"+num.add(2.7,3.3));
        System.out.println("Addition of three integer number:-"+num.add(2,3,5));
    }
}