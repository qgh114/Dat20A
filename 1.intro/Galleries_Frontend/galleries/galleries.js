const galleriesTableBody = document.getElementById("galleries-tbody");

fetch(baseURL + "/galleries")
    .then(response => response.json())
    .then(galleries => {
        galleries.map(createGalleryTableRow);
    });

function createGalleryTableRow(gallery) {
    const galleryTableRow = document.createElement("tr");
    galleryTableRow.id = gallery.id;

    constructGalleryTableRow()



    galleryTableRow.innerHTML = `
            <td>
                <a href="./gallery.html?galleryId=${gallery.id}">
                    <p class="row-gallery-name">${escapeHTML(gallery.name)}</p>
                </a>
            </td>
            <td>
                <p class="row-gallery-location">${escapeHTML(gallery.location)}</p>
            </td>
            <td>
                <p class="row-gallery-owner">${escapeHTML(gallery.owner)}</p>
            </td>
            <td>
                <p class="row-gallery-square-feet">${escapeHTML(gallery.squareFeet.toString())}</p>
            </td>
            <td>
                <button id="update-button-${gallery.id}">🥯</button>            
            </td>           
            <td>
                <button onclick="deleteGallery(${gallery.id})">❌</button>            
            </td>
        `;

    galleriesTableBody.appendChild(galleryTableRow);

    document.getElementById(`update-button-${gallery.id}`)
        .addEventListener("click", () => updateGallery(gallery));
}
function constructGalleryTableRow(galleryTableRow, gallery){

    tableRowToUpdate.innerHTML = `
        <td>
            <input value="${escapeHTML(gallery.name)}">
        </td>
        <td>
            <input value="${escapeHTML(gallery.location)}">
        </td>
       <td>
            <input value="${escapeHTML(gallery.owner)}">
        </td>
       <td>
            <input value="${escapeHTML(gallery.squareFeet.toString())}">
        </td>
        <td>
            <button id="cancel-update-${gallery.id}">✖️</button>
            <button onclick="">✅</button>
        </td>
        <td>
            <button onclick="deleteGallery(${gallery.id})">❌</button>
        </td>
    `;

}

function deleteGallery(galleryId) {
    fetch(baseURL + "/galleries/" + galleryId, {
        method: "DELETE"
    }).then(response => {
        if (response.status === 200) {
            document.getElementById(galleryId).remove();
        } else {
            console.log(response.status);
        }
    });
}
