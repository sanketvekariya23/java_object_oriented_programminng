 class cylinder{
   private float hight;
    private float reduce;

    public float getReduce(){
        return reduce;
    }
    public void SetReduce(Float reduce){
         float r = reduce;
    }
    public float getHight(){
        return hight;
    }
    public void setHight(float hight){
        float h= hight;
    }
    public float areaCylinder(float reduce, float hight){
        return (2*3.14f*reduce*reduce + 2*3.14f*reduce*hight );
    }
    public float volumeCylinder(float reduce ,float hight){
        return (3.14f*reduce*reduce*hight);
    }
}

public class practice_set5 {
    public static void main(String[] args) {
        // problem : 1 create a class cylinder and use getter 
        // and setter to set its reduce and hight
        cylinder cy = new cylinder();
        cy.SetReduce(145.55f);
        cy.setHight(44.45f);
        System.out.println(cy.areaCylinder(145.55f , 44.45f));
        System.out.println(cy.volumeCylinder(145.55f , 44.45f));
    }
}
