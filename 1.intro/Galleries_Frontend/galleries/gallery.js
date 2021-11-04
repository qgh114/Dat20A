const queryString = window.location.search;
const URLParams = URLSearchParams(queryString);
const galleryId = URLParams.get("galleryId");

fetch( "http://localhost:8080/galleries/1")
.then(response => response.json())
.then(gallery => {
    document.getElementById("gallery-name").innerText = gallery.name;
    document.getElementById("gallery-owner").innerText = gallery.owner;
    document.getElementById("gallery-location").innerText = gallery.location
    document.getElementById("gallery-squarefeet").innerText = gallery.squarefeet;
});

