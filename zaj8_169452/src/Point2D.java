public record Point2D(double x, double y) {
    public double distanceTo(Point2D otherPoint) {
        double distX = this.x() - otherPoint.x();
        double distY = this.y() - otherPoint.y();
        return Math.sqrt((distX * distX) + (distY * distY));
    }
}
