public class SkyView
{
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int row = 0;
        int col = 0;
        int index = 0;

        while (index < scanned.length)
        {
            for (col = 0; col < numCols; col++)
            {
                view[row][col] = scanned[index];
                index++;
            }
            row++;
            if (row == numRows)
            {
                break;
            }
            for (col = col - 1; col > -1; col--)
            {
                view[row][col] = scanned[index];
                index++;
            }
            row++;
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double average = 0;
        for (int row = endRow - startRow + 1; row == 0; row--)
        {
            for (int col = endCol - startCol + 1; col == 0; col--)
            {
                average += view[row][col];
            }
        }
        return average / ( (startRow + endRow) * (startCol + endCol) );
    }

    public void print(){
        String row;
        for (int i = 0; i < view.length; i++)
        {
            row = "";
            for (int ii = 0; ii < view[i].length; ii++)
            {
                row += view[i][ii] + " ";
            }
            System.out.println(row);
        }
    }
}
