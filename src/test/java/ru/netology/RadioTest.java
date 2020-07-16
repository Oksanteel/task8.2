package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldGoNextRadioStation() {
        Radio radio = new Radio();
        int radioStationBeforeNext = radio.getCurrentRadioStation();
        radio.nextRadioStation();
        assertEquals(radioStationBeforeNext+1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldGoNextMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldGoPreviousRadioStation() {
        Radio radio = new Radio();
        int radioStationAfterPrevious = radio.getCurrentRadioStation();
        radio.previousRadioStation();
        assertEquals(radioStationAfterPrevious-1, radio.getCurrentRadioStation());
    }

    @Test
    void shouldGoPreviousMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.previousRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio();
        int soundVolumeBeforeUp = radio.getCurrentSoundVolume();
        radio.volumeUp();
        assertEquals(soundVolumeBeforeUp+1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldGoMaxSoundVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(radio.getMaxSoundVolume());
        radio.volumeUp();
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio();
        int soundVolumeBeforeDown = radio.getCurrentSoundVolume();
        radio.volumeDown();
        assertEquals(soundVolumeBeforeDown-1, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldGoMinSoundVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(radio.getMinSoundVolume());
        radio.volumeDown();
        assertEquals(0, radio.getCurrentSoundVolume());
    }
}
