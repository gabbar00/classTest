package com.example.gabbar.myconverter;

import android.content.Intent;
import android.opengl.EGLExt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class third extends AppCompatActivity {
Button tb1;
Spinner tsv1,tsv2;
TextView ttv5,ttv1;
EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tb1=(Button)findViewById(R.id.tbt1);
        tsv1=(Spinner) findViewById(R.id.tsv1);
        tsv2=(Spinner) findViewById(R.id.tsv2);
        ttv5=(TextView) findViewById(R.id.ttv5);
        ttv1=(TextView) findViewById(R.id.ttv1);
        et1=(EditText) findViewById(R.id.tet1);
        final String []products = getResources().getStringArray(R.array.conveter);
        final String []temp = getResources().getStringArray(R.array.Temp);
        final String []time = getResources().getStringArray(R.array.Time);
        final String []area = getResources().getStringArray(R.array.Area);
        final String []volume = getResources().getStringArray(R.array.Volume);
        final String []length = getResources().getStringArray(R.array.Length);
        final String []mass = getResources().getStringArray(R.array.Mass);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_spinner_dropdown_item,
                products);
        final ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_spinner_dropdown_item,
                products);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_spinner_dropdown_item,
                temp);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_spinner_dropdown_item,
                time);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_spinner_dropdown_item,
                area);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_spinner_dropdown_item,
                volume);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_spinner_dropdown_item,
                length);
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_spinner_dropdown_item,
                mass);


        String news=getIntent().getStringExtra("string");
        switch (news){
            case "one":
                ttv1.setText("Conveter");
                tsv1.setAdapter(adapter);
                tsv2.setAdapter(adapter2);
                tb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
Double currency=Double.valueOf(et1.getText().toString());
                       String u =tsv1.getSelectedItem().toString();
                       String u1 =tsv2.getSelectedItem().toString();
                        if(et1.equals(""))  {
                            Toast.makeText(getBaseContext(),
                                    "Enter some Value In Above ",
                                    Toast.LENGTH_SHORT).show();
                        }else
                        if ((u.equals("INR(Indian Rupees)"))&&(u1.equals("USD(US Dollar)"))) {
                            Double result=currency*0.014;
                            ttv5.setText(String.valueOf(result));
                            }else
                        if ((u.equals("INR(Indian Rupees)"))&&(u1.equals("GBP(British Pound)"))) {
                            Double result=currency*0.0106;
                            ttv5.setText(String.valueOf(result));
                        } else
                        if ((u.equals("USD(US Dollar)"))&&(u1.equals("INR(Indian Rupees)"))) {
                            Double result1=currency*73;
                            ttv5.setText(String.valueOf(result1));
                        }    else
                        if ((u.equals("USD(US Dollar)"))&&(u1.equals("GBP(British Pound)"))) {
                            Double result1=currency*0.79;
                            ttv5.setText(String.valueOf(result1));
                        } else
                        if ((u.equals("GBP(British Pound)"))&&(u1.equals("INR(Indian Rupees)"))) {
                            Double result1=currency*93.87;
                            ttv5.setText(String.valueOf(result1));
                        }  else
                        if ((u.equals("GBP(British Pound)"))&&(u1.equals("USD(US Dollar)"))) {
                            Double result1=currency*1.28;
                            ttv5.setText(String.valueOf(result1));
                        } else
                        if ((u.equals("INR(Indian Rupees)"))&&(u1.equals("INR(Indian Rupees)"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..",Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                            }  else
                        if ((u.equals("USD(US Dollar)"))&&(u1.equals("USD(US Dollar)"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..",Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");

                        } else
                        if ((u.equals("GBP(British Pound)"))&&(u1.equals("GBP(British Pound)"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");

                        }
                        }
                });
                break;
            case "two":
                ttv1.setText("Temperature");
                tsv1.setAdapter(adapter3);
                tsv2.setAdapter(adapter3);
                tb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double temperature=Double.valueOf(et1.getText().toString());
                        String u =tsv1.getSelectedItem().toString();
                        String u1 =tsv2.getSelectedItem().toString();
                        if ((u.equals("Celsius"))&&(u1.equals("Fahrenheit"))) {
                            Double result1=(temperature*9)/5+32;
                            ttv5.setText(String.valueOf(result1+" "+" degree F"));
                        }else
                        if ((u.equals("Fahrenheit"))&&(u1.equals("Celsius"))) {
                            Double result1 = (temperature -32)*5/9;
                            ttv5.setText(String.valueOf(result1+" " +" degree C"));
                        }else
                            if ((u.equals("Fahrenheit"))&&(u1.equals("Fahrenheit"))) {
                                Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                                ttv5.setText("Both Can't Be Equal..");

                            }else
                            if ((u.equals("Celsius"))&&(u1.equals("Celsius"))) {
                                Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                                ttv5.setText("Both Can't Be Equal..");

                            }
                    }
                });
                break;
            case "three":
                ttv1.setText("Time");
                tsv1.setAdapter(adapter4);
                tsv2.setAdapter(adapter4);
                tb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double time=Double.valueOf(et1.getText().toString());
                        String u =tsv1.getSelectedItem().toString();
                        String u1 =tsv2.getSelectedItem().toString();
                        if ((u.equals("Miliseconds"))&&(u1.equals("Seconds"))) {
                            Double result1=time/1000;
                            ttv5.setText(String.valueOf(result1+" "+" Seconds"));
                        }else
                        if ((u.equals("Miliseconds"))&&(u1.equals("Minutes"))) {
                            Double result1=time/60000;
                            ttv5.setText(String.valueOf(result1+" "+" Minutes"));
                        }else
                        if ((u.equals("Miliseconds"))&&(u1.equals("Hours"))) {
                            Double result1=(time*2.778)/10000000;
                            ttv5.setText(String.valueOf(result1+" "+" Hours"));
                        }else
                        if ((u.equals("Seconds"))&&(u1.equals("Miliseconds"))) {
                            Double result1=time*1000;
                            ttv5.setText(String.valueOf(result1+" "+" Miliseconds"));
                        }else
                        if ((u.equals("Seconds"))&&(u1.equals("Minutes"))) {
                            Double result1=time/60;
                            ttv5.setText(String.valueOf(result1+" "+" Minutes"));
                        }else
                        if ((u.equals("Seconds"))&&(u1.equals("Hours"))) {
                            Double result1=time/3600;
                            ttv5.setText(String.valueOf(result1+" "+" Hours"));
                        }else
                        if ((u.equals("Minutes"))&&(u1.equals("Miliseconds"))) {
                            Double result1=time*60000;
                            ttv5.setText(String.valueOf(result1+" "+" Miliseconds"));
                        }else
                        if ((u.equals("Minutes"))&&(u1.equals("Seconds"))) {
                            Double result1=time*60;
                            ttv5.setText(String.valueOf(result1+" "+" Seconds"));
                        }else
                        if ((u.equals("Minutes"))&&(u1.equals("Hours"))) {
                            Double result1=time/60;
                            ttv5.setText(String.valueOf(result1+" "+" Hours"));
                        }else
                        if ((u.equals("Hours"))&&(u1.equals("Miliseconds"))) {
                            Double result1=time*3600000;
                            ttv5.setText(String.valueOf(result1+" "+" miliseconds"));
                        }else
                        if ((u.equals("Hours"))&&(u1.equals("Seconds"))) {
                            Double result1=time*3600;
                            ttv5.setText(String.valueOf(result1+" "+" Seconds"));
                        }else
                        if ((u.equals("Hours"))&&(u1.equals("Minutes"))) {
                            Double result1=time*60;
                            ttv5.setText(String.valueOf(result1+" "+" Minutes"));
                        } else
                            if ((u.equals("Miliseconds"))&&(u1.equals("Miliseconds"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                            }else
                            if ((u.equals("Seconds"))&&(u1.equals("Seconds"))) {
                                Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                                ttv5.setText("Both Can't Be Equal..");
                            }else
                            if ((u.equals("Minutes"))&&(u1.equals("Minutes"))) {
                                Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                                ttv5.setText("Both Can't Be Equal..");
                            }else
                            if ((u.equals("Hours"))&&(u1.equals("Hours"))) {
                                Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                                ttv5.setText("Both Can't Be Equal..");
                            }
                            }
                });
                break;
            case "four":
                ttv1.setText("Area");
                tsv1.setAdapter(adapter5);
                tsv2.setAdapter(adapter5);

                tb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double area=Double.valueOf(et1.getText().toString());
                        String u =tsv1.getSelectedItem().toString();
                        String u1 =tsv2.getSelectedItem().toString();
                        if ((u.equals("Square Kilometer"))&&(u1.equals("Hectares"))) {
                            Double result1=area*100;
                            ttv5.setText(String.valueOf(result1+" "+" Hectares"));
                        }else
                        if ((u.equals("Square Kilometer"))&&(u1.equals("Acres"))) {
                            Double result1=area*247.105;
                            ttv5.setText(String.valueOf(result1+" "+" Acres"));
                        } else
                        if ((u.equals("Hectares"))&&(u1.equals("Acres"))) {
                            Double result1=area*2.471;
                            ttv5.setText(String.valueOf(result1+" "+" Acres"));
                        }else
                        if ((u.equals("Hectares"))&&(u1.equals("Square Kilometer"))) {
                            Double result1=area/100;
                            ttv5.setText(String.valueOf(result1+" "+"Square Kilometer"));
                        }else
                        if ((u.equals("Acres"))&&(u1.equals("Square Kilometer"))) {
                            Double result1=area/247.105;
                            ttv5.setText(String.valueOf(result1+" "+"Square Kilometer"));
                        }else
                        if ((u.equals("Acres"))&&(u1.equals("Hectares"))) {
                            Double result1=area/2.471;
                            ttv5.setText(String.valueOf(result1+" "+" Hectares"));
                        } else
                        if ((u.equals("Square Kilometer"))&&(u1.equals("Square Kilometer"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        }else
                        if ((u.equals("Hectares"))&&(u1.equals("Hectares"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        }else
                        if ((u.equals("Acres"))&&(u1.equals("Acres"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        }
                        }
                });
                break;
            case "five":
                ttv1.setText("Volume");
                tsv1.setAdapter(adapter6);
                tsv2.setAdapter(adapter6);
                tb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double volume=Double.valueOf(et1.getText().toString());
                        String u =tsv1.getSelectedItem().toString();
                        String u1 =tsv2.getSelectedItem().toString();
                        if ((u.equals("Literes"))&&(u1.equals("Milliteres"))) {
                            Double result1=volume*1000;
                            ttv5.setText(String.valueOf(result1+" "+" Milliteres"));
                        }else
                            if ((u.equals("Literes"))&&(u1.equals("Cubic Meters"))) {
                            Double result1=volume/1000;
                            ttv5.setText(String.valueOf(result1+" "+" Cubic Meters"));
                        } else
                            if ((u.equals("Milliteres"))&&(u1.equals("Cubic Meters"))) {
                                Double result1=volume/1000000000;
                                ttv5.setText(String.valueOf(result1+" "+" Cubic Meters"));
                            }else
                            if ((u.equals("Milliteres"))&&(u1.equals("Literes"))) {
                                Double result1=volume/1000;
                                ttv5.setText(String.valueOf(result1+" "+" Literes"));
                            }else
                            if ((u.equals("Cubic Meters"))&&(u1.equals(" Literes"))) {
                                Double result1=volume*1000;
                                ttv5.setText(String.valueOf(result1+" "+" Literes"));
                            }else
                            if ((u.equals("Cubic Meters"))&&(u1.equals(" Milliteres"))) {
                                Double result1=volume/1000000000;
                                ttv5.setText(String.valueOf(result1+" "+" Milliteres"));
                            } else
                        if ((u.equals("Milliteres"))&&(u1.equals("Milliteres"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        }else
                            if ((u.equals("Literes"))&&(u1.equals("Literes"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        } else
                            if ((u.equals("Cubic Meters"))&&(u1.equals(" Cubic Meters"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        }
                    }
                });
                break;
            case "six":
                ttv1.setText("Length");
                tsv1.setAdapter(adapter7);
                tsv2.setAdapter(adapter7);
                tb1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Double length=Double.valueOf(et1.getText().toString());
                        String u =tsv1.getSelectedItem().toString();
                        String u1 =tsv2.getSelectedItem().toString();
                        if ((u.equals("Kilometers"))&&(u1.equals("Meter"))) {
                            Double result1=length*1000;
                            ttv5.setText(String.valueOf(result1+" "+" Meters"));
                        }else
                            if ((u.equals("Kilometers"))&&(u1.equals("Foot"))) {
                            Double result1=length*3280.84;
                            ttv5.setText(String.valueOf(result1+" "+" Foot"));
                        }else
                            if ((u.equals("Kilometers"))&&(u1.equals("Inch"))) {
                                Double result1=length*39370.079;
                                ttv5.setText(String.valueOf(result1+" "+" Foot"));
                            }else
                            if ((u.equals("Kilometers"))&&(u1.equals("Centimeter"))) {
                                Double result1=length*100000;
                                ttv5.setText(String.valueOf(result1+" "+" Centimeter"));
                            }else
                            if ((u.equals("Meter"))&&(u1.equals("Foot"))) {
                                Double result1=length*3.281;
                                ttv5.setText(String.valueOf(result1+" "+" Foot"));
                            }else
                            if ((u.equals("Meter"))&&(u1.equals("Kiltometers"))) {
                                Double result1=length/1000;
                                ttv5.setText(String.valueOf(result1+" "+" Kilometers"));
                            }else
                            if ((u.equals("Meter"))&&(u1.equals("Inch"))) {
                                Double result1=length*39.37;
                                ttv5.setText(String.valueOf(result1+" "+" Inch"));
                            }else
                            if ((u.equals("Meter"))&&(u1.equals("Centimeter"))) {
                                Double result1=length*100;
                                ttv5.setText(String.valueOf(result1+" "+" Centimeters"));
                            }else
                            if ((u.equals("Inch"))&&(u1.equals("Kiltometers"))) {
                                Double result1=length/39370.079;
                                ttv5.setText(String.valueOf(result1+" "+" Kilometers"));
                            }else
                            if ((u.equals("Inch"))&&(u1.equals("Meter"))) {
                                Double result1=length/39.37;
                                ttv5.setText(String.valueOf(result1+" "+" Meters"));
                            }else
                            if ((u.equals("Inch"))&&(u1.equals("Foot"))) {
                                Double result1=length/12;
                                ttv5.setText(String.valueOf(result1+" "+" Foot"));
                            }else
                            if ((u.equals("Inch"))&&(u1.equals("Centimeter"))) {
                                Double result1=length*2.54;
                                ttv5.setText(String.valueOf(result1+" "+" Centimeters"));
                            }else
                            if ((u.equals("Foot"))&&(u1.equals("Kiltometers"))) {
                                Double result1=length/3280.84;
                                ttv5.setText(String.valueOf(result1+" "+" Kilometers"));
                            }else
                            if ((u.equals("Foot"))&&(u1.equals("Meter"))) {
                                Double result1=length/3.281;
                                ttv5.setText(String.valueOf(result1+" "+" Meter"));
                            }else
                            if ((u.equals("Foot"))&&(u1.equals("Centimeter"))) {
                                Double result1=length*30.48;
                                ttv5.setText(String.valueOf(result1+" "+" Centimeters"));
                            }else
                            if ((u.equals("Foot"))&&(u1.equals("Inch"))) {
                                Double result1=length*12;
                                ttv5.setText(String.valueOf(result1+" "+" Inch"));
                            }else
                            if ((u.equals("Centimeter"))&&(u1.equals("Kilometers"))) {
                                Double result1=length/100000;
                                ttv5.setText(String.valueOf(result1+" "+" Kilometers"));
                            }else
                            if ((u.equals("Centimeter"))&&(u1.equals("Meter"))) {
                                Double result1=length/100;
                                ttv5.setText(String.valueOf(result1+" "+" Meters"));
                            }else
                            if ((u.equals("Centimeter"))&&(u1.equals("Inch"))) {
                                Double result1=length/2.54;
                                ttv5.setText(String.valueOf(result1+" "+" Inch"));
                            }else
                            if ((u.equals("Centimeter"))&&(u1.equals("Foot"))) {
                                Double result1=length/30.48;
                                ttv5.setText(String.valueOf(result1+" "+" Foot"));
                            }else
                                if ((u.equals("Kilometers"))&&(u1.equals("Kilometers"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        } else
                        if ((u.equals("Meter"))&&(u1.equals("Meter"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        } else
                            if ((u.equals("Inch"))&&(u1.equals("Inch"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        } else
                        if ((u.equals("Foot"))&&(u1.equals(" Foot"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        } else
                        if ((u.equals("Centimeter"))&&(u1.equals(" Centimeter"))) {
                            Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                            ttv5.setText("Both Can't Be Equal..");
                        }
                            }
                });
                break;
            case "seven":
                ttv1.setText("Mass");
                tsv1.setAdapter(adapter8);
                tsv2.setAdapter(adapter8);tb1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Double Mass=Double.valueOf(et1.getText().toString());
                    String u =tsv1.getSelectedItem().toString();
                    String u1 =tsv2.getSelectedItem().toString();

                    if ((u.equals("Kilogram"))&&(u1.equals("Gram"))) {
                        Double result1=Mass*1000;
                        ttv5.setText(String.valueOf(result1+" "+" gram"));
                    }else
                        if ((u.equals("Kilogram"))&&(u1.equals("Pound"))) {
                        Double result1=Mass*2.205;
                        ttv5.setText(String.valueOf(result1+" "+" pound"));
                    } else
                        if ((u.equals("Gram"))&&(u1.equals("Kilogram"))) {
                        Double result1=Mass/1000;
                        ttv5.setText(String.valueOf(result1+" "+" Kg"));
                    }else
                    if ((u.equals("Gram"))&&(u1.equals("Pound"))) {
                        Double result1=Mass/453.592;
                        ttv5.setText(String.valueOf(result1+" "+" Pound"));
                    } else
                    if ((u.equals("Pound"))&&(u1.equals("Kilogram"))) {
                        Double result1=Mass/2.205 ;
                        ttv5.setText(String.valueOf(result1+" "+" Kg"));
                    }else
                    if ((u.equals("Pound"))&&(u1.equals("Gram"))) {
                        Double result1=Mass*453.592;
                        ttv5.setText(String.valueOf(result1+" "+" gram"));
                    } else
                    if ((u.equals("Kilogram"))&&(u1.equals("Kilogram"))) {
                        Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                        ttv5.setText("Both Can't Be Equal..");
                    }else
                    if ((u.equals("Gram"))&&(u1.equals("Gram"))) {
                        Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                        ttv5.setText("Both Can't Be Equal..");
                    }else
                    if ((u.equals("Pound"))&&(u1.equals("Pound"))) {
                        Toast.makeText(getBaseContext(), "Both Can't Be Equal..", Toast.LENGTH_SHORT).show();
                        ttv5.setText("Both Can't Be Equal..");
                    }
                }
            });

                break;

        }

    }
}
