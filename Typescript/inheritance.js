"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(name) {
        this.name = name;
    }
    Employee.prototype.displayName = function () {
        console.log("My name is " + this.name);
    };
    return Employee;
}());
exports.Employee = Employee;
var EmployeeTest = /** @class */ (function (_super) {
    __extends(EmployeeTest, _super);
    function EmployeeTest(name, id) {
        var _this = _super.call(this, name) || this;
        _this.id = id;
        return _this;
    }
    return EmployeeTest;
}(Employee));
var kaushik = new EmployeeTest("Kaushik", 93);
