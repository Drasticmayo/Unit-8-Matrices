//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jude A

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )

    {
        int rowTotal = 0;
    	List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < m.length; i++)
        {
            for(int k = 0; k < m[i].length; k++)
            {
                rowTotal += m[i][k];
            }
            list.add(rowTotal);
            rowTotal = 0;
        }
        
		return list;
    }
}
