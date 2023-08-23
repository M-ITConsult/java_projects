/* let bouton = document.querySelector('#mon-bouton');

bouton.addEventListener('click', function() {
  // code à exécuter lorsqu'un clic est effectué sur le bouton
});
 */

/*------------------------------------------------------------------------------*/

/* const add = function(x, y) {
    return x + y;
  };
  
  console.log(add(2, 3)); // affiche 5 */

/*------------------------------------------------------------------------------*/
/* 
const multiply = (x, y) => x * y;

console.log(multiply(2, 3)); // affiche 6
 */
/*------------------------------------------------------------------------------*/

/* let element = document.querySelector("input")

element.addEventListener("keyup", () => {
	console.log("key up sur l'input")
}) */

/*------------------------------------------------------------------------------*/

/* let element = document.querySelector("input")

element.addEventListener("keyup", (e) => {
	console.log("key up sur l'input")
        console.log(e)
})
 */

/*------------------------------------------------------------------------------*/

/* let element = document.querySelector("input")

element.addEventListener("keyup", (e) => {
        console.log(e.target.value)
}) */

/*------------------------------------------------------------------------------*/

let element = document.querySelector('div')   
//on prend le 1er div de la page

element.onclick = () => console.log("div clicked")
//On ajoute un listener sur le div qui log "div clicked" en console

/*------------------------------------------------------------------------------*/
