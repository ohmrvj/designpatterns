package Lab9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleTourTest {
    protected SingleTour nanTour;

    @BeforeEach
    public void initialize(){
        nanTour = new SingleTour("Nan",7000,35,10);
    }
    @Test
    void setNameTest(){
        assertEquals("Nan",nanTour.getName());
        nanTour.setName("NAN TOUR");
        assertEquals("NAN TOUR",nanTour.getName());
    }
    @Test
    void setPriceTest(){
        assertEquals(7000,nanTour.getPrice());
        nanTour.setPrice(9000);
        assertEquals(9000,nanTour.getPrice());

    }
    @Test
    void setAllSeats(){
        assertEquals(35,nanTour.getAllSeats());
        nanTour.setAllSeats(40);
        assertEquals(40,nanTour.getAllSeats());

    }
    @Test
    void setReservedSeatsTest(){
        assertEquals(10,nanTour.getReservedSeats());
        nanTour.setReservedSeats(8);
        assertEquals(8,nanTour.getReservedSeats());
    }
}