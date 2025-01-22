
public class GradeCalculator {
private float Math;
private float Computer;
private float English;

GradeCalculator (float Math, float Computer, float English){
    this.Math = Math;
    this.Computer = Computer;
    this.English = English;
}
void calculateMarks() {
    System.out.println("Average Marks: "+ ((Math + English + Computer)/3));
}
}