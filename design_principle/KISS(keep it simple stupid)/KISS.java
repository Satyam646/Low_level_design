// if i have to apply kiss principle how i can apply it
// sometimes we overcomplicate things and make them more complex than they need to be
//unnecessary complexity can lead to confusion, errors, and increased maintenance costs. The KISS principle encourages developers to keep their code simple and straightforward, avoiding unnecessary complexity and over-engineering. By following the KISS principle, developers can create code that is easier to read, understand, and maintain, ultimately leading to better software quality and reduced development time.    
//Please do not use interfaces, abstract classes, and inheritance in this example. Instead, focus on creating simple and straightforward classes that encapsulate the necessary functionality without introducing unnecessary complexity. The goal is to keep the code as simple as possible while still achieving the desired functionality.

//example of kiss principle
interface operation{
    public int add(int x,int y);
    public int sub(int x,int y);
    public int mul(int x,int y);
    public int div(int x,int y);
}


class addition implements operation{
    public int add(int x,int y){
        return x+y;
    }
}
class subtraction implements operation{
    public int sub(int x,int y){
        return x-y;
    }
}
class multiplication implements operation{
    public int mul(int x,int y){
        return x*y;
    }
}
class division implements operation{
    public int div(int x,int y){
        return x/y;
    }
}

//after applying kiss principle
//Actually kiss is very useful because many engineers over complicate code but keeping it simple make code easier to understand by other developer and after 3 months/6 months some times same developer forget the logic of code and he/she have to understand it again so keeping it simple is very useful for that.

Class Calculator{
    
    public int  operation(int x,int y,String operator){
        if(operator.equals("+")){
            return x+y;
        }
        else if(operator.equals("-")){
            return x-y;
        }
        else if(operator.equals("*")){
            return x*y;
        }
        else if(operator.equals("/")){
            return x/y;
        }
        else{
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

}

// This shows that we can easily perform all the operations in one class without creating multiple classes for each operation. This makes the code simpler and easier to understand.