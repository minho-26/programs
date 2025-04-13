import java.util.*;
import java.time.LocalDate;


class input_day{
int day=1;
int a = 1;

void enterDay(Scanner inp){
while(a==1){

System.out.print ("enter day = ");
day = inp.nextInt();

if (day <32 && day >0){
break;}
else {
System.out.println ("Enter a valid Date");
}
}
}
}

class input_month{
int month = 1;
int a = 1;
 
void enterMonth(Scanner inp){
while (a==1) {

System.out.print ("enter month = ");
month = inp.nextInt();

if (month<13 && month >0){
break;}

else{
System.out.println("enter a valid month");

}
}
}
}

class input_year {
int year = 1;
int a = 1;

void enterYear(Scanner inp){
while(a==1){
System.out.print ("enter year = " );
year = inp.nextInt();
if (year <=2025 && year >0){
break;}
else{
System.out.println ("enter a valid year");

}
}
}
}



public class ageCalculator {

LocalDate currentDate = LocalDate.now();
int curDay = currentDate.getDayOfMonth();
int curMonth = currentDate.getMonthValue();
int curYear = currentDate.getYear();

public void calculateAge(input_day getDay , input_month getMonth , input_year getYear){
int calDay = getDay.day;
int calMonth = getMonth.month;
int calYear = getYear.year;

if (calDay< curDay && calMonth < curMonth){
  int a = curYear- calYear;
  int b = curMonth -calMonth;
  int c = curDay - calDay;
System.out.print(" your age is " + a + "years " + b + "months " + c+ "days");
}

else if (calDay >curDay && calMonth >curMonth){
  int a = (curYear - 1) - calYear;
  int b = (curMonth+12) - calMonth;
  int c = (curDay+31) - calDay;
    System.out.print(" your age is " + a + "years " + b + "months " + c+ "days");
}

else if (calDay <curDay && calMonth >curMonth){
  int a = (curYear - 1) - calYear;
  int b = (curMonth+12) - calMonth;
  int c =  curDay - calDay;
    System.out.print(" your age is " + a + "years " + b + "months " + c+ "days");
}

else  {
  int a = curYear-calYear;
  int b = curMonth - calMonth;
  int c = (curDay + 31) - calDay;
    System.out.print(" your age is " + a + "years " + b + "months " + c+ "days"); 
}

}




public static void main(String [] args){

Scanner inp = new Scanner(System.in);

input_day getDay = new input_day();
input_month getMonth = new input_month();
input_year getYear = new input_year();
ageCalculator result = new ageCalculator();

System.out.println ("Enter your date of Birth");
        getDay.enterDay(inp);
        getMonth.enterMonth(inp);
        getYear.enterYear(inp);

System.out.println(" calculate age 'Y' or enter Date of birth again 'A' or exit 'Q; " );
String process = inp.next();

if (process.equalsIgnoreCase("y")) {
result.calculateAge(getDay,getMonth,getYear);

} else if (process.equalsIgnoreCase( "a")){
main (args);

} else { 
System.exit(0);
}

}
}