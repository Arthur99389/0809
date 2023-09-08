package com.example.compic.app;
imp o rt android.support.v7.app.AppCompatActivity;
imp o rt android.os.Bundle;
imp o rt android.widget.TextView;
p ub lic class Main3Activity extends AppCompatActivity {
@Override
protected vo id onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main3);
//Обработка данных результатов тестирования
// Run();
}
vo id Run()
{
Long[] res_=MainActivity.Result;
Do ub le mean= 0.0;
Do ub le min_=Double.MAX_VALUE;
Do ub le max_=Double.MAX_VALUE;
//Вычисление результатов
for(int i=0;i<res_.length;i++)
{
//Вычисление суммы
mean+=res_[i];
//Вычисление минимума
if(res_[i]<min_)
min_=Double.parseDouble(res_[i].toString());
//Вычисление максимума
if(res_[i]>max_)
max_=Double.parseDouble(res_[i].toString());
}
mean=(Double)mean/res_.length;
//Заполнение данных по минимуму
TextView text_= findViewById(R.id.textView);
text_.setText(Double.toString(min_));
//Заполнение данных по минимуму
text_= findViewById(R.id.textView2);
text_.setText(Double.toString(max_));
//Заполнение поля среднего значения
text_= findViewById(R.id.textView3);
text_.setText(Double.toString(mean));
}
}
