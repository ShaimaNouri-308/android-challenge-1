package com.example.xochallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    static Boolean Xturn = true;
    static TextView turn;
    static int[] Xarray = new int[9];
    static int[] Oarray = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button zero = findViewById(R.id.zero);
        final Button one = findViewById(R.id.one);
        final Button two = findViewById(R.id.two);
        final Button three = findViewById(R.id.three);
        final Button four = findViewById(R.id.four);
        final Button five = findViewById(R.id.five);
        final Button six = findViewById(R.id.six);
        final Button seven = findViewById(R.id.seven);
        final Button eight = findViewById(R.id.eight);
        final Button reset = findViewById(R.id.reset);
        turn = findViewById(R.id.text);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zero.setText("");
                one.setText("");
                two.setText("");
                three.setText("");
                four.setText("");
                five.setText("");
                six.setText("");
                seven.setText("");
                eight.setText("");

                for(int i =0; i <Xarray.length;i++){
                    Xarray [i] = 0;
                }
                for(int i =0; i <Oarray.length;i++){
                    Oarray [i] = 0;
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Xturn) {
                    Xarray[0]=1;
                    zero.setText("X");
                    checkXwin();
                } else {
                    Oarray [0]=1;
                    checkOwin();
                    zero.setText("O");
                }

            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[1]=1;
                    one.setText("X");
                    checkXwin();
                } else {
                    Oarray [1]=1;
                    checkOwin();
                    one.setText("O");
                }

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[2]=1;
                    two.setText("X");
                    checkXwin();
                } else {
                    Oarray [2]=1;
                    checkOwin();
                    two.setText("O");
                }

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[3]=1;
                    three.setText("X");
                    checkXwin();
                } else {
                    Oarray [3]=1;
                    checkOwin();
                    three.setText("O");
                }

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[4]=1;
                    four.setText("X");
                    checkXwin();
                } else {
                    Oarray [4]=1;
                    checkOwin();
                    four.setText("O");
                }

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[5]=1;
                    five.setText("X");
                    checkXwin();
                } else {
                    Oarray [5]=1;
                    checkOwin();
                    five.setText("O");
                }

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[6]=1;
                    six.setText("X");
                    checkXwin();
                } else {
                    Oarray [6]=1;
                    checkOwin();
                    six.setText("O");
                }

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[7]=1;
                    seven.setText("X");
                    checkXwin();
                } else {
                    Oarray [7]=1;
                    checkOwin();
                    seven.setText("O");
                }

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[8]=1;
                    eight.setText("X");
                    checkXwin();
                } else {
                    Oarray [8]=1;
                    checkOwin();
                    eight.setText("O");
                }
            }
        });
    }

        public void checkXwin() {
            Xturn = false;
            turn.setText("O turn");
            if(Xarray[0] == 1 && Xarray[1] == 1 && Xarray[2] == 1);
            {
                Toast.makeText(MainActivity.this,"X won!",Toast.LENGTH_SHORT).show();
            }
            else if (Xarray[3] == 1 && Xarray[4] == 1 && Xarray[5] == 1);
            {
                Toast.makeText(MainActivity.this,"X won!",Toast.LENGTH_SHORT).show();
            }
            else if(Xarray[6] == 1 && Xarray[7] == 1 && Xarray[8] == 1);
            {
                Toast.makeText(MainActivity.this,"X won!",Toast.LENGTH_SHORT).show();
            }
            else if(Xarray[0] == 1 && Xarray[3] == 1 && Xarray[6] == 1);
            {
                Toast.makeText(MainActivity.this,"X won!",Toast.LENGTH_SHORT).show();
            }
            else if(Xarray[1] == 1 && Xarray[4] == 1 && Xarray[7] == 1);
            {
                Toast.makeText(MainActivity.this,"X won!",Toast.LENGTH_SHORT).show();
            }
            else if(Xarray[2] == 1 && Xarray[5] == 1 && Xarray[8] == 1);
            {
                Toast.makeText(MainActivity.this,"X won!",Toast.LENGTH_SHORT).show();
            }
            else if(Xarray[0] == 1 && Xarray[4] == 1 && Xarray[8] == 1);
            {
                Toast.makeText(MainActivity.this,"X won!",Toast.LENGTH_SHORT).show();
            }
            else if(Xarray[2] == 1 && Xarray[1] == 1 && Xarray[6] == 1);
            {
                Toast.makeText(MainActivity.this,"X won!",Toast.LENGTH_SHORT).show();
            }
        }
        public void checkOwin() {
            Xturn = true;
            turn.setText("X turn");
            if(Oarray[0] == 1 && Oarray[1] == 1 && Oarray[2] == 1);
            {
                Toast.makeText(MainActivity.this,"O won!",Toast.LENGTH_SHORT).show();
            }
            else if(Oarray[3] == 1 && Oarray[4] == 1 && Oarray[5] == 1);
            {
                Toast.makeText(MainActivity.this,"O won!",Toast.LENGTH_SHORT).show();
            }
            else if(Oarray[6] == 1 && Oarray[7] == 1 && Oarray[8] == 1);
            {
                Toast.makeText(MainActivity.this,"O won!",Toast.LENGTH_SHORT).show();
            }
            else if(Oarray[0] == 1 && Oarray[3] == 1 && Oarray[6] == 1);
            {
                Toast.makeText(MainActivity.this,"O won!",Toast.LENGTH_SHORT).show();
            }
            else if(Oarray[1] == 1 && Oarray[4] == 1 && Oarray[7] == 1);
            {
                Toast.makeText(MainActivity.this,"O won!",Toast.LENGTH_SHORT).show();
            }
            else if(Oarray[2] == 1 && Oarray[5] == 1 && Oarray[8] == 1);
            {
                Toast.makeText(MainActivity.this,"O won!",Toast.LENGTH_SHORT).show();
            }
            else if(Oarray[0] == 1 && Oarray[4] == 1 && Oarray[8] == 1);
            {
                Toast.makeText(MainActivity.this,"O won!",Toast.LENGTH_SHORT).show();
            }
            else if(Oarray[2] == 1 && Oarray[1] == 1 && Oarray[6] == 1);
            {
                Toast.makeText(MainActivity.this,"O won!",Toast.LENGTH_SHORT).show();
            }


    }
}