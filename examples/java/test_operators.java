import CGAL.Kernel.Point_2;
import CGAL.Kernel.Point_3;
import CGAL.Kernel.Vector_3;
import CGAL.Kernel.Vector_2;


public class test_operators {
  public static void assertion(boolean b,int k){
    if (!b) throw new AssertionError("ERROR!!!!");
    else System.out.println("Test "+k+" OK");
  }
  
  public static void test_2d(){
    System.out.println("2D Tests");

    Point_2  p1 = new Point_2(0,0);
    Point_2  p2 = new Point_2(1,2);
    Vector_2 v1 = new Vector_2(1,1);
    Vector_2 v2 = new Vector_2(1,2);

    //operations on points
    assertion( p1.plus(v2).equals( p2 ), 1);
    assertion( p1.minus(v2).lt(p2), 2);
    assertion( p2.minus(p1).equals(v2), 3);
    assertion( p2.gt(p1), 4);
    assertion( p2.ge(p2), 5);
    assertion( p2.le(p2), 6);
    assertion( p2.not_equals(p1), 7);
    
    //operations on vector
    assertion( v1.plus(v2).equals(new Vector_2(2,3)),8 );
    assertion( v1.minus(v2).equals(new Vector_2(0,-1)),9 );
    assertion( v2.times(v1) == 3,10 );
    assertion( v2.times(2).equals(new Vector_2(2,4)),11 );
    assertion( v1.div(2).equals(new Vector_2(0.5,0.5)),12 );
    assertion( v2.minus().equals( new Vector_2(-1,-2) ),13 );
    assertion( v2.not_equals( v1 ),14 );
  }
  
  public static void test_3d(){
    System.out.println("3D Tests");

    Point_3  p1 = new Point_3(0,0,0);
    Point_3  p2 = new Point_3(1,2,0);
    Vector_3 v1 = new Vector_3(1,1,0);
    Vector_3 v2 = new Vector_3(1,2,0);

    //operations on points
    assertion( p1.plus(v2).equals( p2 ), 1);
    assertion( p1.minus(v2).lt(p2), 2);
    assertion( p2.minus(p1).equals(v2), 3);
    assertion( p2.gt(p1), 4);
    assertion( p2.ge(p2), 5);
    assertion( p2.le(p2), 6);
    assertion( p2.not_equals(p1), 7);
    
    //operations on vector
    assertion( v1.plus(v2).equals(new Vector_3(2,3,0)),8 );
    assertion( v1.minus(v2).equals(new Vector_3(0,-1,0)),9 );
    assertion( v2.times(v1) == 3,10 );
    assertion( v2.times(2).equals(new Vector_3(2,4,0)),11 );
    assertion( v1.div(2).equals(new Vector_3(0.5,0.5,0)),12 );
    assertion( v2.minus().equals( new Vector_3(-1,-2,0) ),13 );    
    assertion( v2.not_equals( v1 ),14 );
  }
  
  public static void main(String arg[]){
    test_2d();
    test_3d();
  }
}