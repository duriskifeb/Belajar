const symbols = ["🍒", "🍊", "🍇", "🍈", "🍋"];

function spin() {
  const slot1 = document.getElementById("slot1");
  const slot2 = document.getElementById("slot2");
  const slot3 = document.getElementById("slot3");

  const randomSymbol1 = symbols[Math.floor(Math.random() * symbols.length)];
  const randomSymbol2 = symbols[Math.floor(Math.random() * symbols.length)];
  const randomSymbol3 = symbols[Math.floor(Math.random() * symbols.length)];

  slot1.innerText = randomSymbol1;
  slot2.innerText = randomSymbol2;
  slot3.innerText = randomSymbol3;

  if (randomSymbol1 === randomSymbol2 && randomSymbol2 === randomSymbol3) {
    alert("Congratulations! You won!");
  } else {
    alert("Try again. Good luck!");
  }
}
