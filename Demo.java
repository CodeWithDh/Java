import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:/Temporary Folder/Student Data.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);

            List<Student> students = new ArrayList<>();

            for (int i = 1; i < sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    Student student = new Student();

                    student.setRollNo(getCellStringValue(row, 0));
                    student.setSub1(getCellNumericValue(row, 1));
                    student.setSub2(getCellNumericValue(row, 2));
                    student.setSub3(getCellNumericValue(row, 3));
                    student.setSub4(getCellNumericValue(row, 4));
                    student.setSub5(getCellNumericValue(row, 5));
                    student.setAverage(getCellNumericValue(row, 6));
                    student.setResult(getCellStringValue(row, 7));
                    student.setGrade(getCellStringValue(row, 8));

                    students.add(student);
                }
            }

            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                    "RollNo", "Sub1", "Sub2", "Sub3", "Sub4", "Sub5", "Average", "Result", "Grade");
            for (Student student : students) {
                System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s %-10s\n",
                        student.getRollNo(), student.getSub1(), student.getSub2(),
                        student.getSub3(), student.getSub4(), student.getSub5(),
                        student.getAverage(), student.getResult(), student.getGrade());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getCellStringValue(Row row, int cellIndex) {
        Cell cell = row.getCell(cellIndex);
        if (cell != null) {
            switch (cell.getCellType()) {
                case STRING:
                    return cell.getStringCellValue();
                case NUMERIC:
                    return String.valueOf(cell.getNumericCellValue());
                default:
                    return "";
            }
        }
        return "";
    }

    private static double getCellNumericValue(Row row, int cellIndex) {
        Cell cell = row.getCell(cellIndex);
        if (cell != null && cell.getCellType() == CellType.NUMERIC) {
            return cell.getNumericCellValue();
        }
        return 0.0;
    }

    public static class Student {
        private String rollNo;
        private double sub1, sub2, sub3, sub4, sub5, average;
        private String result, grade;

        // Getters and Setters (complete implementation)
        public void setRollNo(String rollNo) {
            this.rollNo = rollNo;
        }

        public String getRollNo() {
            return rollNo;
        }

        public void setSub1(double sub1) {
            this.sub1 = sub1;
        }

        public double getSub1() {
            return sub1;
        }

        public void setSub2(double sub2) {
            this.sub2 = sub2;
        }

        public double getSub2() {
            return sub2;
        }

        public void setSub3(double sub3) {
            this.sub3 = sub3;
        }

        public double getSub3() {
            return sub3;
        }

        public void setSub4(double sub4) {
            this.sub4 = sub4;
        }

        public double getSub4() {
            return sub4;
        }

        public void setSub5(double sub5) {
            this.sub5 = sub5;
        }

        public double getSub5() {
            return sub5;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public double getAverage() {
            return average;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getResult() {
            return result;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return grade;
        }
    }
}