import java.util.Scanner;
import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;

class Register{
	String name,phone,addr,emailid,pass;
	void writeintofile() {
		try {
		    FileWriter myWriter = new FileWriter("C:\\Users\\Aneri Thakkar\\file.txt",true);
		    
		    Scanner sc1 = new Scanner(System.in);
		    System.out.println("Enter your name:");
		    name = sc1.nextLine();
		    System.out.println("Enter your phone number:");
		    phone = sc1.nextLine();
		    System.out.println("Enter your address:");
		    addr = sc1.nextLine();
		    System.out.println("Enter your email id:");
		    emailid = sc1.nextLine();
		    System.out.println("Enter password:");
		    pass = sc1.nextLine();
		    myWriter.write(emailid+" ");
		    myWriter.write(pass+" ");
		    myWriter.write(name+" ");
		    myWriter.write(phone+" ");
		    myWriter.write(addr+" ");
		    myWriter.write("\n");
		    myWriter.close();
//		    System.out.println("Successfully wrote to the file.");
		  } 
		 catch (IOException e) {
//		    System.out.println("An error occurred.");
		    e.printStackTrace();
		  }
	}
	
	
}
class Log_in extends Register{
	String str;
	
	private String password;
	Scanner sc = new Scanner(System.in);
	int ct =0;
	void getter() {	
	System.out.println("Log in page");
	System.out.println("Enter user name:");
	str = sc.nextLine();
	System.out.println("Enter the password:");
	password = sc.nextLine();
	try {
		Scanner x;
		x = new Scanner(new File("C:\\Users\\Aneri Thakkar\\file.txt"));
		
		while(x.hasNextLine()) {
			String temp;
			String[] info;
			temp = x.nextLine();
			info = temp.split(" ");
			if(info[0].equals(str)&& info[1].equals(password)) ct++;
		}
		x.close();
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

class school{
	void schoolguide() {
		 Scanner s=new Scanner(System.in);
	        Scanner sc=new Scanner(System.in);
	        String  school_name,hobbies,specific,subject;
	        System.out.println("Enter your standard: ");
	        int a=sc.nextInt();
	        System.out.println("Enter your school name: ");
	        school_name=s.nextLine();
	        System.out.println("Enter your hobbies: ");
	        hobbies=s.nextLine();
	        System.out.println("Enter any one specific hobby in which you are more passionate about and have achieved something(Even if it's small): ");
	        specific=s.nextLine();
	        System.out.println("Are you intersted in\n1.Academics\n2.extra curricular activities\nchoose 1 or 2");
	        int b=sc.nextInt();
	        if(b==2){
	            if(specific.equalsIgnoreCase("cricket")||specific.equalsIgnoreCase("badminton")||specific.equalsIgnoreCase("chess")||specific.equalsIgnoreCase("kabadi")||specific.equalsIgnoreCase("hockey")){
	                System.out.println("You can make your career in "+specific+"field");
	            }
	            else if(specific.equalsIgnoreCase("Acting")){
	                System.out.println("Step 1: Take Acting Classes.\nStep 2: Earn a Bachelor's Degree.\nStep 3: Audition and Develop Skills.\nStep 4: Consider a Master's Program.\nStep 5: Find an Agent.");
	            }
	            else if(specific.equalsIgnoreCase("Dance")){
	                System.out.println("You can make your career in\nActing Coach.\nActor.\nArt Gallery Director.\nBroadcaster.\nCasting Director.\nChoreographer.\nCritic.\nCurator. ");
	            }
	            else if(specific.equalsIgnoreCase("singing")){
	                System.out.println("You can make your career in\nWedding singer. Wedding singers are performers who sing at weddings.\nCruise ship entertainer.\nClub singer.\nBand member.\nOpera singer.\nSongwriter.\nChoir singer.\nBackup singer.");
	            }
	            else if(specific.equalsIgnoreCase("writing")){
	                System.out.println("Step 1: Complete a Basic Education.\nStep 2: Complete a Writing Education/Bachelor's.\nStep 3: Find Areas of Interest.\nStep 4: Get Experience.\nStep 5: Get A Job.\nStep 6: Get a Master's Degree.");
	            }
	        }
	        else if(b==1){
	            if(a<=10){
	            System.out.println("Are you intersted in which subject ?");
	            subject=s.nextLine();
	            if(subject.equalsIgnoreCase("Science")||subject.equalsIgnoreCase("Maths")){
	                System.out.println("You can take SCIENCE after 10th");
	            }
	            else if(subject.equalsIgnoreCase("Aplied Maths")||subject.equalsIgnoreCase("economics")){
	                System.out.println("You can take COMMERCE after 10th");
	            }
	            else if(subject.equalsIgnoreCase("Language")||subject.equalsIgnoreCase("History")||subject.equalsIgnoreCase("literature")){
	               System.out.println("You can take ARTS after 10th"); 
	            }
	            }
	            else{
	                System.out.println("Are you studing in which stream\n1.SCIENCE\n2.COMMERCE\n3.ARTS\nchoose 1,2 or 3");
	                int n=sc.nextInt();
	                if(n==1){
	                    System.out.println("You can go for\nBE/B.Tech- Bachelor of Technology.\nB.Arch- Bachelor of Architecture.\nBCA- Bachelor of Computer Applications.\nB.Sc.- Information Technology.\nB.Sc- Nursing.\nBPharma- Bachelor of Pharmacy.\nB.Sc- Interior Design.\nBDS- Bachelor of Dental Surgery.");
	                }
	                else if(n==2){
	                    System.out.println("You can go for\nBachelor of Business Administration (BBA)\nBachelor of Business Administration � International Business (BBA-IB)\nBachelor of Business Administration � Computer Application (BBA-CA)\nIndustry Oriented Integrated Courses.\nChartered Accountancy.\nCompany Secretary (CS)");
	                }
	                else if(n==3){
	                    System.out.println("You can go for\nBachelor of Arts (B.A.)\nBachelor of Fine Arts (B.F.A.)\nBachelor of Business Administration (B.B.A.)\nIntegrated Law course (B.A + L.L.B.)\nBachelor of Journalism and Mass Communication (B.J.M.)\nBachelor of Fashion Design (B.F.D.)\nBachelor of Hotel Management (B.H.M.)");
	                }
	            }
	        }
	}
}

class college{
	void collegeguide() {
		Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String College_name,Branch_name,year,semester,Academics;
        String Company_name,Domain_name,exam_name,projects,hobbies,specific;
        System.out.println("You are in which College:");
        College_name=s.nextLine();
        System.out.println("You are in which Branch (B.tech,MBBS,B.Sc,B.Ca,B.pharm):");
        Branch_name=s.nextLine();
        System.out.println("You are currently in which year:");
        int a = sc.nextInt();
        System.out.println("You are in which semester:");
        int b = sc.nextInt();
         System.out.println("Enter your hobbies: ");
        hobbies=s.nextLine();
        
        System.out.println("Are you interested in \n1.Academics\n2.extra curricular activities\nchoose 1 or 2:");
        int c = sc.nextInt();
      if(c==1){
          if(Branch_name.equalsIgnoreCase("B.tech")){
        System.out.println("Have you done your Internship\nmade any Projects\npreparing for any Competitive_exam?");
        Academics=s.nextLine();
        if(Academics.equalsIgnoreCase("Internship")){
        System.out.println("You have done your Internship in which company:");
        Company_name=s.nextLine();
        System.out.println("Specify your domain:");
        Domain_name=s.nextLine();
        System.out.println("You can get a job in the domain you have worked");
        }
        
         else if(Academics.equalsIgnoreCase("Projects")){
         System.out.println("How many project you have done?");
         int d = sc.nextInt();
         System.out.println("You can submit your projects to your interested company and apply for a job in your specific interested domain:");
         }
         
         else if(Academics.equalsIgnoreCase("Competitive_exam")){
             System.out.println("Name of the exam according to your preferences(GATE,CAT,GPAT)");
             exam_name=s.nextLine();
             System.out.println("You can for higher studies :");
         }
          }
         else if(Branch_name.equalsIgnoreCase("MBBS")){
             System.out.println("You can go for\nObstetrics and Gynaecology.\nGeneral Surgery.\nENT.\nOphthalmology.\nTraumatology and Surgery.\nOrthopaedics.");
         }
         else if(Branch_name.equalsIgnoreCase("B.sc")){
             System.out.println("You can go for\nBSc Nursing.\nBSc Nutrition and Dietetics.\nB.Sc. ...\nBHMS course.\nBachelor of Pharmacy.\nBSc Psychology.\nBSc Forensic Science");
         }
         else if(Branch_name.equalsIgnoreCase("B.Ca")){
             System.out.println("You can go for\nMobile Application Developer.\nSoftware Developer.\nComputer System Analyst.\nSoftware Engineers or Programmer.\nDatabase Administrator.");
         }
         else if(Branch_name.equalsIgnoreCase("B.pharm")){
             System.out.println("You can go for\nAnalytical Chemist.\nFood and Drug Inspector.\nHospital Drug Coordinator.\nDrug Therapist.\nChemical Technician.\nDrug Technician.\nDrug Inspector.");
         } 
    }
    System.out.println("Enter any one specific hobby in which you are more passionate about and have achieved something(Even if it's small): ");
        specific=s.nextLine();
        if(c==2){
            if(specific.equalsIgnoreCase("cricket")||specific.equalsIgnoreCase("badminton")||specific.equalsIgnoreCase("chess")||specific.equalsIgnoreCase("kabadi")||specific.equalsIgnoreCase("hockey")){
                System.out.println("You can make your career in "+specific+"field");
            }
            else if(specific.equalsIgnoreCase("Acting")){
                System.out.println("Step 1: Take Acting Classes.\nStep 2: Earn a Bachelor's Degree.\nStep 3: Audition and Develop Skills.\nStep 4: Consider a Master's Program.\nStep 5: Find an Agent.");
            }
            else if(specific.equalsIgnoreCase("Dance")){
                System.out.println("You can make your career in\nActing Coach.\nActor.\nArt Gallery Director.\nBroadcaster.\nCasting Director.\nChoreographer.\nCritic.\nCurator. ");
            }
            else if(specific.equalsIgnoreCase("singing")){
                System.out.println("You can make your career in\nWedding singer. Wedding singers are performers who sing at weddings.\nCruise ship entertainer.\nClub singer.\nBand member.\nOpera singer.\nSongwriter.\nChoir singer.\nBackup singer.");
            }
            else if(specific.equalsIgnoreCase("writing")){
                System.out.println("Step 1: Complete a Basic Education.\nStep 2: Complete a Writing Education/Bachelor's.\nStep 3: Find Areas of Interest.\nStep 4: Get Experience.\nStep 5: Get A Job.\nStep 6: Get a Master's Degree.");
            }
        }

	}
}
class civil{
	void Display(){
		System.out.println("Roadmap for becoming Civil servant(IAS,IPS,etc.)\n");
		System.out.println("Step 1: complete schooling (clear SSC and HSC exams)\nStep 2: persue any graduation degree(note: one can apply for the exam in final year of the college also)\nStep 3: Prepare well for the UPSC exam which has primarily 3 stages:\n i) Preliminary Exam (objective)\n ii) Main Exam (written)\n iii) Interview (personality test).");
		System.out.println("Here is the list of coaching class which can help you to make your journey smooth.");
		System.out.println("1.Vajiram and Ravi in Delhi NCR\n2.The Prayas India in Mumbai\n3.Impact IAS acadamy in Tamil Nadu\n4.Akshar Academy in Gujarat\n5.ClearIAS onlice class\n6.Drishti IAS Online Coaching");
	}
}

class law extends civil{
	void Display() {
		System.out.println("In India one can study law at various levels:\n1. UG Law course\n2. PG Law course\n");
		System.out.println("Roadmap for UG law course:\n Step 1: Clear higher secondary school(10+2) or its equivalent exam from a recognised board with greater than 45% marks in aggregate.\n Step 2: law entrance exams conducted for admission in UG level law courses evaluate candidates on the basis of their aptitude/ knowledge on subjects such as General Knowledge, English, Mathematics (Numerical Ability), Logical Reasoning and Legal Aptitude\n");
		System.out.println("Roadmap for PG law course:\n Step 1: Complete graduation from a recognised university\n Step 2: law exams for PG level law courses comprise questions from subject areas such as Constitutional Law, Jurisprudence and other law subjects (Contract, Torts, Criminal Law, International Law, Environment Law and Human Rights Law, etc).\n");
		System.out.println("Some popular law entrance exams\n1. Common Law Admission Test(CLAT)\n2. All India Law Entrance Test(AILET)\n3. Law School Admission Test-India(LSAT India)\n");
		System.out.println("Here the list of some law colleges in India:");
		System.out.println("\tRank\t\t\tCollege name\t\t\t\tLocation");
		System.out.println("\t1.\t\tNational Law School of India\t\t\tBangalore");
		System.out.println("\t2.\t\tNational Law University\t\t\t\tDelhi");
		System.out.println("\t3.\t\tSymbiosis Law School\t\t\t\tPune");
		System.out.println("\t4.\t\tNALSAR University of Law\t\t\tHyderabad");
		System.out.println("\t5.\t\tGujarat National Law University\t\t\tGandhinagar");
		
	}
}

class engineering extends law{
	void Display(){
        System.out.println("Roadmap for engineering");
        System.out.println("Clear SSC (10th exam)");
        System.out.println("Take science with maths");
        System.out.println("In 12th give exam of HSC and JEE");
        System.out.println("\tAIR\tcollege\t\t\t\t\t\t\t\tcuttoff\t\tlocation");
        System.out.println("\t1\tIndian Institute of Technology (IIT) - Delhi.\t\t\t102\tIIT Delhi Main Rd,New Delhi");
        System.out.println("\t2\tIndian Institute of Technology (IIT) - Bombay.\t\t\t107\tPowai, Mumbai");
        System.out.println("\t3\tIndian Institute of Technology (IIT) - Kharagpur.\t\t285\tKharagpur, West Bengal");
        System.out.println("\t21\tNIT Trichy.\t\t\t\t\t\t\t781\tTiruchirappalli, Tamil Nadu");
        System.out.println("\t41\tNIT Rourkela.\t\t\t\t\t\t\t2091\tRourkela, Odisha");
        System.out.println("After engeneering you have 2 options\n1.placement\n2.masters");
        System.out.println("chosee 1 or 2");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==1){
            System.out.println("Enter 1 If you want to  do govenment job");
            System.out.println("Enter 2 If you want to do private job");
            int b=sc.nextInt();
            if(b==1){
            System.out.println("You have to give GATE exam");
            }
            else if(b==2){
                System.out.println("You can apply in oncampus or offcampus");
            }
        }
        else if(a==2){
            System.out.println("You can do Masters in technology(M.tech)");
            System.out.println("You can do Master of Business Administration(MBA)");
            System.out.println("you can do Master of Science(M.sc)");
            System.out.println("Enter 1 if you want to do masters in india\nEnter 2 if you want to do masters in abroad");
            int c=sc.nextInt();
            if(c==1){
                System.out.println("You have to give GATE exam");
            }
            else if(c==2){
                System.out.println("You have to give GRE exam");
            }
        }
    }
}


class medical extends engineering{
	void Display() {
		System.out.println("Roadmap for diving into medical field:");
		System.out.println("Step 1:Complete the 10th class\nStep 2:Select B group for further science study\nStep 3:Clear HSC board exam and NEET exams\nStep 4:Now your medical career depends upon the marks you get in these competative exams and field in which you want to persue your medical studies.");
		System.out.println("There are multiple career options in medical field such as:");
		System.out.println("1. MBBS(Bachelor of Medicine, Bachelor of Surgery)\n2. BDS(Bachelor of Dental Surgery)\n3. BAMS(Bachelor of Ayurvedic Medicine and Surgery)\n4. BHMS(Bachelor of Homeopathic Medicine and Surgery)\n5. BPT(Bachelor of Physiotherapy)\n6. Pharma D(Doctor of Pharmacy)\n7. BUMS(Bachelor of Unani Medicine and Surgery)\n8. BASLP(Bachelor in Audiology & Speech-Language Pathology)\n9. Veterinary Doctor\n10. Bsc Nursing(Bachelor of Science in Nursing)");
		System.out.println("To get into MBBS, BDS, BAMS, BHMS, the qualification in NEET exam is required. Other than these fields reguire good score in Gujcet and respective 12th board exam.");
		System.out.println("Here is the list of colleges for medical field:");
		System.out.println("\tRank\t\tcollege\t\t\t\t\t\t\tcutoff(AIR)\t\t\tlocation");
		System.out.println("\t1.\t\tAIIMS Delhi\t\t\t\t\t\t53\t\t\t\tDelhi");
		System.out.println("\t2.\t\tChristian Medical College\t\t\t\t159\t\t\t\tVellore");
		System.out.println("\t3.\t\tAmrita Institute of Medical Sciences & Research\t\t209\t\t\t\tKochi");
		System.out.println("\t4.\t\tArmed Forces Medical College\t\t\t\t198\t\t\t\tPune");
		System.out.println("\t5.\t\tBJ medical college\t\t\t\t\t630\t\t\t\tAhmedabad");
	}	
}

class commerce extends medical{
	void Display(){
        System.out.println("Roadmap for CA");
        System.out.println("Clear SSC (10th exam)");
        System.out.println("You have 2 options\n1.After 12th\n2.After Graduation");
        System.out.println("Enter 1 or 2");
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        if(d==1){
            System.out.println("You have to take commerce and pass 12th exam");
            System.out.println("Register in ICAI website");
            System.out.println("Give CA foundation entrance exam and score 50%");
            System.out.println("In CA Inter clear exams of group 1 and 2");
            System.out.println("Take ITSS traning of 3 years");
            System.out.println("In CA final clear exam of group 1 and 2");
        }
        else if(d==2){
            System.out.println("You have to take complete your graduation in any subject");
            System.out.println("You are graduated with 55% ? 1.YES or 2.NO");
            System.out.println("Enter 1 or 2");
            int e=sc.nextInt();
            if(e==1){
                System.out.println("You don't have to give entrance exam of CA foundation");
                System.out.println(" In CA final clear exam of group 1 and 2");
            }
            else if(e==2){
            System.out.println("Give CA foundation entrance exam and score 50%");
            System.out.println("In CA Inter clear exams of group 1 and 2");
            System.out.println("In CA final clear exam of group 1 and 2");
            }
        }
        System.out.println("Now you are CA");
        System.out.println("you can do job or buisness");
    }
}

class business extends commerce{
	void Display() {
		System.out.println("Roadmap for Entrepreneur: ");
        System.out.println("Clear SSC (10TH Bard Exam) ");
        System.out.println("Take any subject ");
        System.out.println("Clear HSC (12TH Board Exam)");
        System.out.println("Give any Competitive exam");
        System.out.println("Complete any Bachelor Degree in any field");
        System.out.println("Clear any of the given Exam to join MBA Program(CAT, CMAT, MAT)");
        System.out.println("Here the list of some MBA colleges in India:");
        System.out.println("\tRank\t\tcollege\t\t\t\t\t\tcuttoff\t\tlocation");
        System.out.println("\t1\tIndian Institute of Management (IIM)-Ahemdabad\t\t83.25\t\tAhemdabad");
        System.out.println("\t2\tIndian Institute of Management (IIM)-Banglore\t\t82.62\t\tBanglore");
        System.out.println("\t3\tManagment Development Institute (MDI)-Gurgaon\t\t64.7\t\tGurgaon");
        System.out.println("\t4\tIndian Institute of Management (IIM)-Raipur\t\t63.57\t\tRaipur");
        System.out.println("\t5\tSymbiosis Institute of Business Management (SIBM)-Pune\t61.97\t\tPune");
        System.out.println("After completing MBA you have two options\n1.Startup\n2.Job");
        System.out.println("You can choose any of the options");
	}
}

class teacher extends business{
	void Display() {
		System.out.println("Roadmap for teacher:");
        System.out.println("Clear HSC (10th Board exam):");
        System.out.println("Take any stream:");
        System.out.println("Clear HSC (12th Board exam):");
        System.out.println("Give any CUET,IPU CET Exams:");
        System.out.println("You can do Bachelor in Education(B.Ed) or Diploma in Education:");
        System.out.println("\tRank\t\tCollege\t\t\t\t\tCutoff\t\tlocation:");
        System.out.println("\t1\t\tLady Shri Ram College (LSR-Delhi)\t95.0\t\tDelhi");
        System.out.println("\t2\t\tMahatma Gandhi University\t\t94.0\t\tKottayam");
        System.out.println("\t3\t\tCalicut University\t\t\t93.0\t\tCalicut");
        System.out.println("\t4\t\tLovely Proffesional University\t\t92.50\t\tJalandhar");
        System.out.println("\t5\t\tAmity University\t\t\t90.50\t\tLucknow");
        System.out.println("After completing your Graduation you have two options\n1.Job\n2.masters");
        System.out.println("Choose 1 or 2");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            System.out.println("You can do a government job:");
            System.out.println("You can do a private job:");
        }
        else if(a==2){
            System.out.println("You can do masters in Delhi University(DU)");
            System.out.println("You can do masters in Maharshi Dayanand University(MDU)");
        }

	}

}
class professor  extends teacher{
	void Display() {
		  System.out.println("Roadmap for Professor :");
		  System.out.println("Clear SSC (10th Board Exam)");
		  System.out.println("Take any stream");
		  System.out.println("Clear HSC (12th Board exam)");
		  System.out.println("Pursue any of Degree in which you have interest");
		  System.out.println("Pursue a Master degree");
		  System.out.println("After pursuing Masters you have two options either go for Phd or give a NEET competitive exam");
		  System.out.println("Gain some practical experience");
		  System.out.println("Apply for a job in University or Schools");
	}
	
}
class architecture extends teacher{
	void Display() {
		System.out.println("Roadmap for Architect:");
        System.out.println("Clear SSC (10th Board exam):");
        System.out.println("Take scienec stream:");
        System.out.println("Clear HSC (12th Board exam):");
        System.out.println("Give any competive exam (JEE,AIEEE,NATA):");
        System.out.println("Earn a Bachelor degree in Bachelore of Architecture(B.Arch),Bachelor's in Engineering and Architectural Design,BA(Hons) in Interior Architecture and Design:");
        System.out.println("\tRank\t\tcollege\t\t\t\t\t\t\t\t\t\tcutoff\t\tlocation:");
        System.out.println("\t1\t\tIndian Institute of Technology (IIT-Roorkee)\t\t\t\t\t1408\t\tRoorkee");
        System.out.println("\t2\t\tNational Institute of Technolgy (NIT-Calicut)\t\t\t\t\t1413\t\tCalicut");
        System.out.println("\t3\t\tIndian Institute of Technolgy (IIT-Kharagpur)\t\t\t\t\t1419\t\tKharagpur");
        System.out.println("\t4\t\tSchool of Planning and Architecture (SPA-Delhi)\t\t\t\t\t1422\t\tDelhi");
        System.out.println("\t5\t\tIndian Institute of Engineering Science and Technology (IIEST-Shibpur)\t\t1433\t\tShibpur");
        System.out.println("After Bachelor in Architecture you have 2 options\n1.placement\n2.masters");
        System.out.println("Choose 1 or 2");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1)
        {
            System.out.println("You can get a job in Landscape Architect or Architectural Designer");
        }
        else if(a==2)
        {
            System.out.println("You can do masters in Maters in Architecture (M.Arch)");
        }
	}
}
class army extends architecture{
	void Display() {
		System.out.println("Roadmap for Army");
        System.out.println("select any of the option of your interest for getting path of it");
        System.out.println("1.10th pass");
        System.out.println("2.12th with PCM");
        System.out.println("3.Graduation");
        System.out.println("4.Mechanical/computer engineer");
        System.out.println("5.C certificate of NCC with 50% mark in graduation");
        System.out.println("6.Diploma or 12th pass");
        System.out.println("7.Graduation from a recognized institute/govenment servent");
        System.out.println("8.Age(32-40) minimum 11th pass");
        System.out.println("9.5 yrars in indian army and 12th pass");
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        switch(f){
            case 1: System.out.println("clear NDA exam");
                    System.out.println("SSB entry\nRecommended medical exam\nMerit list\nYou will be selected for army");
                    break;
            case 2: System.out.println("clear JEE main");
                    System.out.println("SSB entry\nRecommended medical exam\nMerit list\nYou will be selected for army");
                    break;
            case 3: System.out.println("Clear CDS exam");
                    System.out.println("SSB entry\nRecommended medical exam\nMerit list\nYou will be selected for army");
                    break;
            case 4: System.out.println("clear TGC/SSC(Tech) exam");
                    System.out.println("SSB entry\nRecommended medical exam\nMerit list\nYou will be selected for army");
                    break;
            case 5: System.out.println("clear NCC Exam");
                    System.out.println("SSB entry\nRecommended medical exam\nMerit list\nYou will be selected for army");
                    break;
            case 6: System.out.println("clear ACC exam");
                    System.out.println("SSB entry\nRecommended medical exam\nMerit list\nYou will be selected for army");
                    break;
            case 7: System.out.println("clear Territorial army's exam");
                    System.out.println("SSB entry\nRecommended medical exam\nMerit list\nYou will be selected for army");
                    break;
            case 8: System.out.println("clear PC (SL) exam");
                    System.out.println("SSB entry\nRecommended medical exam\nMerit list\nYou will be selected for army");
                    break;
            case 9: System.out.println("clear SCO exam");
                    System.out.println("SSB entry\nRecommended medical exam\nMerit list\nYou will be selected for army");
                    break;
        }
	}
}
class Student{
//	byte std;
	boolean a = true;
	Scanner s1 = new Scanner(System.in);
//	System.out.println("In which are you studying right now?");
	void guidance() {
//		System.out.println("In which are you studying right now?");
//		std = s1.nextByte();
		while(a) {
			int choice;
			System.out.println("How do you want see yourself in future?");
			System.out.println("1. Civil Servant(IAS,IPS,etc.)\n2. Lawyer\n3. Engineer\n4. Doctor(Medical field)\n5. CA(Commerce field)\n6. Entrepreneur(Business career)\n7. Teacher\n8. Professor\n9. Architect\n10. Army officer\n11. Exit");
			choice = s1.nextInt();
			switch(choice) {
				case 1 :civil c = new civil();
						c.Display();
						break;
				case 2 :law l = new law();
						l.Display();
						break;
				case 3 :engineering e = new engineering();
						e.Display();
						break;
				case 4 :medical m = new medical();
						m.Display();
						break;
				case 5 :commerce ca = new commerce();
						ca.Display();
						break;
				case 6 :business b = new business();
						b.Display();
						break;
				case 7 :teacher t = new teacher();
						t.Display();
						break;
				case 8 :professor p = new professor();
						p.Display();
						break;
				case 9 :architecture ar = new architecture();
						ar.Display();
						break;
				case 10: army arr = new army();
						 arr.Display();
						 break;
				case 11: a = false;
				 		break;
			}
			
			
		}
	}
}

class quiz {
	String[] ques = {"Q.1 Which is your favourite subject?\n1. a subject which has practical usecase\n2. a subject which you mug up and score good marks\n3. a subject which requires logic and brain storming\n4. a subject which helps people\n" ,"Q.2 Are you particularly interested in any of the below?\n1. Debt- financing\n2. Credit analysis\n3. Investing\n4. Infrastructure, energy and sustainability\n5. Selling financial products\n6. Not sure\n","Q.3 Which number logically follows this series:\n4 6 9 6 14 6 __\n1. 6\n2. 17\n3. 19\n4. 21\n", "Q.4 Would you rather work in a manner that is\n1. Spontaneous\n2. Scheduled\n", "Q.5 In normal working conditions are you more drawn to\n1. what you can see and touch(accept the condition and work aaccordingly)\n2. what you can envision and invent\n", "Q.6 In general do you tend  to be more\n1. serious and disciplined\n2. easy going and free spirited\n", "Q.7 What is more satisfying at work\n1. going with the flow \n2. organizing\n", "Q.8 If the first two statements below are true, is the third statement true?\nA) Mr. Brown's rabbits are grey.\nB) All grey creatures are kind.\nC) Mr. Brown's rabbits are unkind.\n1. C is true.\n2. C is false.\n", "Q.9 I am the kind of person who focuses on the small details\n1. Strongly disagree\n2. Disagree\n3. Neautral\n4. Agree\n5. Strongly agree\n", "Q.10 I can handle myself pretty well in a crisis\n1. Strongly disagree\n2. Disagree\n3. Neautral\n4. Agree\n5. Strongly agree\n"};
	int ans[] = new int[10];
	int eng,law,medi,ca,bus,ias,tea,job,arm = 0;
	Scanner scan = new Scanner(System.in);
	void test() {
		System.out.println("*******************Quiz(Personality Test)***************");
		for(int i=0;i<ques.length;i++) {
			System.out.println(ques[i]);
			System.out.println("Enter the answer:");
			ans[i] = scan.nextInt();
//			System.out.print("\033[H\033[2J");  
//			System.out.flush();  
			
		}
		for(int i=0;i<ques.length;i++) {
			switch(i) {
				case 0 : if(ans[0]==1) eng++;
						 else if(ans[0]==2) {
							 law++ ;
							 medi++;
						 }
						 else if(ans[0]==3) {
							 eng++;
							 ca++;
							 bus++;
						 }
						 else {
							 ias++;
							 medi++;
							 law++;
							 tea++;
						 }
						 break;
				case 1: if(ans[1]==4)eng++;
						else {
							bus++;
						}
						break;
				case 2: if(ans[2]==3)tea++;
						break;
				case 3: if(ans[3]==1)eng++;
						else tea++;
						break;
				case 4: if(ans[4]==1)job++;
						else bus++;
						break;
				case 5: if(ans[5]==1)arm++;
						else bus++;
						break;
				case 6: if(ans[6]==1)job++;
						else bus++;
						break;
				case 7: if(ans[7]==2) {
							bus++;
							law++;
						}
						break;
				case 8: if(ans[8]==1 || ans[8]==2) tea++;
						else if(ans[8]==3)law++;
						else {
							eng++;
							medi++;
							ca++;
						}
						break;
				case 9: if(ans[9]==3)ca++;
						else if(ans[9]==1 || ans[9]==2)tea++;
						else {
							arm++;
							medi++;
							eng++;
							bus++;
						}
						break;		
			}		
		}
//		System.out.println(eng);
		System.out.println("*****************Result of the Quiz**************");
		System.out.println("These are the career fields which suits you according to your responses:");
		if(eng>=3) {
			System.out.println("Engineering");
		}
		if(law>=2) {
			System.out.println("Lawyer");
		}
		if(medi>=2) {
			System.out.println("Medical");
		}
		if(ca>=2) {
			System.out.println("CA(Commerce)");
		}
		if(bus>=5) {
			System.out.println("Business/start up");
		}
		if(ias==1) {
			System.out.println("Civil Servant(IAS,IPS,etc.)");
		}
		if(tea>=3) {
			System.out.println("Teacher");
		}
		if(job>=1) {
			System.out.println("Job");
		}
		if(arm>=1) {
			System.out.println("Army Officer");
		}		
	}

}

public class Project {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		boolean x = true;
		int option;
		int c;
		System.out.println("**********Welcome to Career Analysis System************");
		File newfile = new File("C:\\Users\\Aneri Thakkar\\file.txt");
		
		try {
			newfile.createNewFile();
//			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			System.out.println("file not created");
			e.printStackTrace();
		}
			while(b) {			
			int t;
			System.out.println("Enter 1 to register");
			System.out.println("Enter 2 to log in");
			System.out.println("Enter 0 to exit");
			t = sc.nextInt();
			switch(t) {
				case 1: Register r = new Register();
						r.writeintofile();
						break;
				case 2: Log_in p1 = new Log_in();
						p1.getter();
						
						if(p1.ct!=0) {

							System.out.println("Logged in, Welcome!!");
							while(x) {
								System.out.println("Enter 1 for suggestion of career field on the basis of your background.");
								System.out.println("Enter 2 for getting roadmap for particular career field.");
								System.out.println("Enter 3 if you can't figure out which field suits you.(We will suggest the career fields according to your personality)");
								System.out.println("Enter 4 to exit.");
								option = sc.nextInt();
								switch(option) {
									case 1: System.out.println("Enter 1 if you are in school and 2 if are in college.");
											c = sc.nextInt();
											if(c == 1) {
												school obs = new school();
												obs.schoolguide();
											}
											else {
												college obc = new college();
												obc.collegeguide();
											}
											break;
									case 2: Student s = new Student();
											s.guidance();
											break;
									case 3: quiz q = new quiz();
											q.test();
											break;
									case 4: x = false;
											b = false;
											System.out.println("***************Thank you for visiting***************");
											break;
									default: System.out.println("Enter appropriate input.");
								}
							}
							
							
						}	
						else {
							System.out.println("Wrong UserId or Password, Try again!!");
						}
						break;
				case 0: b = false;
						System.out.println("***************Thank you for visiting***************");
						break;
				default: System.out.println("Enter appropriate input.");
				
			}
		}		
	
	}
}
