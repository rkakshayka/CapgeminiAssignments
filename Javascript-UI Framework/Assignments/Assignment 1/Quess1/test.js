function sum(){
    var n = document.getElementById("id1").value;
    var sum=0;
    
    for(i=1;i<=n;i++)
        sum+=i;

    alert("The sum is "+sum);
}