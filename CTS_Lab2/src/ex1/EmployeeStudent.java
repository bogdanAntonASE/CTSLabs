package ex1;

public class EmployeeStudent {
    int salaryPerHour;
    int hours;

    public void reportHours(int addedHours) {
        hours += addedHours;
    }

    public int getFullSalary() {
        return hours * salaryPerHour;
    }

    public String getExam(int examNumber) throws Exception {

        String[] exams = {Constants.EXAM_OOP, Constants.EXAM_JAVA, Constants.EXAM_SDD, Constants.EXAM_CSHARP, Constants.EXAM_STATS};

        if (examNumber <= exams.length && examNumber > 0) {
           return exams[examNumber];
        }
        else {
            throw new ExamException(Constants.EXAM_EXCEPTION);
        }
    }
}