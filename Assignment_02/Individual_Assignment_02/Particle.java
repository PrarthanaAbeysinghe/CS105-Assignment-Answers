public class Particle {
 // declare instance variables
 double x, y, z;
 double distance_to_origin;
 
 Particle() {
  // generate random numbers between 0 and 100
  // assign generated values to instance variables;
  this.x = Math.random() * 100;
  this.y = Math.random() * 100;
  this.z = Math.random() * 100;
  this.calculateDistanceToOrigin();
 }
 
 // constructor overloading
 Particle(double x, double y, double z) {
  this.x = x;
  this.y = y;
  this.z = z;
  this.calculateDistanceToOrigin();
 }
 
 void calculateDistanceToOrigin() {
  this.distance_to_origin = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
 }
 
 // construct a separate method to display particle coordinates
 void displayParticleInfo() {
  System.out.println("Location: (" +x +", " +y +", " +z +")");
  System.out.println("Distance to the origin: " +distance_to_origin);
  System.out.println();
 }
 
 // locate the current position of the particle
 void moveParticlePosition(double x_dist, double y_dist, double z_dist) {
  this.x = this.x + x_dist;
  this.y = this.y + y_dist;
  this.z = this.z + z_dist;
  
  System.out.println("--- After moving the particle ---");
  // call methods to calculate and display the changes when move a particle to another location
  this.calculateDistanceToOrigin();
  this.displayParticleInfo();
 }
 
 // overloading method
 void moveParticlePosition() {
  this.x = this.x + Math.random() * 10;
  this.y = this.y + Math.random() * 10;
  this.z = this.z + Math.random() * 10;
  
  System.out.println("--- After moving the particle ---");
  // call methods to calculate and display the changes when move a particle to another location
  this.calculateDistanceToOrigin();
  this.displayParticleInfo();
 }

 public static void main(String[] args) {
  // define a particle instance
  // Particle p1 = new Particle(2.0, 4.0, 5.0);
  
  // calculate the distance from the origin
  // p1.calculateDistanceToOrigin();
  
  // call displayParticleInfo method
  // p1.displayParticleInfo();
  
  // move the particle p1 to a random location
  // p1.moveParticlePosition(2, 2, 2);
  
  // create a new particle instance
  // Particle p2 = new Particle(1, 1, 1);
  // to check the distance to the origin
  // System.out.println(p2.distance_to_origin);
  
  // solutions for vi, vii:
  Particle particle1 = new Particle(43.1, 58.8, 11.3);
  Particle particle2 = new Particle();
  Particle particle3 = new Particle();
  
  // display the particle information
  particle1.displayParticleInfo();
  particle2.displayParticleInfo();
  particle3.displayParticleInfo();
  
  // move particle3 by (23.1,57.2,1.04)
  particle3.moveParticlePosition(23.1, 57.2, 1.04);
  
  // move particle1 by random distance
  particle1.moveParticlePosition();
  
  
 }

}
