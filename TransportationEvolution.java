class Bicycle  {
    void displayfeatures()
    {
        System.out.println("Features of bicycle: Pedals, Manual power");
    }
}

class Motarbike extends Bicycle{
    void displayfeatures(){
    super.displayfeatures();
    System.out.println("Added features by Motorbike: Engine");
    }
}

class Electeicbike extends Motarbike{
    void displayfeatures(){
    super.displayfeatures();
        System.out.println("Added features by Electricalbike : Electrical motor & battery");
    }
}


public class TransportationEvolution{
    public static void main(String[] args)
    {
    Electeicbike ebike=new Electeicbike();
    ebike.displayfeatures();
    }
}