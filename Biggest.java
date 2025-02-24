//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jude Armstrong

public class Biggest
{
    public static int getBig(int[][] m)
    {
        int inital = m[0][0];
        
        for (int i = 0; i < m.length; i++)
        {
            for (int k = 0; k < m[i].length; k++)
            {
                if (m[i][k] > inital)
                {
                    inital = m[i][k];
                }
            }

        }
		return inital;
    }
}
