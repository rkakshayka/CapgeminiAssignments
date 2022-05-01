function find(){
    var n= document.getElementById("id4").value;
    var sum=0;
    for(i=0;i<n;i++)
        sum+=Math.floor(Math.random() * 2);
    alert(sum/n);
}