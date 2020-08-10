package Package1;

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane();
        Car car = new Car();
        Ship ship = new Ship();
        
        plane.price = 10000;
        plane.speed = 350;
        plane.year = 2010;
        plane.count_passengers = 140;
        plane.heihgt = 800;
        
        car.price = 35000;
        car.speed = 210;
        car.year= 2015;
        
        ship.price = 300000;
        ship.speed = 240;
        ship.year = 2018;
        ship.count_passengers = 250;
        ship.port_registration = "Murmansk";
        
        System.out.printf("Plane: \nprice:%d \nspeed:%d \nyear:%d \ncount passengers:%d \nheight:%d\n",
                plane.price, plane.speed, plane.year, plane.count_passengers, plane.heihgt
                );
        System.out.printf("\nCar: \nprice:%d \nspeed:%d \nyear:%d\n",
                car.price, car.speed, car.year
                );
        System.out.printf("\nShip: \nprice:%d \nspeed:%d \nyear:%d \ncount passengers:%d \nport of registration:%s\n",
                ship.price, ship.speed, ship.year, ship.count_passengers, ship.port_registration
                );
    }
}
