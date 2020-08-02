
import java.sql.Blob;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class WordModel {

    private int id, pass;
    private String word, mean, spell, hashtag, type,sound;
    private Blob imageBlob;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getId() {
        return id;
    }

    public int getPass() {
        return pass;
    }

    public String getWord() {
        return word;
    }

    public String getMean() {
        return mean;
    }

    public String getSpell() {
        return spell;
    }

    public String getHashtag() {
        return hashtag;
    }

    public String getType() {
        return type;
    }

    public WordModel(int id, String word, String mean, String spell, String hashtag, String type) {
        this.id = id;
        this.word = word;
        this.mean = mean;
        this.spell = spell;
        this.hashtag = hashtag;
        this.type = type;
    }
}
