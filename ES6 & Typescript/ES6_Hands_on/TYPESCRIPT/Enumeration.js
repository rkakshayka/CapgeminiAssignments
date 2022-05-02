var EyeColor;
(function (EyeColor) {
    EyeColor[EyeColor["Brown"] = 1] = "Brown";
    EyeColor[EyeColor["Black"] = 5] = "Black";
    EyeColor[EyeColor["Blue"] = 10] = "Blue";
})(EyeColor || (EyeColor = {}));
;
var myEyeColor = EyeColor.Brown;
console.log(myEyeColor);
console.log(EyeColor[myEyeColor]);
