var myMap = new Map([
    ["fname", "Chandler"],
    ["lname", "Bing"]
]);
for (var _i = 0, _a = myMap.entries(); _i < _a.length; _i++) {
    var _b = _a[_i], key = _b[0], value = _b[1];
    console.log("".concat(key, " -> ").concat(value));
}
for (var _c = 0, _d = myMap.values(); _c < _d.length; _c++) {
    var value = _d[_c];
    console.log(value);
}
for (var _e = 0, _f = myMap.keys(); _e < _f.length; _e++) {
    var key = _f[_e];
    console.log(key);
}
