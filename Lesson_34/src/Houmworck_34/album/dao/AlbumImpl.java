
package Houmworck_34.album.dao;

import Houmworck_34.album.model.Photo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlbumImpl implements Album {
    private Photo[] photos;
    private int size;

    public AlbumImpl(int capacity) {
        this.photos = new Photo[capacity];
        this.size = 0;
    }

    @Override
    public boolean addPhoto(Photo photo) {
        if (size >= photos.length) {
            return false;
        }
        photos[size++] = photo;
        Arrays.sort(photos, 0, size); // Sort photos by date after addition
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                photos[i] = photos[--size];
                photos[size] = null;
                Arrays.sort(photos, 0, size); // Sort after removal
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId);
        if (photo != null) {
            photo.setUrl(url);
            return true;
        }
        return false;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        List<Photo> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId) {
                result.add(photos[i]);
            }
        }
        return result.toArray(new Photo[0]);
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        List<Photo> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            LocalDate photoDate = photos[i].getDate().toLocalDate();
            if ((photoDate.isEqual(dateFrom) || photoDate.isAfter(dateFrom)) &&
                (photoDate.isEqual(dateTo) || photoDate.isBefore(dateTo))) {
                result.add(photos[i]);
            }
        }
        return result.toArray(new Photo[0]);
    }

    @Override
    public int size() {
        return size;
    }
}
