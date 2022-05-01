var year= new Date().getFullYear();
var n=0;
document.write("The next 20 leap years are:<br>")
while(n<20){
    year+=1;
    if(year%4==0 && (year%100!=0 || year%400==0)){
        document.write(year+"<br>");
        n++;
    }
}