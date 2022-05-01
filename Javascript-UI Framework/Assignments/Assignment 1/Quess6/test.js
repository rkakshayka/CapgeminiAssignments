function print(list){
    document.write("*********<br>");
    for(i=0;i<list.length;i++)
        document.write("* "+list[i]+" *<br>");
    document.write("*********");
}

var list= ["Hello", "World", "in", "a", "frame"];
print(list)