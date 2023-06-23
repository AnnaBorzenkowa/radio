package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test

    public void  shouldSetStation() {
        Radio rad = new Radio(30);

        rad.setCurrentStation(20);

        int expected = 20;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test

    public void  shouldSetVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(58);

        int expected = 58;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio rad = new Radio();

        rad.setToMaxVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void shouldNotSetVolumeUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(4);
        rad.nextStation();

        int expected = 5;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNotSwitchNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void shouldSwitchPreviewStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.prevStation();

        int expected = 7;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNotSwitchPreviewStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.prevStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(8);
        rad.increaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.reduceVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldNotReduceVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }



}