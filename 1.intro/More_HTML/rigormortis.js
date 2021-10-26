const characterGalleryDiv = document.getElementById("character-gallery");
let characters;
let filteredCharacters;
fetch("https://rickandmortyapi.com/api/character")
    .then(response => response.json())
    .then(result => {
        console.log(result);
        characters = result.results;
        filteredCharacters = characters;
        characters.map(character => createCharacterCard(character));
    });

function createCharacterCard(character) {
    const cardElement = document.createElement("div");
    const secureName ="hardCodedName"
    cardElement.innerHTML=`
    <img src="${escapeHTML(character.image)}">
    <p>${escapeHTML(character.name)}</p>
    <p>${escapeHTML(character.status)}</p>
    <p>${escapeHTML(character.species)}</p>
    `;
characterGalleryDiv.appendChild(cardElement)


    console.log(character);
}


function searchCharacters(){

const selectedStatus = document.getElementById("status-dropdown").value;
if (selectedStatus === "All"){
    filteredCharacters = characters;
    characterGalleryDiv.innerText = null;

characters.map(createCharacterCard)
} else {
    characterGalleryDiv.innerText = null;
    const filteredCharacters = characters.filter(character => character.status === selectedStatus);
    filteredCharacters.map(createCharacterCard);

}

}

function handleSearchName(event){
    characterGalleryDiv.innerText = null;
    filteredCharacters.filter(character => character.name.toLowerCase().includes(event.target.value))
        .map(createCharacterCard);

console.log("typing....", event.target.value)
}



document.getElementById("search").addEventListener("click", searchCharacters)

document.getElementById("name-search").addEventListener("input", handleSearchName)



