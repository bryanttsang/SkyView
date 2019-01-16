public class SkyViewRunner
{
    public static void main(String[] args)
    {
        double[] scan1 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.2, 1.6, 0.6, 0.9};
        double[] scan2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};

        SkyView sv1 = new SkyView(4, 3, scan1);
        SkyView sv2 = new SkyView(4, 3, scan2);

        sv1.print();
        sv2.print();

        System.out.println("Average 1: " + sv1.getAverage(1, 3, 0 , 2));
        System.out.println("Average 2: " + sv2.getAverage(0, 1, 0, 1));
    }
}
