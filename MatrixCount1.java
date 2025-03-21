//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jude A

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
        int count = 0;

		for (int k = 0; k < m.length; k++)
        {
            for (int i = 0; i < m[k].length; i++)
            {
                if (m[k][i] == val)
                {
                    count++;
                }
            }
        }
		return count;
    }
}
