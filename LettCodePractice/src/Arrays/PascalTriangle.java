package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle= new ArrayList<>();
        if(numRows==0) return triangle;

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rownum=1;rownum<numRows;rownum++)
        {
            List<Integer> row= new ArrayList<>();
            List<Integer> prev= triangle.get(rownum-1);

            row.add(1);
            for(int i=0;i+1<prev.size();i++)
            {
                row.add(prev.get(i)+prev.get(i+1));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}
