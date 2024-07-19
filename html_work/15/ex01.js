// let : 변경 가능한 함수
// const : 변경 불가능한 함수

const aa = document.getElementById("btn-min");
const bb = document.getElementById("btn-max");
const printDiv = document.getElementById("print-div");

const n1 = document.getElementById("num1");
const n2 = document.getElementById("num2");
const n3 = document.getElementById("num3");
const n4 = document.getElementById("num4");
const n5 = document.getElementById("num5");

function min() {
    // console.log(n1.value);
    const arr = [n1.value, n2.value, n3.value, n4.value, n5.value];
    let min = n1.value;
    for (let index = 0; index < arr.length; index++) {
        const element = arr[index];
        if (min > element)
            min = element;
    }
    printDiv.textContent = "min = " + min;
}

function max() {
    const arr = [n1.value, n2.value, n3.value, n4.value, n5.value];
    let max = n1.value;
    for (const key of arr) {
        if (max < key)
            max = key;
    }
    printDiv.textContent = "max = " + max;
}

aa.addEventListener('click', min)
bb.addEventListener('click', max)

printDiv.textContent = "Hello It's just a context."

const cc = 10;
let dd = 10;

// 이미 지정한 값 변경 불가능
// cc = 20;
dd = 30;

// console.log(dd);

for (let i = 0; i < 10; i++) {
    // console.log(i);
}

