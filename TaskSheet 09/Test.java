class Test { 
String str = "a"; void A() { 
try {
 str +="b"; B();
  } catch
   (Exception e) {
    str += "c"; } 
    } 
    void B() throws Exception {
     try { str += "d"; C(); 
     }
      catch(Exception e) {
       throw new Exception(); } 
       finally { str += "e"; 
       } 
       str += "f"; } 
       void C() throws Exception { 
       throw new Exception();
        } 
        void display() {
         System.out.println(str); 
         } 
         public static void main(String[] args) { 
         Test object = new Test();
          object.A(); object.display(); } 
          } 
          /* the output of this program is abdec
          Because in this program the str=a firstly A() method will be execuated then the str become ab and in this  mehod A() there is the B() method
          calling and  then the method B() str becomes abd and in this method B() there is the finally, so its adds e in the str now the str is abde
          and then there is calling c() method in the B() method, C() method throws an exception so the  compiler checks for catch exception in C(), B()
          and A() methods and in A() it finds exception obj which can add the c in the str and now we get the str is abdec.*/
