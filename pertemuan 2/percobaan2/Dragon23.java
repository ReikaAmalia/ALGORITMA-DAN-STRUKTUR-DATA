public class Dragon23 {
    
    int x = 0, y = 0, width = 20, height = 20;

    void moveLeft() {
        x--;
        printPosition();
        if (x < 0 || x > width) {
            detectCollision(x,y);
        }
    }

    void moveRight() {
        x++;
        printPosition();
        if (x < 0 || x > width) {
            detectCollision(x,y);
        }
    }

    void moveUp() {
        y++;
        printPosition();
        if (x < 0 || x > height) {
            detectCollision(x,y);
        }
    }    

    void moveDown() {
        y--;
        printPosition();
        if (x < 0 || x > width) {
            detectCollision(x,y);
        }
    }
    void detectCollision(int x, int y) {
        System.out.println("Game Over");
    }
    
    void printPosition() {
        System.out.printf("Position : (%d, %d)\n", x,y);
    }

}
