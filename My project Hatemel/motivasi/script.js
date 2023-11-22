// script.js

function updateTime() {
  const clock = document.getElementById("clock");
  let time = new Date();
  let h = time.getHours().toString().padStart(2, "0");
  let m = time.getMinutes().toString().padStart(2, "0");
  let s = time.getSeconds().toString().padStart(2, "0");
  clock.innerText = `${h}:${m}:${s}`;
}

// Panggil updateTime setiap detik
setInterval(updateTime, 1000);

// Panggil updateTime untuk pertama kali saat halaman dimuat
updateTime();
