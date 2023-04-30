public class Shortest_Path {
    public static void main(String args[]) {
        String str = "WNEENESENNN";
        double answer = GetShortestPath(str);
        System.out.println(answer);
    }

    public static double GetShortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir == 'S'){
                y--;
            }
            if(dir == 'N'){
                y++;
            }
            if(dir == 'W'){
                x--;
            }
            if(dir == 'E'){
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return Math.sqrt(x2+y2);
    }
}
