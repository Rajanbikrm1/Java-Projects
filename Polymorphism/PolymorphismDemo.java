public class PolymorphismDemo
{
	public static void main(String[] args)
	{
		Person[] people = new Person[7];

		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);
		people[4] = new Faculty("Hobbs, Joe", "EECS", 4531, "Associate Chair");
		people[5] = new Staff("Harvey, Patrick", "EECS", 4555, 20);
		people[6] = new Faculty("Thomas, Lawrence", "EECS", 6221, "Associate Professor");

		for (Person p : people)
		{
			p.writeOutput();
			System.out.println();
		}
	}
}