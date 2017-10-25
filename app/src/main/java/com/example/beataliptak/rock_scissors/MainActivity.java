package com.example.beataliptak.rock_scissors;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn_ko, btn_papir, btn_ollo;
    private TextView eredmeny;
    private TextView eredmeny2;
    private ImageView imageView_robot, imageView_ember;
    private int ember_eredmeny = 0, robot_eredmeny = 0;
    private int sajatSzam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ko = (Button) findViewById(R.id.btn_ko);
        btn_ollo = (Button) findViewById(R.id.btn_ollo);
        btn_papir = (Button) findViewById(R.id.btn_papir);
        eredmeny = (TextView) findViewById(R.id.textView_eredmeny);
        eredmeny2 = (TextView) findViewById(R.id.textView_eredmeny2);
        imageView_ember = (ImageView) findViewById(R.id.imageView_ember);
        imageView_robot = (ImageView) findViewById(R.id.imageView_robot);

        btn_ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_ember.setBackgroundResource(R.drawable.rock);
                Random r = new Random();
                int i1 = r.nextInt(4 - 1) + 1;

                switch(i1) {
                    case 1:
                        imageView_robot.setBackgroundResource(R.drawable.rock);
                        Toast.makeText(MainActivity.this,
                                "Döntetlen!", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        imageView_robot.setBackgroundResource(R.drawable.paper);
                        Toast.makeText(MainActivity.this,
                                "A gép nyert!", Toast.LENGTH_SHORT).show();
                        try {
                            sajatSzam2 = Integer.parseInt(eredmeny2.getText().toString());
                            sajatSzam2 += 1;
                            eredmeny2.setText(""+sajatSzam2);

                        } catch(NumberFormatException nfe) {
                            System.out.println("Sikertelen parseolás" + nfe);
                        }
                        break;
                    case 3:
                        imageView_robot.setBackgroundResource(R.drawable.scissors);
                        Toast.makeText(MainActivity.this,
                                "Te nyertél!", Toast.LENGTH_SHORT).show();
                        try {
                            sajatSzam2 = Integer.parseInt(eredmeny.getText().toString());
                            sajatSzam2 += 1;
                            eredmeny.setText(""+sajatSzam2);

                        } catch(NumberFormatException nfe) {
                            System.out.println("Sikertelen parseolás" + nfe);
                        }
                        break;
                    default:
                        Toast.makeText(MainActivity.this,
                                "Hiba történt az alkalmazásban!", Toast.LENGTH_LONG).show();
                }

            }

        })
        ;

        btn_papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_ember.setBackgroundResource(R.drawable.paper);
                Random r = new Random();
                int i1 = r.nextInt(4 - 1) + 1;

                switch(i1) {
                    case 1:
                        imageView_robot.setBackgroundResource(R.drawable.rock);
                        Toast.makeText(MainActivity.this,
                                "Te nyertél!", Toast.LENGTH_SHORT).show();
                        try {
                            sajatSzam2 = Integer.parseInt(eredmeny.getText().toString());
                            sajatSzam2 += 1;
                            eredmeny.setText(""+sajatSzam2);

                        } catch(NumberFormatException nfe) {
                            System.out.println("Sikertelen parseolás" + nfe);
                        }
                        break;
                    case 2:
                        imageView_robot.setBackgroundResource(R.drawable.paper);
                        Toast.makeText(MainActivity.this,
                                "Döntetlen!", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        imageView_robot.setBackgroundResource(R.drawable.scissors);
                        Toast.makeText(MainActivity.this,
                                "A gép nyert!", Toast.LENGTH_SHORT).show();
                        try {
                            sajatSzam2 = Integer.parseInt(eredmeny2.getText().toString());
                            sajatSzam2 += 1;
                            eredmeny2.setText(""+sajatSzam2);

                        } catch(NumberFormatException nfe) {
                            System.out.println("Sikertelen parseolás" + nfe);
                        }
                        break;
                    default:
                        Toast.makeText(MainActivity.this,
                                "Hiba történt az alkalmazásban!", Toast.LENGTH_LONG).show();
                }
            }
        })
        ;
        btn_ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView_ember.setBackgroundResource(R.drawable.scissors);
                Random r = new Random();
                int i1 = r.nextInt(4 - 1) + 1;

                switch(i1) {
                    case 1:
                        imageView_robot.setBackgroundResource(R.drawable.rock);
                        Toast.makeText(MainActivity.this,
                                "A gép nyert!", Toast.LENGTH_SHORT).show();
                        try {
                            sajatSzam2 = Integer.parseInt(eredmeny2.getText().toString());
                            sajatSzam2 += 1;
                            eredmeny2.setText(""+sajatSzam2);

                        } catch(NumberFormatException nfe) {
                            System.out.println("Sikertelen parseolás" + nfe);
                        }
                        break;
                    case 2:
                        imageView_robot.setBackgroundResource(R.drawable.paper);
                        Toast.makeText(MainActivity.this,
                                "Te nyertél!", Toast.LENGTH_SHORT).show();
                        try {
                            sajatSzam2 = Integer.parseInt(eredmeny.getText().toString());
                            sajatSzam2 += 1;
                            eredmeny.setText(""+sajatSzam2);

                        } catch(NumberFormatException nfe) {
                            System.out.println("Sikertelen parseolás" + nfe);
                        }
                        break;
                    case 3:
                        imageView_robot.setBackgroundResource(R.drawable.scissors);
                        Toast.makeText(MainActivity.this,
                                "Döntetlen!", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this,
                                "Hiba történt az alkalmazásban!", Toast.LENGTH_LONG).show();
                }
            }
        })
        ;





    }
}



