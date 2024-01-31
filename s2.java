
package yy4;
public class s2 {
    public static String greeting() {
		return "Hello Guest";
	}
	public static String greeting(String name) {
		return "Hello "+name; 
	}
	public static String greeting(String name, String gender) {
		//System.out.println(name);
		//System.out.println(gender);
		if(gender.equals("M") || gender.equals("male") || gender.equals("m") ||gender.equals("Male") || gender.equals("MALE")) {
			return "Hello Mr. "+name;
		}
		if(gender.equals("F")||gender.equals("f")||gender.equals("female")||gender.equals("Female")||gender.equals("Female")) {
			return "Hello Ms. "+name;
		}
		else {
			return "Please mention gender correctly";
		}
	}

}
