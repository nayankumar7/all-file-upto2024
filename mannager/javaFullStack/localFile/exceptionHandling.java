class exceptionHandling {

    public static void main(String[] args) {
        try{
           String a = "123";
           System.out.println(a+"jay");

        }catch(Exception e){
            System.out.println("somethig went wrong ! ");
        }finally{
            System.out.println("hello world");
        }
       
    }
}