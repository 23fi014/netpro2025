let str = "Hello, World!";

function reverse(str) {
    return str.split("").reverse().join("");
} 

let reversed = reverse(str);
console.log(reversed);