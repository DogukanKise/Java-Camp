
public class Main {

	public static void main(String[] args) {
		Lessons lesson1 = new Lessons(1, "Java Courses", "Java with Spring", "Engin Demirog", (float) 0.5);
		Category category1 = new Category(1,"Programming");
		
		LessonManager lessonManager = new LessonManager();
		lessonManager.GetName(lesson1);
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.GetName(category1);
		
	}

}
