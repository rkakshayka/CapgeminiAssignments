var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
var displayColors = function (message) {
    var colors = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        colors[_i - 1] = arguments[_i];
    }
    console.log(message);
    //     console.log(colors);
    for (var i in colors) {
        console.log(colors[i]);
    }
};
var message = "List of Colors";
var colorArray = ['Orange', 'Yellow', 'Indigo'];
displayColors.apply(void 0, __spreadArray([message], colorArray, false));
//displayColors(message, 'Red');
//displayColors(message, 'Red','Blue');
//displayColors(message, 'Red','Blue','Green');
