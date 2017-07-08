package risk;

import java.util.ArrayList;

public class World {
    
    static ArrayList<Country> countries;
    static ArrayList<Player> players;
    static int numberOfPlayers;
    
    
    private static void preparingCountries(){
        
        int[][] mojavers =
                {
                    {1,2,23}, // 0
                    {0,1,2,4,12}, // 1
                    {1,0,4,3}, // 2
                    {2,4,5,7}, // 3
                    {2,3,5,1,6,12}, // 4
                    {4,3,7,6}, // 5
                    {4,5,12}, // 6
                    {3,5,11}, // 7
                    {7,9,10}, // 8
                    {8,10,11,31}, // 9
                    {9,8,11}, // 10
                    {10,9}, // 11
                    {1,4,6,13}, // 12
                    {12,14,16}, // 13
                    {13,16,17,15}, // 14
                    {14,31,17,18}, // 15
                    {13,14,17,19,}, // 16
                    {15,16,14,19,18,}, // 17
                    {30,31,17,19,20}, // 18
                    {16,17,18,29,28,20}, // 19
                    {19,28,27,21,}, // 20
                    {20,27,25,24,22}, // 21
                    {21,24,23}, // 22
                    {22,24,25,26,0}, // 23
                    {21,22,23,25,}, // 24
                    {24,27,26}, // 25
                    {23,25}, // 26
                    {20,21,28,36,37,25}, // 27
                    {19,20,27,36,29}, // 28
                    {30,32,36,28,19}, // 29
                    {18,31,32,29}, // 30
                    {18,9,15,30,32,33}, // 31
                    {29,30,33,31,34,35}, // 32
                    {31,32,34}, // 33
                    {32,33,35}, // 34
                    {32,34}, // 35
                    {29,28,27,37}, // 36
                    {36,27,38}, // 37
                    {37,39,41}, // 38
                    {30,41,40}, // 39
                    {41,39}, // 40
                    {38,39,40} // 41                    
                };
        
        for (int i = 0; i < 42; i++) {
            countries.add(new Country(i));
            countries.get(i).setMojaver(mojavers[i]);
            countries.get(i).soldirs = 2;
            countries.get(i).sahebID = 0;
        }
        
    }
    
    public void addPlayers(String name, int color){
        World.players.add(new Player(World.numberOfPlayers, name, World.numberOfPlayers));
        World.numberOfPlayers++;
    }
    
}


