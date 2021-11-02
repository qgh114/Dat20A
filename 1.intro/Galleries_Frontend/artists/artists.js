fetch("http://localhost:8080/artists")
    .then(response => response.json())
    .then(result => {
        result.map(createArtistCard);


    });

const artistGalleryWrapper = document.getElementById("artist-gallery")

function createArtistCard(artist){

    console.log(artist);
    const artistElement =document.createElement("div");


    artistElement.innerHTML=`
    <p>${escapeHTML(artist.name)}</p>
    <p>${escapeHTML(artist.gender)}</p>
    `;

    artistGalleryWrapper.appendChild(artistElement);




}

function createNewArtist(){

    const name = document.getElementById("create-artist-name").value;
    const age = document.getElementById("create-artist-age").value;
    const nationality = document.getElementById("create-artist-nationality").value;
    const primaryStyle = document.getElementById("create-artist-primaryStyle").value;


    const newArtist = {
        name: name,
        age: Number(age),
        nationality: nationality,
        primaryStyle: primaryStyle
    };
    console.log(newArtist)

    fetch("http://localhost:8080/artists", {
        method: "POST",
        headers: {
            "Content-type": "application/json; charset=UTF-8"
        },
        body: JSON.stringify(newArtist)
    })
        .then(response => response.json())
        .then(result=> {
            console.log(result)
            createArtistCard(result)
        })




}

document.getElementById("create-artist-button").addEventListener("click", createNewArtist)

