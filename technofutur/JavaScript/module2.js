let monNombre = 42 //Affichera "number" dans la console
let myFirstText = "Hello there!" // Utilisation des guillemets
let mySecondText = 'Hello there!' // Utilisation de l'apostrophe
let myThirdText = 'Hello there! It\'s me' // Utilisation de l'antislash
let myBoolean = true // Type boolean

console.log(typeof monNombre) 
console.log(typeof myFirstText)
console.log(typeof mySecondText)
console.log(typeof myThirdText)
console.log(typeof myBoolean) 

/*------------------------------------------------------------------------------*/

let message = "This is a text!"
let message2 = 'This is more text!'
let message3 = "Hello " + "world"
let message4 = "Hello World"
message4 += " it's me!"
let message5 = 'It\'s amazing!'
let message6 = "Who are say \"YOLO\"?"
let message7 = 20 + 40

console.log(message)
console.log(message2)
console.log(message3)
console.log(message4)
console.log(message5)
console.log(message6)
console.log(message7)

try {
    let message8 = 'test'
    console.log(messag8) //code pouvant lever une exception/erreur

} catch(ex) {
    console.log('There are an error!') //traitement alternatif si une exception/erreur est levée
}

/*------------------------------------------------------------------------------*/

/*const valeur1 = prompt("Entrez le premier nombre")
const valeur2 = prompt("Entrez le second nombre")
document.write("Voici le total: " + (parseInt(valeur1) + parseInt(valeur2)))*/

/*------------------------------------------------------------------------------*/

let messagePart = "En programmation le message de base est \"Hello World\"";
        let messagePart2= "C'est couramment utilisé pour illlustrer un code de base";

        console.log(messagePart + "\n" + messagePart2);