//	{
//		"games" : {
//			"game1" : [ 11, 22, 33, 34, 44, 45 ],
//			"game2" : [ 4, 5, 6, 10, 11, 12 ]
//		}
//	}


import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

class MyClass {
    private int[] practice;

    public MyClass(int[] practice) {
        super();
        this.practice = practice;
    }

    @Override
    public String toString() {
        return "MyClass [practice=" + Arrays.toString(practice) + "]";
    }
}

class WinningNum {
    Games games;

    @Override
    public String toString() {
        return "WinningNum [winningNum=" + winningNum + ", bonusNum=" + bonusNum + "]";
    }

    ArrayList<Object> winningNum = new ArrayList<Object>();
    private float bonusNum;

    public float getBonusNum() {
        return bonusNum;
    }

    public void setBonusNum(float bonusNum) {
        this.bonusNum = bonusNum;
    }
}

class Games {
    ArrayList<Object> game1 = new ArrayList<Object>();
    ArrayList<Object> game2 = new ArrayList<Object>();
	@Override
	public String toString() {
		return "Games [game1=" + game1 + ", game2=" + game2 + "]";
	}
}

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        String text = "{\"practice\" : [ 4, 5, 6 ]}";
        MyClass m = gson.fromJson(text, MyClass.class);
        System.out.println(m);

        String winning = "{\"winningNum\" : [ 1, 2, 3, 4, 5, 6 ] ,\"bonusNum\" : 7}";
        WinningNum w = gson.fromJson(winning, WinningNum.class);
        System.out.println(w);
        
        String games = "{"\Games\" [game1=" + game1 + ", game2=" + game2 + "]}";
    }
}