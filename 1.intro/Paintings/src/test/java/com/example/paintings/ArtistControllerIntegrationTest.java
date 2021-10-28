package com.example.paintings;

import com.example.paintings.Controllers.Artists;
import com.example.paintings.models.Artist;
import com.example.paintings.repositories.ArtistRepository;
import com.example.paintings.repositories.GalleryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.verification.VerificationModeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = Artists.class, excludeAutoConfiguration = SecurityAutoConfiguration.class)
public class ArtistControllerIntegrationTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private ArtistRepository artists;

    @MockBean
    private GalleryRepository galleries;

    @Test
    public void givenArtistWhenGetArtistThenReturnJsonArray() throws Exception{
        Artist artistOne = new Artist();
        Artist artistTwo = new Artist();
        Artist artistThree = new Artist();

        artistOne.setName("Jan");
        artistTwo.setName("JanJan");
        artistThree.setName("JanJanJan");

        List<Artist> allArtist = Arrays.asList(artistOne,artistTwo,artistThree);
/*
        given(artists.findAll().willReturn(allArtist));

        mvc.perform(get("/artists")
                .contentType(MediaType.APPLICATION_JSON)
                .andExpect(status().isOk())
                .andExpect(JsonPath("$", org.hamcrest.Matchers.hasSize(3)))
                .andExpect(JsonPath("$[0].name",is("Jan")))
                .andExpect(JsonPath("$[1].name",is("JanJan")))
                .andExpect(JsonPath("$[2].name",is("JanJanJan"))));

        verify(artists, VerificationModeFactory.times(1).findAll());
        reset(artists);

 */



    }
}
