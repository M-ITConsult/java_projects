/* class Personne {
    constructor(nom, age) {
      this.nom = nom;
      this.age = age;
    }
  
    saluer() {
      console.log(`Bonjour, je m'appelle ${this.nom} et j'ai ${this.age} ans.`);
    }
  } */

/*------------------------------------------------------------------------------*/

/*   const personne1 = new Personne('Jean', 25);
  personne1.s */

/*------------------------------------------------------------------------------*/

/* const personne = {
    nom: "Vanopbroeke",
    prenom: "Jérôme",
    saluer() {
             console.log(`Salut je suis ${this.prenom} ${this.nom}`)
   }
};

personne.saluer();  */

/*------------------------------------------------------------------------------*/

/* // Création de l'objet de données
const donnees = { nom: "Jean", age: 30 };

// Encodage de l'objet en chaîne JSON
const donneesJSON = JSON.stringify(donnees);

// Envoi de la chaîne JSON au serveur via une requête HTTP POST
// au moyen de la méthode fetch
fetch('/api/enregistrer-donnees', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: donneesJSON
})
.then(response => {
    console.log('Données enregistrées avec succès !');
})
.catch(error => {
    console.error('Une erreur s\'est produite lors de l\'enregistrement des données :', error);
}); */

/*------------------------------------------------------------------------------*/

/* class Calcul{
  constructor(val1, val2){
    this.nombre1 = val1
    this.nombre2 = val2
  }
}

const monObj = new Calcul(5,6)
console.log(monObj) */

/*------------------------------------------------------------------------------*/

/* class Calcul{
  constructor(val1, val2){
    this.nombre1 = val1
    this.nombre2 = val2
  }
  
  additionner(){
    return this.nombre1 + this.nombre2
  }
  
  soustraire(){
    return this.nombre1 - this.nombre2
  }
  
  diviser(){
    if(this.nombre2 !=0 ) return this.nombre1 / this.nombre2
    else return 0
  }
  
  multiplier(){
    return this.nombre1 * this.nombre2
  }
}

const monObj = new Calcul(5,12.2)
console.log(monObj)

let output ="";
output += `Nombre 1: ${monObj.nombre1} <br>`
output += `Nombre 2: ${monObj.nombre2} <br>`
output += `${monObj.nombre1} + ${monObj.nombre2} =  ${monObj.additionner()} <br>`
output += `${monObj.nombre1} - ${monObj.nombre2} =  ${monObj.soustraire()} <br>`
output += `${monObj.nombre1} x ${monObj.nombre2} =  ${monObj.multiplier()} <br>`
output += `${monObj.nombre1} / ${monObj.nombre2} =  ${monObj.diviser()} <br>`

document.write(output) */

/*------------------------------------------------------------------------------*/

let calculs = [];
        let logs = document.getElementById("logs");
    
        document.calculette.proceed.onclick = () => {
          let obj = {
            nombre1: Number(document.calculette.nombre1.value),
            nombre2: Number(document.calculette.nombre2.value),
            resultat : 0,
            addition(){
              this.resultat = this.nombre1 + this.nombre2
            },
            afficherResultat(){
              return `${this.nombre1} + ${this.nombre2} = ${this.resultat}`
            }
          }
          
          
          let output="";
          
          obj.addition()
          calculs.push(obj)
          
          calculs.forEach( x => output += x.afficherResultat() + "<br>")
          
          logs.innerHTML = output
          
        }