class GetSet {
	private String name;
	public String getName() { return name; }
	public void setName(String N)
	{
		this.name = N;
	}
}
class person {
	public static void main(String[] args)
	{
		GetSet obj = new GetSet();

		obj.setName("I am rishabh");
		System.out.println(obj.getName());
	}
}