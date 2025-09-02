let currenttime=new Date();
console.log(currenttime);
let local=currenttime.toString();
console.log(local);
let hours=currenttime.getHours();
console.log(hours)
let minits=currenttime.getMinutes();
console.log(minits);
let Day=currenttime.getDay();
console.log(Day)


class Exam{
    constructor(personname){
        this.personname=personname;
        console.log(personname);
 }
}
let result=new Exam("john");


//getter-to get the value
//setter-to update the value
class Bank {
    constructor(initialamount = 0) {
        this._balance = initialamount;
    }
    
    get balance() {
        return this._balance;
    }
    
    set balance(amountdeposit) {
        if (amountdeposit > 0) {
            this._balance += amountdeposit;
        }
    }
}
let add = new Bank(10);
console.log(add);
add.balance = 300;
console.log(add.balance);


class Addition{
    static Math(a,b){
        return a+b
    }
}
console.log(Addition.Math(4,4))


// Import and Export modules
//Definition

//Export allows you to make variables,functions,or
//classes available to other files.

//Import allows you to bring those into another file.
//Used in modular javascript (ES6+)

//mathutils.js
export function add(a,b){
    return a+b;
}
export const pi=3.14;

//main.js
import{add,pi}from './mathutils.js';
console.log(add(10,20));//30
console.log(pi);//3.14


  
