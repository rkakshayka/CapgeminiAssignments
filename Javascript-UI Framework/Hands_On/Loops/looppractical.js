var links = document.getElementsByTagName("a");

for(i = 0; i < links.length; i++){
    
    // it will add classname in all anchor tags in console.
    links[i].className = "link-" + i;

    // in console.
    // <a href="#" class ="link-0">Link 0</a>
}