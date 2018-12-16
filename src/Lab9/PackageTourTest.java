package Lab9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackageTourTest {
    PackageTour thailand = new PackageTour("Thailand");
    SingleTour bangkok;
    SingleTour lampang;

    @BeforeEach
    void setUp() {
        bangkok = new SingleTour("Bangkok",80000,15,6);
        lampang = new SingleTour("Lampang",120000,10,6);
        thailand.newTour(bangkok);
        thailand.newTour(lampang);

    }

    @Test
    void newTour() {
        SingleTour Rayong = new SingleTour("Rayong",100000,10,6);
        assertEquals(2,thailand.allTour());
        thailand.newTour(Rayong);
        assertEquals(3,thailand.allTour());
    }

    @Test
    void cancelTour() {
        assertEquals(2,thailand.allTour());
        thailand.cancelTour(bangkok);
        assertEquals(1,thailand.allTour());
    }

    @Test
    void getName() {
        assertEquals("Thailand",thailand.getName());
    }

    @Test
    void getPrice() {
        assertEquals(180000,thailand.getPrice());
    }

    @Test
    void getAvailableSeats() {
        assertEquals(4,thailand.getAvailableSeats());

    }



}