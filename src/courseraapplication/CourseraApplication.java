
package courseraapplication;

import courseraapplication.course.*;
import static courseraapplication.course.RegistrationStatus.AUDIT;
import static courseraapplication.course.RegistrationStatus.CERTIFICATE;
import courseraapplication.user.*;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class CourseraApplication {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        AssociatedList<Course> Courses = new AssociatedList<>();
        AssociatedList<Member> Members;
        AssociatedList<Specialization> Specializations;
        GregorianCalendar birth = new GregorianCalendar();
        birth.set(GregorianCalendar.YEAR,2000);
        birth.set(GregorianCalendar.MONTH,11);
        birth.set(GregorianCalendar.DAY_OF_MONTH,15);
        
           System.out.println(Courses);
        
      
        String str1[] = {"web dev","cool"};
        String str2[] = {"networks","cool"};
        String str3[] ={"having a basic understanding of qubits","quantum gates"};
        String str4[] ={"Ouissal Moumou","Fatima Lamiri"};
        
        Profile student = new Profile("Ouissal","Lamiri","Other","Tangier","student", "political sciences","high school",str1,str2);
        
       Member user= new Member("F.lamiri@aui.ma","goodPassword",student);
        
        GregorianCalendar sessionDay = new GregorianCalendar();
        sessionDay.set(GregorianCalendar.YEAR,2019);
        sessionDay.set(GregorianCalendar.MONTH,07);
        sessionDay.set(GregorianCalendar.DAY_OF_MONTH,12);
        
        Course ourCourse = new Course("this is about quantum computing", sessionDay, "Introduction to Quantum Computing", 
                "this course is not aout quantum mechanics",str3, str4, 1200, "AUI",3);
        
        Course ourCourse2 = new Course("this is about computer science", sessionDay, "Introduction to Computers", 
                "this course is not about quantum mechanics",str3, str4, 1200, "AUI",4);
        Course ourCourse3 = new Course("this is about quantum computing", sessionDay, "Microeconomics", 
                "this course is not about quantum mechanics",str3, str4, 1200, "AUI",2);
        Course ourCourse4 = new Course("this is about quantum computing", sessionDay, "Probability and statistics", 
                "this course is not about quantum mechanics",str3, str4, 1200, "AUI",3);
         Course ToSearch = new Course("this is for test", sessionDay, "Probability and statistics", 
                "this course ",str3, str4, 1200, "1337",2);
        System.out.println(ourCourse);
         System.out.println("this is the list before add:"+Courses);
        Courses.addElement(ourCourse3);
        Courses.addElement(ourCourse);
        Courses.addElement(ourCourse2);
        Courses.addElement(ourCourse4);
        System.out.println("this is the list after adding :\n"+Courses);
        Courses.removeElement(ourCourse3);
        System.out.println("this is the list after removing Microeconomics:\n"+Courses);
        Courses.modifyElement(ourCourse, ourCourse3);
        System.out.println("this is the list after Intro to Quantum computing  with Microeconomics:\n"+Courses);
        Courses.addElement(ourCourse);
        Courses.sortElement(new CourseTitleComparator());
        System.out.println("this is the list after adding intro to quantum and  sorting by title:\n"+Courses);
        List<Course> returned = new LinkedList<>();
        returned=Courses.searchElement(new CourseTitleComparator(), ToSearch);
        if(returned!=null){
        Iterator<Course> iter=returned.iterator();
        while(iter.hasNext())
             System.out.println(iter.next());
        }
      
       String name1="Introduction to Quantum Computing";
       String name2="Big Data";
         Iterator <Course> i= Courses.elements.iterator();
         int in=0;
       while(i.hasNext()){
           if(i.next().getTitle().equals(name1)){  
               Courses.elements.get(in).setTitle(name2);
           }
           in++;
       }
    System.out.println("this is :\n"+Courses);
        
        
        
        
        
        
        
        Specialization sp = new Specialization("al Akhawayn Univ","Computer Science"," this is computer science specialization","CapstoneProject",str1,70000);
        Registration[] registrations= new Registration[5];
        CourseRegistration[] courses= new CourseRegistration[3];
        CourseRegistration CR1= new CourseRegistration(ourCourse,AUDIT,false,87,user);
        courses[0] = CR1;
        registrations[0]=CR1;
        CourseRegistration CR2= new CourseRegistration(ourCourse2,AUDIT,true,80,user);
        registrations[1]=CR2;
        courses[1] = CR2;
        CourseRegistration CR3= new CourseRegistration(ourCourse3,CERTIFICATE,false,190,user);
        registrations[2]=CR3;
        CourseRegistration CR4= new CourseRegistration(ourCourse4,CERTIFICATE,false,96,user);
        registrations[3]=CR4;
        courses[2] = CR4;
        SpecializationRegistration SR= new SpecializationRegistration(sp,true,courses,AUDIT,true,90,user);
        registrations[4]=SR;
        System.out.println("Welcome Back to Coursera");
        int choice = 0;
        int flag=0;
        OUTER:
        while (choice!=6) {
            System.out.println("1)Print User Profile ");
            System.out.println("2) Print Course Info");
            System.out.println("3) log in");
            System.out.println("4) change passward ");
            System.out.println("5) forgot passward ");
            System.out.println("6) quit");
            System.out.println("7) Polymorphically call getGPA()");
            System.out.println("please make a choice:");
            choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(student.toString());
                    break;
                case 2:
                    System.out.println(ourCourse.toString());
                    break;
                case 3:
                    System.out.println("please enter your email");
                    String email = scanner.next();
                    System.out.println("please enter your password");
                    String pass = scanner.next();
                    if(user.authenticate(email,pass) == 1){
                        System.out.println("You are successfully authenticated");
                    }else{
                        System.out.println("Wrong Credentials");
                    }        break;
                case 4:
                    System.out.println("please enter your old password");
                    String oldPass = scanner.next();
                    System.out.println("please enter your new password");
                    String newPass = scanner.next();
                    
                    
                    try{
                        flag=user.changePass(newPass, oldPass) ;
                        if(flag==1){
                        System.out.println("Password changed successfully");
                    }else{
                        System.out.println("Failed operation");
                    } 
                    }catch(invalidPasswordException err){
                        System.err.println(err.getMessage()+err.printinstructions());
                    }finally{
                    }    
                    break;
                case 5:
                    System.out.println("please enter the code sent to your email");
                    int code = scanner.nextInt();
                    System.out.println("please enter your new password");
                    String newPasso = scanner.next();
                     try{
                     flag=user.forgotPass(code, newPasso);
                    }catch(invalidPasswordException err){
                        System.err.println(err.getMessage());
                    }finally{
                    if(flag==1){
                        System.out.println("Password changed successfully");
                    }else{
                        System.out.println("Failed operation");
                    } 
                   }
                      break;
                case 6:
                    break OUTER;
                case 7:
                    System.out.println("please enter a number from 0-4");
                    int index=scanner.nextInt();
                    System.out.println("----------------------------------------------------------");
                    try{
                        double gpa=registrations[index].getGPA();// polumorphic call
                        System.out.println(" user has a GPA of  :"+gpa);
                    }catch(invalidGradeexception err){
                        System.err.println(err.getMessage());
                    }
                    if (registrations[index] instanceof CourseRegistration ){
                        CourseRegistration temp= (CourseRegistration)registrations[index];
                        System.out.println("for the Course:"+ temp.getCourse().title);
                    }else if(registrations[index] instanceof SpecializationRegistration){
                        SpecializationRegistration temp= (SpecializationRegistration)registrations[index];
                        System.out.println("for the specialization: "+ temp.getSp().title);
                    }       System.out.println("----------------------------------------------------------");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
  }
