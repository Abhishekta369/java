import java.util.*;
class Calculate
{ Double  vol;
  int v;
 public void Volcal(int a)
   {v=a*a*a;
      System.out.println("volume of cube is:"+v);
    } 
     public void Volcal(int r ,int h) 
      {
        vol= 3.14*r*r*h;
        System.out.println("the volume of the cylender is"+vol);
      }
       public void Volcal(int l ,int b,int h)
         {v=l*b*h;
           System.out.println("the volume of the rectangular boxx is:"+v);
        }
}
class volume
{ 
public  static void main(String []args)
   {int x,a,b,c,d,e,f;
    Calculate G=new Calculate(); 
     Scanner s=new Scanner(System.in);
      System.out.println("slect the shape\t1.cube\t2.cylender\t3.rectangularbox");
      x=s.nextInt();
      switch(x)
      {
      case 1:
        {
            System.out.println("enter the side");
            a=s.nextInt();
            G.Volcal(a);
            break;
         }
       case 2:
       {
         System.out.println("enter radius and height");
            b=s.nextInt();
            c=s.nextInt();
            G.Volcal(b,c);
             break;     
        }
         
        case 3:
        {System.out.println("enter the length,breadth,height");
          d=s.nextInt();
          e=s.nextInt();
          f=s.nextInt(); 
           G.Volcal(d,e,f);
           break;
         }
         default :
         {System.out.println("error");
        }
      }

    }
}     
