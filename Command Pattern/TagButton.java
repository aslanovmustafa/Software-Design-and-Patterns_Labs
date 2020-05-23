public class TagButton {
	String name;
	
	public TagButton(String name) {
	    this.name = name;
	  }
	public void tag() {
		System.out.println(name + " has been tagged to the post!");
	}
	
	public void untag() {
		System.out.println(name + " has been untagged from the post!");
	} 
}
