// A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
package com.example.lenovo.checking_prime;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class Checking_Prime extends AppCompatActivity
{
    public static int i1 = 0;
    public static String i2 = "";

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        return;
    }
    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        outState.putInt(i2, i1);
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if( savedInstanceState!=null )
        {
            i1 = savedInstanceState.getInt( i2 );
        }
        else
        {
            Random r = new Random();
            i1 = r.nextInt(1001 - 1) + 1;
        }
        setContentView(R.layout.activity_checking__prime);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tv =(TextView)findViewById(R.id.texx);
        tv.setText("Is " + Integer.toString( i1 ) + " a prime no?" );

        Button deepcorrec = (Button)findViewById(R.id.correc);
        Button deepincorrec = (Button)findViewById(R.id.incorrec);

        deepcorrec.setEnabled(true);
        deepincorrec.setEnabled(true);
        deepcorrec.setOnClickListener( new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Button deepincorrec = (Button)findViewById(R.id.incorrec);
                        boolean flag = false;
                        int i;

                        if( i1!=1 )
                        {
                            for(i=2; i<i1; i++)
                            {
                                if( (i1%i)==0 )
                                {
                                    flag = true;
                                }
                            }

                            if( !flag )
                            {
                                Toast.makeText(getApplicationContext(),"It is Correct!!", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(),"It is Incorrect!!", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"It is Incorrect!!", Toast.LENGTH_SHORT).show();
                        }
                        deepincorrec.setEnabled(false);
                    }
                }
        );


        deepincorrec.setOnClickListener(new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Button deepcorrec = (Button)findViewById(R.id.correc);
                        boolean flag = false;
                        int i;

                        if( i1!=1 )
                        {
                            for(i=2; i<i1; i++)
                            {
                                if( (i1%i)==0 )
                                {
                                    flag = true;
                                }
                            }

                            if( !flag )
                            {
                                Toast.makeText(getApplicationContext(),"It is Incorrect!!", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(),"It is Correct!!", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"It is Correct!!", Toast.LENGTH_SHORT).show();
                        }
                        deepcorrec.setEnabled(false);
                    }
                }
        );

        Button deepnex = (Button)findViewById(R.id.nex);
        deepnex.setOnClickListener(new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        Button deepcorrec = (Button)findViewById(R.id.correc);
                        Button deepincorrec = (Button)findViewById(R.id.incorrec);

                        Random r = new Random();
                        i1 = r.nextInt(1001 - 1) + 1;

                        TextView tv =(TextView)findViewById(R.id.texx);
                        tv.setText("Is " + Integer.toString( i1 ) + " a prime no?" );

                        deepcorrec.setEnabled(true);
                        deepincorrec.setEnabled(true);
                    }
                }
        );

        Button exit2 = (Button)findViewById(R.id.exitt);
        exit2.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                Button deepcorrec = (Button)findViewById(R.id.correc);
                Button deepincorrec = (Button)findViewById(R.id.incorrec);

                startActivity( new Intent(getApplicationContext(), Checking_Primee.class) );

                deepcorrec.setEnabled(true);
                deepincorrec.setEnabled(true);
            }
        }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_checking__prime, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}