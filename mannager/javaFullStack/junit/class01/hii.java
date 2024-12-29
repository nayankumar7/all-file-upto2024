package junit.class01;

public class hii{
    public static class properties{
        static int data = 0 ;
       
    }
     
    public static class addition extends properties{
        
       int addition (int data){ 
            this.data = this.data + data ;
            return this.data;
        }
    }
public static class Subtraction extends properties{
    int Subtraction (int data){ 
        this.data = this.data - data ;
        return this.data;


}
    
}

} 

    

