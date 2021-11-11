const galleryFormParentDiv = document.getElementById("create-gallery-form");
const galleryFormExpandButton = document.getElementById("expand-gallery-form");

const createGalleryForm = `<div>
<h2>Create new gallery</h2>
<label>Name</label>
<input type="text" placeholder="Name" name="name of gallery">
<label>Location</label>
<input type="text" placeholder="Location" name="location of gallery">
<label>Owner</label>
<input type="text" placeholder="Owner" name="owner of gallery">
<label>Squarefeet</label>
<input type="text" placeholder="Squarefeet" name="squarefeet of gallery">
<button onclick="console.log('about to create a new gallery')"> Create new gallery</button>
</div>
`;

//document.getElementById("create-gallery-form").innerHTML = createGalleryForm;

function showGalleryForm(){
galleryFormExpandButton.style.display = "none";
document.getElementById("create-gallery-form").innerHTML = createGalleryForm;

}

function removeGalleryForm(){
galleryFormExpandButton.style.display = "block";
galleryFormParentDiv.innerHTML="";
}


function createGallery() {

    fetch(baseURL + "/galleries", {
        method: "POST",
        headers: { "Content-type": "application/json; charset=UTF-8" },
        body: JSON.stringify({
            name: "New hardcoded gallery",
            location: "Atlantis",
            owner: "Apollo"
        })
    }).then(response => response.json())
        .then(gallery => {
            createGalleryTableRow(gallery);
        });
}

document.getElementById("expand-gallery-form")
    .addEventListener("click", showGalleryForm);