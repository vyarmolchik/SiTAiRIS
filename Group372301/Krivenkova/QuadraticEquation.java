package junit;
import java.security.InvalidParameterException;

public class QuadraticEquation {
    
    
   
     public  String decision(int a, int b, int c)
    {
        String roots;
        double x1, x2, D;
        
        float pr;
        if(a!=0)
        {
            D=b*b-4*a*c;
            if(D>=0)
            {
                x1=(-b+Math.sqrt(D))/(2*a);
                x2=(-b-Math.sqrt(D))/(2*a);
                if(a==1)
                {
                     if((x1+x2)!= (-b))
                     {
                         return "true p";
                     }
                    if((x1*x2)!= c)
                     {
                         return "true -q";
                     } 
                }
                else
                {
                    
                     if((x1+x2)!= (-b*1.00/a))
                     {
                        return "true p1";
                     }
                     double d = x1*x2;
                    d = d * 1000;
                    int i = (int) Math.round(d);
                    d = (double)i / 1000;
                    if(d != (c*1.00/a))
                     {
                         System.out.println(d);
                         System.out.println((c*1.00/a));
                         
                          
                         
                         return "true -q1";
                     } 
                
                }
            }
            else
            {
                return "Дискриминант <0";
            }
        }
        else
        {
            return "Деление на 0";
        }
       // roots=x1+"__"+x2;
 
        return x1+"__"+x2;
    }
    public static void main(String[] args)
    {
//        double[] roots1=new double[2];
//        int a,b,c;
//        double y,y1,x1,x2;
//        a=1;
//        b=2;
//        c=0;
//        roots1=decision(a,b,c);
//      //  System.out.println(roots1[0]+"  "++roots1[1]);
//       
//        x1=roots1[0];
//        x2=roots1[1];
//         System.out.println(x1+"  "+x2);
//        y=a*Math.pow(x1,2)+b*x1+c;
//        y1=a*Math.pow(x2,2)+b*x2+c;
//        if( y== 0 && y1==0)
//        {
//            System.out.println("Test1 passed.");
//        }
//        else
//        {
//            System.out.println("Test1 failed.");
//        }

    
    }

    
}
