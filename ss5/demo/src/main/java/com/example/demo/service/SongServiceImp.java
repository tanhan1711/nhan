package com.example.demo.service;

import com.example.demo.model.Song;
import com.example.demo.repository.BaseRepository;
import org.springframework.stereotype.Service;
import sun.swing.BakedArrayList;

import javax.persistence.EntityTransaction;
import java.util.List;
@Service
public class SongServiceImp implements SongService {
    @Override
    public List<Song> findAll() {
        List<Song> songs = BaseRepository.entityManager.createQuery("select s from  Song  s",Song.class).getResultList();
        return songs;
    }

    @Override
    public Song findById(int id) {
        Song song = BaseRepository.entityManager.find(Song.class,id);
        return song;
    }

    @Override
    public void save(Song song) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(song);
        entityTransaction.commit();
    }

    @Override
    public List<Song> searchName(String name) {
        return BaseRepository.entityManager.createQuery("select s from Song s where s.name like :name",Song.class).setParameter("name","%"+name+"%").getResultList();
    }

    @Override
    public void update(int id, Song song) {
        Song existingMusic = BaseRepository.entityManager.find(Song.class, id);
        if(existingMusic != null) {
            EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
            entityTransaction.begin();
            existingMusic.setName(song.getName());
            existingMusic.setArtist(song.getArtist());
            existingMusic.setCategory(song.getCategory());
            existingMusic.setLink(song.getLink());
            BaseRepository.entityManager.persist(existingMusic);
            entityTransaction.commit();
        }
    }

    @Override
    public void remove(int id) {

    }
}
