package com.example.paintings;

import com.example.paintings.models.Artist;
import com.example.paintings.repositories.ArtistRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ArtistRepositoryIntegrationTest {
    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private ArtistRepository artists;

    @Test
    public void whenFindByNameThenReturnArtist(){
        Artist artist = new Artist();
        artist.setName("Salvador Dali");
        testEntityManager.persist(artist);
        testEntityManager.flush();

        //Artist artistfound = artists.findByName("Salvador Dali");



    }
}
