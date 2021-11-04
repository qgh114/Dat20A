const galleriesTableBody = document.getElementById("galleries-tbody");

fetch("http://localhost:8080/galleries")
    .then(response => response.json())
    .then(galleries => {
        galleries.map(gallery => {
            const galleryTableRow = document.createElement("tr");

            galleryElement.innerHTML = `
            <td>
            <p>${escapeHTML(gallery.name)}</p>
            </td>
            
           
            <td>
             <p>${escapeHTML(gallery.location)}</p>
            </td>
            
            
            <td>
            <p>${escapeHTML(gallery.owner)}</p>
            </td>
            
           
            <td>
            <p>${escapeHTML(gallery.squarefeet.toString())}</p>
            </td>
            
            <td>
            <button onclick="deleteGallery(${gallery.id})">❌</button>
            </td>
           
        `;

            galleriesTableBody.appendChild(galleryTableRow);
        });
    });

function deleteGallery(galleryId){
    console.log(galleryId)
}

const deleteButtons = document.getElementsByClassName("delete-gallery");
deleteButtons.map(button => button.addEventListener("click", () => console.log("A button was clicked")));

