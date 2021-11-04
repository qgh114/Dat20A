fetch("http://localhost:8080/artists")
    .then(response => response.json())
    .then(result => {
        result.map(createArtistCard);
    });





const artistGalleryWrapper = document.getElementById("artist-gallery")

function createArtistCard(artist){

    console.log(artist);
    const artistElement = document.createElement("div");


    artistElement.innerHTML=`
    <p>${escapeHTML2(artist.name)}</p>
    <p>${escapeHTML2(artist.gender)}</p>
    `;

    artistGalleryWrapper.appendChild(artistElement);

}





function createNewArtist() {
    const name = document.getElementById("create-artist-name").value;
    const age = document.getElementById("create-artist-age").value;
    const image = document.getElementById("create-artist-image").value;
    const gender = document.getElementById("create-artist-gender").value;

    const newArtist = {
        name: name,
        age: Number(age),
        image: image,
        gender: gender
    };


    fetch("hhtp:/localhost:8080/artists", {
        method: "POST",
        headers: {
            "Content-type": "application/json; charset=UTF-8"
        },
        body: JSON.stringify(newArtist)
    })
        .then(response => {
            if (response.status === 200) {
                createArtistCard(newArtist);
            } else {
                console.log("Artist not created.", response.status);
            }
        })
        .catch(error => console.log("Network related error", error));

}

document.getElementById("create-artist-button")
    .addEventListener("click", createNewArtist);

