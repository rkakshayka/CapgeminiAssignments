let percentBonus = () => 0.1;
let getValue = function(value=10, bonus=value*percentBonus()){
    console.log(value+bonus);
    console.log(arguments.length);
};
getValue(); //arg length =0;
getValue(20); //arg length =1;
getValue(20,30); //arg length =2;
//getValue(undefined,30);