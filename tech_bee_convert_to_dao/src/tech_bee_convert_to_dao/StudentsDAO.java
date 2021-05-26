package tech_bee_convert_to_dao;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsDAO {

	ArrayList<Student> StudentclassRoom = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	StudentsDAO() {
		System.out.println("Welcome to JAVA SDET Class");
	}

	// CREATE New Student --> ADD
	public void addNewStudent(Student newStudent) {
		StudentclassRoom.add(newStudent);
	}

	// Add Student --> ADD
	public void addStudent(Student newStudent) {
		StudentclassRoom.add(newStudent);
	}

	// Remove Student --> ADD
	public boolean removeStudent(int removeId) {
		boolean status = false;
		for (int i = 0; i < StudentclassRoom.size(); i++) {
			if (StudentclassRoom.isEmpty()) {
				System.out.println("The list is empty");
			} else {
				for (Student st : StudentclassRoom) {
					if (st.getStudentId() == removeId) {
						System.out.println("You want to delete " + removeId + " id");
						StudentclassRoom.remove(st);
						status = true;
					}
				}
				if (!status) {
					System.out.println("The id " + removeId + " does not exist.");
				}

			}

		}
		return status;

	}

	// Update Student --> ADD
	public void updateStudent(int updateId) {

		for (int i = 0; i < StudentclassRoom.size(); i++) {
			if (StudentclassRoom.isEmpty()) {
				System.out.println("Student list is empty");
			} else {
				for (Student st : StudentclassRoom) {
					if (st.getStudentId() == updateId) {
						System.out.println("Enter update student name");
						// sc.nextLine();
						String updateName = sc.nextLine();
						st.setName(updateName);

						System.out.println("Enter update student last name");
						String updateLastName = sc.nextLine();
						st.setLastName(updateLastName);

						System.out.println("Enter update student email address");
						String updateEmailAddress = sc.nextLine();
						st.setEmailAddress(updateEmailAddress);

						System.out.println("Enter update student phone number");
						int updatePhoneNum = sc.nextInt();
						st.setPhoneNumber(updatePhoneNum);

						System.out.println("Enter update student ssn");
						int updateSsn = sc.nextInt();
						st.setSsn(updateSsn);

						System.out.println("Enter update student gpa");
						float updategpa = sc.nextFloat();
						st.setGpa(updategpa);

					}
				}
			}
		}

	}

	// READ Students
	public void displayStudents() {
		for (Student arrayItem : StudentclassRoom) {
			System.out.println("*************************************");
			System.out.println("Student Id: " + arrayItem.getStudentId());
			System.out.println("Student Name: " + arrayItem.getName());
			System.out.println("Student LastName: " + arrayItem.getLastName());
			System.out.println("Student Email Address: " + arrayItem.getEmailAddress());
			System.out.println("Student Phone Number: " + arrayItem.getPhoneNumber());
			System.out.println("Student SSN: " + arrayItem.getSsn());
			System.out.println("Student GPA: " + arrayItem.getGpa());
			System.out.println("*************************************");
			System.out.println();
		}
	}

	public void displayStudents(String name) {
		for (Student arrayItem : StudentclassRoom) {
			if (arrayItem.getName() == name) {
				System.out.println("Arraylist Item - " + arrayItem.getName());
			}
		}
	}

}
