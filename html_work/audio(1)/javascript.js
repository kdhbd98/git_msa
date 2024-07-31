// Optional JavaScript to enhance the glitch effect
// Adding randomness to the glitch effect

const glitchText = document.querySelector('.glitch');

setInterval(() => {
  glitchText.style.transform = `translate(${Math.random() * 10 - 5}px, ${Math.random() * 10 - 5}px)`;
}, 100);
