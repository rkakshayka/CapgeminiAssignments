var getRegvalue = function(){
    return 10;
}
console.log(getRegvalue());

const getArrowValue = (m,bonus) => 10*m+bonus;

console.log(getArrowValue(5,50));
console.log(typeof getArrowValue);
/*
const getArrowvalue = () => {
    return 10;
}
const getArrowvalue = m => {
    return m;
}
*/