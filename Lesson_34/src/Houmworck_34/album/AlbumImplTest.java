
package Houmworck_34.album;

import Houmworck_34.album.dao.AlbumImpl;
import Houmworck_34.album.model.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    private AlbumImpl album;

    @BeforeEach
    void setUp() {
        album = new AlbumImpl(10);
    }

    @Test
    void testAddPhoto() {
        Photo photo = new Photo(1, 1, "Title1", "url1", LocalDateTime.now());
        assertTrue(album.addPhoto(photo));
        assertEquals(1, album.size());
    }

    @Test
    void testRemovePhoto() {
        Photo photo = new Photo(1, 1, "Title1", "url1", LocalDateTime.now());
        album.addPhoto(photo);
        assertTrue(album.removePhoto(1, 1));
        assertEquals(0, album.size());
    }

    @Test
    void testUpdatePhoto() {
        Photo photo = new Photo(1, 1, "Title1", "url1", LocalDateTime.now());
        album.addPhoto(photo);
        assertTrue(album.updatePhoto(1, 1, "newUrl"));
        assertEquals("newUrl", album.getPhotoFromAlbum(1, 1).getUrl());
    }

    @Test
    void testGetPhotoFromAlbum() {
        Photo photo = new Photo(1, 1, "Title1", "url1", LocalDateTime.now());
        album.addPhoto(photo);
        assertNotNull(album.getPhotoFromAlbum(1, 1));
        assertNull(album.getPhotoFromAlbum(2, 1));
    }

    @Test
    void testGetAllPhotoFromAlbum() {
        Photo photo1 = new Photo(1, 1, "Title1", "url1", LocalDateTime.now());
        Photo photo2 = new Photo(1, 2, "Title2", "url2", LocalDateTime.now());
        album.addPhoto(photo1);
        album.addPhoto(photo2);
        assertEquals(2, album.getAllPhotoFromAlbum(1).length);
    }

    @Test
    void testGetPhotoBetweenDate() {
        LocalDateTime now = LocalDateTime.now();
        Photo photo1 = new Photo(1, 1, "Title1", "url1", now.minusDays(1));
        Photo photo2 = new Photo(1, 2, "Title2", "url2", now);
        album.addPhoto(photo1);
        album.addPhoto(photo2);
        assertEquals(2, album.getPhotoBetweenDate(now.toLocalDate().minusDays(1), now.toLocalDate()).length);
    }

    @Test
    void testSize() {
        assertEquals(0, album.size());
        album.addPhoto(new Photo(1, 1, "Title1", "url1", LocalDateTime.now()));
        assertEquals(1, album.size());
    }
}
