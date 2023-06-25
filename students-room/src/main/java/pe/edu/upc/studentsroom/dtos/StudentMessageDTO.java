package pe.edu.upc.studentsroom.dtos;

public class StudentMessageDTO {

    private String studentName;
    private int messageCount;

    public StudentMessageDTO(String studentName, int messageCount) {
        this.studentName = studentName;
        this.messageCount = messageCount;
    }

    public StudentMessageDTO() {
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }
}
