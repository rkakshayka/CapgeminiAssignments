//cd Intro_to_ES6/Lexical_this
var employee = {
    id: 1,
    greet: function () {
        var _this = this;
        setTimeout(function () { console.log(_this.id); }, 1000);
    }
};
employee.greet();
