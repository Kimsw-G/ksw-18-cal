const month = Number(document.querySelector("#month"));
const blank = Number(document.querySelector("#blank").value);
const end = Number(document.querySelector("#end").value);

let date = new Date();
let date_flag = 1;
date.setMonth(month);
date.setDate(date_flag);

console.log(blank)

for (let i = 0; i < 6; i++) {
    for (let j = 0; j < 5; j++) {
        let cal_class = `.cal-${i}-${j}`;
        let cal_div = document.querySelector(cal_class);
        if (i === 0 && j < blank) continue;
        cal_div.innerHTML = date.getDate().toString();
        date.setDate(++date_flag);
    }
}