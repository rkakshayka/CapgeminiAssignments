function square(x){
    return x*x;
}

function double(x){
    return x*2;
}

function composedvalue(f1, f2, x){
    return f1(f2(x));
}

document.write(composedvalue(square, double, 10));