package _SourceCode;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.List;

public class Pascal_s_Triangle_118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for(int i = 1; i < numRows; i ++){
            List<Integer> preRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int j = 1; j < numRows; j ++){
                currentRow.add(preRow.get(j - 1) + preRow.get(j));
            }

            currentRow.add(1);

            triangle.add(currentRow);
        }
        return  triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));

    }
}
