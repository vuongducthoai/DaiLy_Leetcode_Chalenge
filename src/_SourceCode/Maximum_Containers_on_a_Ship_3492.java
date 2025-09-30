package _SourceCode;

public class Maximum_Containers_on_a_Ship_3492 {
    public static int maxContainers(int n, int w, int maxWeight) {
        return Math.min(n * n, maxWeight / w);
    }

    public static void main(String[] args) {
        int n = 2, w = 3, maxWeight = 15;
        System.out.println(maxContainers(n, w, maxWeight));
    }
}
