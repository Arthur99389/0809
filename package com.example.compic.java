package com.example.compic.app;
imp o rt java.io.BufferedReader;
imp o rt java.io.IOException;
imp o rt java.io.InputStreamReader;
imp o rt java.net.HttpURLConnection;
imp o rt java.net.URL;
imp o rt java.util.ArrayList;
imp o rt javax.net.ssl.HttpsURLConnection;
p ub lic class Functions {
p ub lic int Count; //Число запросов
p ub lic int Delay;
StringBuilder log_=new StringBuilder();
p ub lic Long[] GetRequest(String s)
{
//Разбиваем строки на составляющие
String[] commands= s.split("\n");
ArrayList<Long> times = new ArrayList<Long>();
//Цикл по числу запусков теста
for(int i=0;i<Count;i++)
{
Long time= Long.valueOf(0);
//Цикл по переходам
for(int j=0;j<commands.length;j++)
{
//Суммируем время переходов
try {
time+=Test(commands[j]);
} catch (IOException e) {
e.printStackTrace();
}
}
times.add(time);
}
Object[] times_1=times.toArray();
Long[] arr_=new Long[times.size()];
for(int i=0;i<times_1.length;i++)
arr_[i]=(Long)times_1[i];
return arr_;
}
//Нагрузочный тест
private Long Test(String text) throws IOException {
Long st, en,dt;
dt= Long.valueOf(0);
//Оценка времени отклика
st = System.nanoTime();
//ОБъект перехода по URL
URL url = new URL(text);
//Открытие соединения
HttpURLConnection c o n=null;
try {
con=(HttpURLConnection) url.openConnection();
//Если все удачно
if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
//Если запрос выполнен удачно, читаем полученные данные
String res = new BufferedReader(new
InputStreamReader(con.getInputStream())).readLine();
//Добавляем в лог
log_.append(res);
st = System.nanoTime();
}
}
finally {
if(con!=null)
con.disconnect();
}
en = System.nanoTime();
dt=en-st;
return dt;
}
//Тест производительности
p ub lic double[] Profile(String s)
{
String[] commands= s.split("\n");
double[] vals=new double[commands.length];
//Моделирование производительности
for(int i=0;i<vals.length;i++)
vals[i]=(int)(10*Count*Math.random());
return vals ;
}
}
